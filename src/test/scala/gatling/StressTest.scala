package gatling
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.assertion
import io.gatling.jdbc.Predef._

import scala.concurrent.forkjoin.ThreadLocalRandom

class StressTest extends Simulation{

  object Search {

    val feeder = csv("markets.csv").random

    val search = exec(
      http("Access main")
        .get("https://*****/index.html?country=DE&language=de")
    ).pause(1)
      .feed(feeder)
      .exec(
        http("all - ${Market}")
          .get("https://*****/index.html?country=${Market}&language=${Language}&group=all&subgroup=see-all&view=*****")
      )
      .pause(3)
      .feed(feeder)
      .exec(
        http("alternative - ${Market}")
          .get("https://*****/index.html?country=${Market}&language=${Language}&group=*****&subgroup=see-all&view=*****")
      )
  }



  val httpProtocol = http
    .baseUrl("https://*****/index.html?country=DE&language=de&view=*****")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val users = scenario("Users").exec(Search.search)

  setUp(
    users.inject(
      atOnceUsers(50),
      rampUsers(300).during(2.minutes),
      heavisideUsers(300).during(10.minutes)
    ).protocols(httpProtocol)
  ).assertions(
    global.responseTime.max.between(100, 20000),
    global.successfulRequests.percent.gt(90)
  )

}
