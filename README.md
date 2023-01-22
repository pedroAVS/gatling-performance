Gatling Performance tests
=========================

--- 
# Preparation

## Install
Scala 2.12.10 SDK
Scala plugin (available in IntelliJ)

----

To test it out, simply execute the following command:

    $mvn gatling:test -Dgatling.simulationClass=gatling.StressTest

or to run all the tests, simply:

    $mvn gatling:test


---------

# Run

Run a specific test with the following command:\
`$mvn gatling:test -Dgatling.simulationClass=sample.BasicSimulation`

Or run all the existing tests:\
`mvn gatling:test`

Expected output:
```
[INFO] Scanning for projects...
(...)
Simulation sample.BasicSimulation started...
(...)
[INFO] BUILD SUCCESS
```

Third option, you can run `Engine` and follow the asked steps (Select which test to run and Add a description)

Expected output:
```
Choose a simulation number:
     [0] sample.BasicSimulation
     [1] sample.DemoClosedModel
     [2] sample.DemoOpenModel
(...)
Select run description (optional)
(...)     
```

#Simulation Setup
This is where you define the load you want to inject to your server

## Injection

### Open vs Closed Workload Models
* Closed systems, where you control the concurrent number of users
* Open Systems, where you control the arrival rate of users

Closed system are system where the number of concurrent users is capped. At full capacity, a new user can effectively enter the system only once another exits.

Typical systems that behave this way are:

* call center where all operators are busy
* ticketing websites where users get placed into a queue when the system is at full capacity

On the contrary, open systems have no control over the number of concurrent users: users keep on arriving even though applications have trouble serving them. Most websites behave this way.



### Open Model Scenarios

```
setUp(
  scn.inject(
    nothingFor(4.seconds), // 1
    atOnceUsers(10), // 2
    rampUsers(10).during(5.seconds), // 3
    constantUsersPerSec(20).during(15.seconds), // 4
    constantUsersPerSec(20).during(15.seconds).randomized, // 5
    rampUsersPerSec(10).to(20).during(10.minutes), // 6
    rampUsersPerSec(10).to(20).during(10.minutes).randomized, // 7
    heavisideUsers(1000).during(20.seconds) // 8
  ).protocols(httpProtocol)
)
```
The building blocks for profile injection the way you want are:

1. nothingFor(duration): Pause for a given duration.
2. atOnceUsers(nbUsers): Injects a given number of users at once.
3. rampUsers(nbUsers) during(duration): Injects a given number of users distributed evenly on a time window of a given duration.
4. constantUsersPerSec(rate) during(duration): Injects users at a constant rate, defined in users per second, during a given duration. Users will be injected at regular intervals.
5. constantUsersPerSec(rate) during(duration) randomized: Injects users at a constant rate, defined in users per second, during a given duration. Users will be injected at randomized intervals.
6. rampUsersPerSec(rate1) to (rate2) during(duration): Injects users from starting rate to target rate, defined in users per second, during a given duration. Users will be injected at regular intervals.
7. rampUsersPerSec(rate1) to(rate2) during(duration) randomized: Injects users from starting rate to target rate, defined in users per second, during a given duration. Users will be injected at randomized intervals.
8. heavisideUsers(nbUsers) during(duration): Injects a given number of users following a smooth approximation of the heaviside step function stretched to a given duration.

### Closed Model Scenarios

```
setUp(
  scn.inject(
    constantConcurrentUsers(10).during(10.seconds), // 1
    rampConcurrentUsers(10).to(20).during(10.seconds) // 2
  )
)
```

1. constantConcurrentUsers(nbUsers) during(duration): Inject so that number of concurrent users in the system is constant
2. rampConcurrentUsers(fromNbUsers) to(toNbUsers) during(duration): Inject so that number of concurrent users in the system ramps linearly from a number to another


## Assertions

### Scope

* `global`: use statistics calculated from all requests.
* `forAll`: use statistics calculated for each individual request.
* `details(path)`: use statistics calculated from a group or a request. The path is defined like a Unix filesystem path.

### Statistics

* `responseTime`: target the response time in milliseconds.
* `allRequests`: target the number of requests.
* `failedRequests`: target the number of failed requests.
* `successfulRequests`: target the number of successful requests.
* `requestsPerSec`: target the rate of requests per second.

### Metrics

* `min`: perform the assertion on the minimum of the metric.
* `max`: perform the assertion on the maximum of the metric.
* `mean`: perform the assertion on the mean of the metric.
* `stdDev`: perform the assertion on the standard deviation of the metric.
* `percentile1`: perform the assertion on the 1st percentile of the metric, as configured in gatling.conf (default is 50th).
* `percentile2`: perform the assertion on the 2nd percentile of the metric, as configured in gatling.conf (default is 75th).
* `percentile3`: perform the assertion on the 3rd percentile of the metric, as configured in gatling.conf (default is 95th).
* `percentile4`: perform the assertion on the 4th percentile of the metric, as configured in gatling.conf (default is 99th).
* `percentile(value: Double)`: perform the assertion on the given percentile of the metric. Parameter is a percentage, between 0 and 100.

### Condition

* `lt(threshold)`: check that the value of the metric is less than the threshold.
* `lte(threshold)`: check that the value of the metric is less than or equal to the threshold.
* `gt(threshold)`: check that the value of the metric is greater than the threshold.
* `gte(threshold)`: check that the value of the metric is greater than or equal to the threshold.
* `between(thresholdMin, thresholdMax)`: check that the value of the metric is between two thresholds.
* `between(thresholdMin, thresholdMax, inclusive = false)`: same as above but doesn’t include bounds
* `around(value, plusOrMinus)`: check that the value of the metric is around a target value plus or minus a given margin.
* `around(value, plusOrMinus, inclusive = false)`: same as above but doesn’t include bounds
* `deviatesAround(target, percentDeviationThreshold)`: check that metric is around a target value plus or minus a given relative margin
* `deviatesAround(target, percentDeviationThreshold, inclusive = false)`: same as above but doesn’t include bounds
* `is(value)`: check that the value of the metric is equal to the given value.
* `in(sequence)`: check that the value of metric is in a sequence.

## Putting it all together

Assert that the max response time of all requests is less than 100 ms\
`setUp(scn).assertions(global.responseTime.max.lt(100))`

Assert that every request has no more than 5% of failing requests\
`setUp(scn).assertions(forAll.failedRequests.percent.lte(5))`

Assert that the percentage of failed requests named "MyRequest" in the group "MyGroup" is exactly 0 %\
`setUp(scn).assertions(details("MyGroup" / "MyRequest").failedRequests.percent.is(0))`

Assert that the rate of requests per seconds for the group "MyGroup"\
`setUp(scn).assertions(details("MyGroup").requestsPerSec.between(100, 1000))`


# Recorder

Gatling offers a "recorder" to automatically generate the requests generated to your application while the user is navigating in the page
Here you can choose to omit all the static resources or to include them to the tests.
If you simply want to focus on the dynamic side of the application under test - the server side code - then you should disable the static resources
If you want to measure the entire application to make sure it does indeed work the way it's supposed to, then keep the static resources.

Ex of static resources: `.js .css .gif .jpeg .png`

> :warning: **If you can't run the Recorder class**:
> * Open project structure
> * Platform Settings -> Global Libraries
> * make sure you have Scala SDK 2.12.10 added

# Report

Finally, you can check the automatically generated report number on `target/gatling/lastRun.txt`
and open `index.html` of the respective folder\
ex: `target/gatling/basicsimulation-20210520(...)/index.html`

---
---

## Gatling Documentation
https://gatling.io/docs/current/general/

## Gatling Cheat Sheet
https://gatling.io/docs/current/cheat-sheet/

------

## Newman dependency

We use newman to run the Zephyr API for test management on JIRA
````
mvn exec:exec -Dexec.executable="npm" -Dexec.args="install"

mvn exec:exec -Dexec.executable="node_modules/newman/bin/newman.js" -Dexec.args="run *****_PERFORMANCE.postman_collection.json -e ADAPTAVIST-API.postman_environment.json --folder PASS"

mvn exec:exec -Dexec.executable="node_modules/newman/bin/newman.js" -Dexec.args="run *****_PERFORMANCE.postman_collection.json -e ADAPTAVIST-API.postman_environment.json --folder FAIL"
````