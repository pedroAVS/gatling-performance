package gatling

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LoginTest extends Simulation with HeaderLogin {

	val jsonFileFeeder = jsonFile("test-users.json")

	val httpProtocol = http
		.baseUrl("https://*****.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")

	object Scenario {
		val uri01 = "https://beacon.krxd.net"
		val uri03 = "https://www.google-analytics.com/collect"
		val uri04 = "https://app.usercentrics.eu"
		val uri05 = "https://api.usercentrics.eu/settings/q8Dq1l4vE/latest/pt.json"
		val uri06 = "https://services.me.*****-*****.com/connect-prod/mmc-cccpic-service/mmc/cccpic/api/activeconsentsrequired"
		val uri07 = "https://aggregator.service.usercentrics.eu/aggregate/pt"
		val uri08 = "https://places.*****-*****.com"
		val uri09 = "https://www.googletagmanager.com/gtm.js"
		val uri10 = "https://api.*****.*****-*****.com"
		val uri11 = "https://assets.*****.*****-*****.com"
		val uri12 = "https://cdn.jsdelivr.net/npm"
		val uri13 = "https://cdn.krxd.net"
		val uri14 = "https://www.*****-*****.pt"
		val uri15 = "https://*****ag.d2.sc.omtrdc.net/b/ss/*****pt,*****/1/JS-2.22.0-LBQ1"
		val uri16 = "https://consumer.krxd.net/consent"
		val uri17 = "https://*****de.tt.omtrdc.net/rest/v1/delivery"
		val uri18 = "https://fonts.googleapis.com/css"
		val uri19 = "https://wpp.krxd.net/psegs/f3d459b5-5aae-4a1a-b42c-8d6b106beaa5"

		val scn = scenario("LoginTest")
  		.feed(jsonFileFeeder)
			.exec(http("user: ${username}")
				.get(uri14 + "/?group=all&subgroup=see-all&view=BODYTYPE")
				.headers(headers_0)
				.resources(http("request_1")
					.get(uri09 + "?id=GTM-5WS2663&l=dataLayer_ow")
					.headers(headers_1),
					http("request_2")
						.get(uri14 + "/libs/granite/csrf/token.json")
						.headers(headers_2),
					http("request_3")
						.get(uri14 + "/*****/_jcr_content/logo.noscale.cloudsvg.imageLogo.20180312094632.svg")
						.headers(headers_3),
					http("request_4")
						.get(uri14 + "/*****/_jcr_content/logo.noscale.cloudsvg.imageClaim.20180312094632.svg")
						.headers(headers_3),
					http("request_5")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.0.20190306091031.svg")
						.headers(headers_3),
					http("request_6")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.1.20190306091031.svg")
						.headers(headers_3),
					http("request_7")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.2.20180406144957.svg")
						.headers(headers_3),
					http("request_8")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.3.20180406144957.svg")
						.headers(headers_3),
					http("request_9")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.4.20190730130015.svg")
						.headers(headers_3),
					http("request_10")
						.get(uri14 + "/etc/designs/embxp-wholesale/publish/fonts/*****.woff2?v=023330470591871544")
						.headers(headers_10),
					http("request_11")
						.get(uri04 + "/session/1px.png?settingsId=q8Dq1l4vE")
						.headers(headers_11),
					http("request_12")
						.get(uri05)
						.headers(headers_12),
					http("request_13")
						.get(uri14 + "/bin/*****/public/blank.html")
						.headers(headers_13),
					http("request_14")
						.get(uri14 + "/*****/_jcr_content/*****.payload.json")
						.headers(headers_14),
					http("request_15")
						.get(uri11 + "/plugin/mbmxp/icons/sprite.min.svg")
						.headers(headers_12),
					http("request_16")
						.get(uri04 + "/latest/cdcs-iframe-index.html")
						.headers(headers_16),
					http("request_17")
						.get(uri14 + "/bin/*****/public/blank.html")
						.headers(headers_13),
					http("request_18")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen_1251705686/image.noscale.20200316171718.svg")
						.headers(headers_3),
					http("request_19")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen/image.noscale.20200529115838.svg")
						.headers(headers_3),
					http("request_20")
						.get(uri07 + "?templates=nGKcQgAF@6.2.0,J39GyuWQq@12.4.4,BJ_ocNjds-X@7.1.0,BJf5EjOi-X@12.5.4,UkROORpAd@7.5.0,8L9bkqYbV@9.6.1,BJz7qNsdj-7@15.7.10,WDHZ5U3Y0@1.1.3,iZ8EjfKgU@1.1.1,PlAUsp3NP@1.1.2,8jUniKwJx@1.1.5,9tjzbrfMi@5.1.2,nJgZOQYST@3.1.3,2lPWXFIfh@1.1.2,52KEZJHKQ@8.1.8,HkocEodjb7@52.10.26,uQiyefbRi@15.2.2,B9iVRaMV2@2.0.1,BJ59EidsWQ@25.5.20,H1Vl5NidjWX@40.15.35,GqV8Gv0Kb@1.1.2,BbV__SppQ@1.1.3")
						.headers(headers_12),
					http("request_21")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen_295660298/image.noscale.20200525130132.svg")
						.headers(headers_3),
					http("request_22")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen_1759618167/image.noscale.20200312134144.svg")
						.headers(headers_3),
					http("request_23")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen_652186486/image.noscale.20200312134214.svg")
						.headers(headers_3),
					http("request_24")
						.get(uri19 + "?callback=kruxPsegsCallback")
						.headers(headers_1),
					http("request_25")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel.noscale.20210315132656.svg")
						.headers(headers_3),
					http("request_26")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_2121258505.noscale.20200529120137.svg")
						.headers(headers_3),
					http("request_27")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_751897814.noscale.20210315133121.svg")
						.headers(headers_3),
					http("request_28")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_354019826.noscale.20181109154812.svg")
						.headers(headers_3),
					http("request_29")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_1642249776.noscale.20200317130003.svg")
						.headers(headers_3),
					http("request_30")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_1874000416.noscale.20201120201703.svg")
						.headers(headers_3),
					http("request_31")
						.post(uri15 + "/s16435703350037?AQB=1&ndh=1&pf=1&t=30%2F2%2F2021%2010%3A27%3A36%202%20-60&sdid=1EC5C2A30F420361-668562ADDAE1DED2&mid=68180277085340374943257854797463341594&aamlh=6&ce=UTF-8&ns=*****ag&cdp=2&cl=7776000&pageName=*****&g=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&server=www.*****-*****.pt&aamb=6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y&c1=D%3Dv1&v1=*****&v4=%2F&v5=*****pt%2C*****%7C*****pt%2C*****&c11=2.22.0%7C5.0.1%7C2021-03-29T15%3A24%3A01Z%7C2.19.1&v12=consent_google&v13=prompt&c16=D%3Dv16&v16=aem&v17=PT&v18=pt&v20=MQ6&c21=D%3Dv21&v21=logged%20out&c23=aem%3Ahomebu2&v40=1&c52=1617096456&v54=2021-03-30T10%2B01%3A00%7CTuesday&v55=D%3Dmid&c62=D%3Dv62&v62=*****&c63=page_view&v87=ab-test&v92=965efaeccfa24830ae57029618f84309.37_0&s=3440x1440&c=24&j=1.6&v=N&k=Y&bw=3440&bh=591&mcorgid=433D17FE52A6475D0A490D4C%40AdobeOrg&AQE=1")
						.headers(headers_31),
					http("request_32")
						.get(uri03 + "?v=1&_v=j89&aip=1&a=2067404441&t=pageview&cu=EUR&_s=1&dl=https%3A%2F%2Fwww.*****-*****.pt%2F&ul=en-gb&de=UTF-8&dt=Gama%20de%20Ve%C3%ADculos%20de%20Passageiros%20*****-*****&sd=24-bit&sr=3440x1440&vp=3425x591&je=0&_u=SCCAAEAL~&jid=&gjid=&cid=1695351175.1617016640&tid=UA-175597346-53&_gid=1066772269.1617016640&gtm=2wg3h05WS2663&cg1=homebu2&cd2=*****&cd3=homebu2&cd5=aem&cd6=ab-test&cd8=PT&cd9=Europe&cd10=pt&cd11=121%7C2.19.1&cd12=2021-03-30T10%3A27%3A36%2B01%3A00&cd13=prompt&cd14=MQ6&cd15=1&cd17=logged_out&cd40=User&cd57=realTarget&cd61=group%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&cd1=1695351175.1617016640&z=1592827489")
						.headers(headers_11),
					http("request_33")
						.get(uri13 + "/ctjs/controltag.js.0631b7d64dbbd3656a8b7368ad227a04")
						.headers(headers_1),
					http("request_34")
						.get(uri13 + "/partnerjs/xdi/proxy.3d2100fd7107262ecb55ce6847f01fa5.html")
						.headers(headers_16),
					http("request_35")
						.get("https://places.*****-*****.com//adrum-xd.97655c10e7b91050c0196f6fd1b25fa5.html")
						.headers(headers_16),
					http("request_36")
						.get(uri01 + "/optout_check?request_id=b80f8545-e3a6-469b-8a0d-dc352c553744&callback=Krux.ns.*****portugal.kxjsonp_optOutCheck")
						.headers(headers_1),
					http("request_37")
						.get(uri16 + "/get/f3d459b5-5aae-4a1a-b42c-8d6b106beaa5?request_id=3f4ffa17-8f91-4abe-a401-cad1ecaca6eb&idt=device&dt=kxcookie&callback=Krux.ns.*****portugal.kxjsonp_consent_get_0")
						.headers(headers_1),
					http("request_38")
						.get(uri13 + "/ctjs/controltag.js.0631b7d64dbbd3656a8b7368ad227a04")
						.headers(headers_38),
					http("request_39")
						.get(uri16 + "/set/f3d459b5-5aae-4a1a-b42c-8d6b106beaa5?request_id=cdf40596-ee1e-43b5-bc78-f89b4198266f&idt=device&dt=kxcookie&dc=1&al=1&tg=1&cd=0&sh=0&re=0&callback=Krux.ns.*****portugal.kxjsonp_consent_set_1")
						.headers(headers_1),
					http("request_40")
						.get(uri10 + "/*****-api/v1/data/PT/pt/OWF/live")
						.headers(headers_12),
					http("request_41")
						.post(uri17 + "?client=*****de&sessionId=9760cb287e0d4a92a0f03eaa5e13bbf6&version=2.1.1")
						.headers(headers_41)
						.body(RawFileBody("*****/logintest/0041_request.txt")),
					http("request_42")
						.get(uri13 + "/userdata/get?request_id=d37b8ee1-c615-4091-b52d-a54f3a068b26&pub=f3d459b5-5aae-4a1a-b42c-8d6b106beaa5&technographics=1&callback=Krux.ns.*****portugal.kxjsonp_userdata")
						.headers(headers_1),
					http("request_43")
						.get(uri11 + "/plugin/workbench/assets/2.0.0/icons/arrow-down.svg")
						.headers(headers_12),
					http("request_44")
						.get(uri01 + "/pixel.gif?request_id=8e2ccb5a-0db2-4ee9-8562-aeee72dc7b37&source=smarttag&fired=user_data_timeout&confid=tebt9ouvh&_kpid=f3d459b5-5aae-4a1a-b42c-8d6b106beaa5&_kcp_s=*****-*****.pt&_kcp_d=www.*****-*****.pt&_knifr=4&_kua_kx_lang=en-gb&_kua_kx_tech_browser_language=en-gb&_kua_s_mcvid=68180277085340374943257854797463341594&_kua_kx_whistle=0&_kpa_domain=www.*****-*****.pt&_kpa_s_server=www.*****-*****.pt&_kpa_s_evar1=*****&_kpa_s_evar5=*****pt%2C*****%7C*****pt%2C*****&_kpa_s_prop16=D%3Dv16&_kpa_s_evar16=aem&_kpa_s_evar17=PT&_kpa_s_evar18=pt&_kpa_s_evar20=MQ6&_kpa_s_evar21=logged%20out&_kpa_s_evar55=D%3Dmid&_kpa_s_evar62=*****&_kpa_s_prop63=page_view&_kpa_s_evar87=ab-test&_kpa_s_evar92=965efaeccfa24830ae57029618f84309.37_0&_kpa_s_pagename=*****&_kpa_s_dmp_triggerDELIM=%2C&_kpa_s_eventsDELIM=%2C&_knopii=1&t_navigation_type=1&t_dns=0&t_tcp=0&t_http_request=-1&t_http_response=2&t_content_ready=1010&t_window_load=1571&t_redirect=0&interchange_ran=false&userdata_was_requested=true&userdata_did_respond=false&_kurl_=https%3A%2F%2Fwww.*****-*****.pt%2F*****.html&browser_bucket=Chrome&browser_version=89&sview=11&kplt0=37751&kplt1=37750&kplt2=37752&jsonp_requests=https%3A%2F%2Fbeacon.krxd.net%2Foptout_check%2C220%2Chttps%3A%2F%2Fconsumer.krxd.net%2Fconsent%2Fget%2Ff3d459b5-5aae-4a1a-b42c-8d6b106beaa5%2C201%2Chttps%3A%2F%2Fconsumer.krxd.net%2Fconsent%2Fset%2Ff3d459b5-5aae-4a1a-b42c-8d6b106beaa5%2C168%2Chttps%3A%2F%2Fcdn.krxd.net%2Fuserdata%2Fget%2C166")
						.headers(headers_11),
					http("request_45")
						.get(uri03 + "?v=1&_v=j89&aip=1&a=2067404441&t=event&ni=True&cu=EUR&_s=1&dl=https%3A%2F%2Fwww.*****-*****.pt%2F&ul=en-gb&de=UTF-8&dt=Gama%20de%20Ve%C3%ADculos%20de%20Passageiros%20*****-*****&sd=24-bit&sr=3440x1440&vp=3425x591&je=0&ec=impression&ea=AB%20Test&el=GA-Tracking&_u=SDCEAEALB~&jid=&gjid=&cid=1695351175.1617016640&tid=UA-175597346-53&_gid=1066772269.1617016640&gtm=2wg3h05WS2663&cd2=*****&cd3=homebu2&cd5=ab-test&cd6=aem&cd8=PT&cd9=Europe&cd10=pt&cd11=121%7C&cd12=2021-03-30T10%3A27%3A37%2B01%3A00&cd13=prompt&cd14=MQ6&cd15=1&cd17=logged_out&cd18=aem&cd57=realTarget&cd61=group%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&cd62=AA-Test%7CDCP%7CGA-Tracking%7CControl&cd1=1695351175.1617016640&z=1615562416")
						.headers(headers_11),
					http("request_46")
						.post(uri15 + "/s14832559905447?AQB=1&ndh=1&pf=1&t=30%2F2%2F2021%2010%3A27%3A37%202%20-60&mid=68180277085340374943257854797463341594&aamlh=6&ce=UTF-8&ns=*****ag&cdp=2&cl=7776000&pageName=*****&g=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&server=www.*****-*****.pt&v2=*****&v4=%2F&v5=*****pt%2C*****%7C*****pt%2C*****&c11=2.22.0%7C5.0.1%7C2021-03-29T15%3A24%3A01Z&c16=D%3Dv16&v16=ab-test&v17=PT&v18=pt&v20=MQ6&c21=D%3Dv21&v21=logged%20out&v23=aem&c26=D%3Dv26&v26=GA-Tracking&c27=D%3Dv27&v27=AB%20Test&c52=1617096457&v54=2021-03-30T10%2B01%3A00%7CTuesday&v55=D%3Dmid&c63=link_click&v87=aem&v147=undefined%3A%20undefined&pe=lnk_o&pev2=GA-Tracking&s=3440x1440&c=24&j=1.6&v=N&k=Y&bw=3440&bh=591&mcorgid=433D17FE52A6475D0A490D4C%40AdobeOrg&lrt=2&AQE=1")
						.headers(headers_31),
					http("request_47")
						.get(uri11 + "/plugin/workbench/assets/2.0.0/icons/favorite.svg")
						.headers(headers_12),
					http("request_48")
						.post(uri15 + "/s12251093159711?AQB=1&ndh=1&pf=1&t=30%2F2%2F2021%2010%3A27%3A37%202%20-60&mid=68180277085340374943257854797463341594&aamlh=6&ce=UTF-8&ns=*****ag&cdp=2&cl=7776000&g=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&server=www.*****-*****.pt&v4=%2F&v5=*****pt%2C*****%7C*****pt%2C*****&c11=2.22.0%7C5.0.1%7C2021-03-29T15%3A24%3A01Z&c16=D%3Dv16&v16=ab-test&v17=PT&v18=pt&v20=MQ6&c21=D%3Dv21&v21=logged%20out&c52=1617096457&v54=2021-03-30T10%2B01%3A00%7CTuesday&v55=D%3Dmid&c63=link_click&v87=ab-test&v147=AA-Test_GA-Tracking_Control&pe=lnk_o&pev2=D%3Dv26&s=3440x1440&c=24&j=1.6&v=N&k=Y&bw=3440&bh=591&mcorgid=433D17FE52A6475D0A490D4C%40AdobeOrg&lrt=3&AQE=1")
						.headers(headers_31),
					http("request_49")
						.get(uri01 + "/pixel.gif?request_id=543df4a6-3222-4495-814d-7a717a042339&source=smarttag&fired=ajax&confid=tebt9ouvh&_kpid=f3d459b5-5aae-4a1a-b42c-8d6b106beaa5&_kcp_s=*****-*****.pt&_kcp_d=www.*****-*****.pt&_knifr=4&pageview=false&_kua_kx_lang=en-gb&_kua_kx_tech_browser_language=en-gb&_kua_s_mcvid=68180277085340374943257854797463341594&_kua_kx_whistle=0&_kpa_domain=www.*****-*****.pt&_kpa_s_server=www.*****-*****.pt&_kpa_s_evar1=*****&_kpa_s_evar5=*****pt%2C*****%7C*****pt%2C*****&_kpa_s_prop16=D%3Dv16&_kpa_s_evar16=ab-test&_kpa_s_evar17=PT&_kpa_s_evar18=pt&_kpa_s_evar20=MQ6&_kpa_s_evar21=logged%20out&_kpa_s_evar55=D%3Dmid&_kpa_s_evar62=*****&_kpa_s_prop63=link_click&_kpa_s_evar87=aem&_kpa_s_evar92=965efaeccfa24830ae57029618f84309.37_0&_kpa_s_pagename=*****&_kpa_s_dmp_triggerDELIM=%2C&_kpa_s_eventsDELIM=%2C&_kpa_s_evar2=*****&_kpa_s_evar23=aem&_kpa_s_evar26=GA-Tracking&_kpa_s_evar27=AB%20Test&_kpa_s_dmp_trigger=link_click_%3D21%2Cscroll_50_not_met&_knopii=1&t_navigation_type=1&t_dns=0&t_tcp=0&t_http_request=-1&t_http_response=2&t_content_ready=1010&t_window_load=1571&t_redirect=0&interchange_ran=false&userdata_was_requested=true&userdata_did_respond=false&_kurl_=https%3A%2F%2Fwww.*****-*****.pt%2F*****.html&browser_bucket=Chrome&browser_version=89&sview=12&kplt0=37751&kplt1=37750&kplt2=37752&jsonp_requests=https%3A%2F%2Fbeacon.krxd.net%2Foptout_check%2C220%2Chttps%3A%2F%2Fconsumer.krxd.net%2Fconsent%2Fget%2Ff3d459b5-5aae-4a1a-b42c-8d6b106beaa5%2C201%2Chttps%3A%2F%2Fconsumer.krxd.net%2Fconsent%2Fset%2Ff3d459b5-5aae-4a1a-b42c-8d6b106beaa5%2C168%2Chttps%3A%2F%2Fcdn.krxd.net%2Fuserdata%2Fget%2C166")
						.headers(headers_11),
					http("request_50")
						.get(uri01 + "/optout_check?request_id=9eaa5609-97ff-41c7-a22d-5346bd21d53e&callback=Krux.ns.*****portugal.kxjsonp_optOutCheck")
						.headers(headers_1),
					http("request_51")
						.get(uri01 + "/optout_check?request_id=99dba65f-beb6-4453-8cb6-b41433bf5178&callback=Krux.ns.*****portugal.kxjsonp_optOutCheck")
						.headers(headers_1)))
			.pause(1)
			.exec(http("request_52")
				.get(uri03 + "?v=1&_v=j89&aip=1&a=2067404441&t=event&ni=False&cu=EUR&_s=1&dl=https%3A%2F%2Fwww.*****-*****.pt%2F&ul=en-gb&de=UTF-8&dt=Gama%20de%20Ve%C3%ADculos%20de%20Passageiros%20*****-*****&sd=24-bit&sr=3440x1440&vp=3425x591&je=0&ec=link&ea=main_navi&el=*****_me_login&_u=SDCEAEALB~&jid=&gjid=&cid=1695351175.1617016640&tid=UA-175597346-53&_gid=1066772269.1617016640&gtm=2wg3h05WS2663&cd2=*****&cd3=homebu2&cd5=aem&cd6=ab-test&cd7=https%3A%2F%2Fwww.*****-*****.pt%2Fbin%2F*****%2Fpublic%2Fciam%2Fauthent.html%3Flang%3Dpt_PT&cd8=PT&cd9=Europe&cd10=pt&cd11=121%7C2.19.1&cd12=2021-03-30T10%3A27%3A39%2B01%3A00&cd13=prompt&cd14=MQ6&cd15=1&cd17=logged_out&cd40=User&cd57=realTarget&cd61=group%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&cd1=1695351175.1617016640&z=1723365374")
				.headers(headers_11)
				.resources(http("request_53")
					.post(uri15 + "/s11115447930868?AQB=1&ndh=1&pf=1&t=30%2F2%2F2021%2010%3A27%3A39%202%20-60&mid=68180277085340374943257854797463341594&aamlh=6&ce=UTF-8&ns=*****ag&cdp=2&cl=7776000&g=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&server=www.*****-*****.pt&v2=*****&v4=%2F&v5=*****pt%2C*****%7C*****pt%2C*****&c11=2.22.0%7C5.0.1%7C2021-03-29T15%3A24%3A01Z%7C2.19.1&c16=D%3Dv16&v16=aem&v17=PT&v18=pt&v20=MQ6&c21=D%3Dv21&v21=logged%20out&c26=D%3Dv26&v26=*****_me_login&c27=D%3Dv27&v27=main_navi&v28=https%3A%2F%2Fwww.*****-*****.pt%2Fbin%2F*****%2Fpublic%2Fciam%2Fauthent.html%3Flang%3Dpt_PT&c52=1617096460&v54=2021-03-30T10%2B01%3A00%7CTuesday&v55=D%3Dmid&c63=link_click&v87=ab-test&v147=undefined%3A%20undefined&pe=lnk_o&pev1=https%3A%2F%2Fwww.*****-*****.pt%2Fbin%2F*****%2Fpublic%2Fciam%2Fauthent.html&pev2=*****_me_login&s=3440x1440&c=24&j=1.6&v=N&k=Y&bw=3440&bh=591&mcorgid=433D17FE52A6475D0A490D4C%40AdobeOrg&lrt=1&AQE=1")
					.headers(headers_31),
					http("request_54")
						.get(uri14 + "/bin/*****/public/ciam/authent.html?lang=pt_PT")
						.headers(headers_0),
					http("request_55")
						.get("/as/authorization.oauth2?ui_locales=pt_PT&reg-track-id=99efa44d-f3e9-4b09-b866-4afc8918393e&scope=openid%20email%20phone%20profile%20ciam-uid%20offline_access%20country%20reg-track-id&acr_values=otp%20password&response_type=code&redirect_uri=https%3A%2F%2Fapi.*****.*****-*****.com%2Fcias%2Fv1%2Fauthentication%2Fciam-callback&state=*****-2e2ea456-a907-4006-9586-d3d0b2892cfa&nonce=*****-%EB%B8%80%EE%95%86%E7%A8%BC%EE%9A%AE%E3%BD%85%E8%86%80%E8%88%8E%EC%81%B0%E0%B4%91%EA%8E%B62021-03-30%2009%3A27%3A40.429&prompt=&touchpoint=PT&client_id=0d91f6e6-6d40-463c-a31e-b489ad0c8371")
						.headers(headers_55),
					http("request_56")
						.get(uri18 + "?family=Lato:400,700,400italic,700italic&subset=latin")
						.headers(headers_56),
					http("request_57")
						.get("/ciam/auth/translation/js?lang=pt")
						.headers(headers_57)))
			.pause(10)
			.exec(http("User: ${username}")
				.post("/ciam/auth/login/user")
				.headers(headers_58)
				.body(StringBody(
					"""{
				"username": "${username}"
  			}"""
				)).asJson)
			.pause(10)
			.exec(http("User: ${username} and Pass: ${password}")
				.post("/ciam/auth/login/pass")
				.headers(headers_58)
				.body(StringBody(
					"""{
				"username": "${username}",
				"password": "${password}",
				"rememberMe": ${rememberMe}
  			}"""
				)).asJson
				.resources(http("request_60")
					.post("/as/Aphul/resume/as/authorization.ping")
					.headers(headers_60)
					.formParam("token", "eyJlbmMiOiJBMjU2Q0JDLUhTNTEyIiwia2lkIjoiMTMyOTg4OSIsImFsZyI6IlJTQS1PQUVQLTI1NiIsImN0eSI6IkpXVCJ9.dnjM3u5gbBVJWGEmPVUaSNmvmuFXyfkQokxKbNJqbUQExlwoIfTjWZYvhKfkpoTbp8DB1xP5K-PXePI8oX6ly0LYGhkO-U4wkMhsqs_g3VUlE2sf5qhSIn1vqjnVWYOIxEW7IDqfclVLgQEHSnNmJAY8ZxPmQJoIRyorQ2x5QJyV35XndnNHaiiRPR0rUAWli_1hP7-Wohu15NM_eIYK4tMMWoE8y8sb2htH7SAtQtt2n3lGJNDCIDkuhbmwFiO_8PQd0DKkwxBR0oh9SgKgHd84YXDdqGSZ4Gc7phNhxHlB_0zRePrmQONJ_pzndHQ0qDRpVESKgJldnUR3ul01Sg.jB8_euwWwWVakH8WhYn2mw.CILmRziogoua1zrUZhwnTKiUftLrX--QrT3ALfwGbjwoPLgP6NXPO2WiuOfU6-OmWxdtRwzpHuzSEiVlaO5Cc-P6EVIb8P3g00-FifIWW9Tg91kradl841s9GN-v_gh-0RZ-Badb9U0FKdU5kUkiZ5Dx6RlT60hOSYQnXzDII5RP7Onv7CWUbMMTxJpHHBjKCZztT3ilNFkUCBRkpsXVRbH5LYvObRz7bPeaTwBurpSiapaSQHYai8UTzN2G61WadiOv_CB-JNspDKf9VIg5RFUIaBrTWdQzrmqb4SANZ3VOHniIOdziuU3vskrBH0d01fftJ5TdEVQTD2nTXyKbtYj7RpVoyqP1wkcIvfSNZU5e_dsKOmDfMkLggpLPwlfNP8f2UcLmPVQB_dMITy4PZNFutmEo9KSjxTsKOREZIf9pqFCyaqycKoJcmqxhWmxdBmq_vY6RU-jPEdJsykRd1_zmva7JDpkT23A_RXfS3jWMk3LV5OydX7GRMxcPhAgzWstolZ9Y8m7sCNP5KuNkBMsgMXeOKDc5mH7N8P2o63g0zg5e0P9wG75MwPBw-Cf4-4cnQrDQ7m9TGIQn1WvFZWwLvw8TiEQuFNdLSDokY5UjY4XKR_XBolcI4d36kYZ2yVwpzDdKKA-bPPyg6dH1-m9JprgUYMklH9hGQHJujnCl4G-NI_e5W30vjr7av5-AVV5jxm9KYVe9KoIbHREqUWgXH8Fwr6xhg0_BiHqHQUR5OphfhyDh_nPUZV8vAjhvjPGyJMaS4rvDkk3xQb3M1NKaNEDkaPKcUBMah4nUkgs8NQJBkrI1gWsIsEcfBImQfySep2RV6O-zkhIGqWEZiSg4whU1RkOxRYtcrmw5HOvSfk0_WHeUp08lCO4MreKL.Dx_UwB09GZ1Fkz1dwJMDtU4ZcTAEJNCCdy4wGjnFXoc"),
					http("request_61")
						.get(uri14 + "/libs/granite/csrf/token.json")
						.headers(headers_2),
					http("request_62")
						.get(uri14 + "/?group=all&subgroup=see-all&view=BODYTYPE")
						.headers(headers_62),
					http("request_63")
						.get(uri14 + "/libs/granite/csrf/token.json")
						.headers(headers_2),
					http("request_64")
						.get(uri09 + "?id=GTM-5WS2663&l=dataLayer_ow")
						.headers(headers_1),
					http("request_65")
						.get(uri14 + "/*****/_jcr_content/logo.noscale.cloudsvg.imageLogo.20180312094632.svg")
						.headers(headers_3),
					http("request_66")
						.get(uri14 + "/*****/_jcr_content/logo.noscale.cloudsvg.imageClaim.20180312094632.svg")
						.headers(headers_3),
					http("request_67")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.0.20190306091031.svg")
						.headers(headers_3),
					http("request_68")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.1.20190306091031.svg")
						.headers(headers_3),
					http("request_69")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.2.20180406144957.svg")
						.headers(headers_3),
					http("request_70")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.3.20180406144957.svg")
						.headers(headers_3),
					http("request_71")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.4.20190730130015.svg")
						.headers(headers_3),
					http("request_72")
						.get(uri04 + "/session/1px.png?settingsId=q8Dq1l4vE")
						.headers(headers_11),
					http("request_73")
						.get(uri14 + "/etc/designs/embxp-wholesale/publish/fonts/*****.woff2?v=023330470591871544")
						.headers(headers_10),
					http("request_74")
						.get(uri05)
						.headers(headers_12),
					http("request_75")
						.get(uri14 + "/bin/*****/public/blank.html")
						.headers(headers_13),
					http("request_76")
						.get(uri14 + "/bin/*****/public/logincheck.json?path=/")
						.headers(headers_76),
					http("request_77")
						.get(uri14 + "/*****/_jcr_content/*****.payload.json")
						.headers(headers_14),
					http("request_78")
						.get(uri11 + "/plugin/mbmxp/icons/sprite.min.svg")
						.headers(headers_12),
					http("request_79")
						.get(uri04 + "/latest/cdcs-iframe-index.html")
						.headers(headers_16),
					http("request_80")
						.get(uri07 + "?templates=nGKcQgAF@6.2.0,J39GyuWQq@12.4.4,BJ_ocNjds-X@7.1.0,BJf5EjOi-X@12.5.4,UkROORpAd@7.5.0,8L9bkqYbV@9.6.1,BJz7qNsdj-7@15.7.10,WDHZ5U3Y0@1.1.3,iZ8EjfKgU@1.1.1,PlAUsp3NP@1.1.2,8jUniKwJx@1.1.5,9tjzbrfMi@5.1.2,nJgZOQYST@3.1.3,2lPWXFIfh@1.1.2,52KEZJHKQ@8.1.8,HkocEodjb7@52.10.26,uQiyefbRi@15.2.2,B9iVRaMV2@2.0.1,BJ59EidsWQ@25.5.20,H1Vl5NidjWX@40.15.35,GqV8Gv0Kb@1.1.2,BbV__SppQ@1.1.3")
						.headers(headers_12),
					http("request_81")
						.options(uri10 + "/ucps/v1/users/wkoUserData?countryCode=PT&locale=pt-PT")
						.headers(headers_81),
					http("request_82")
						.get(uri19 + "?callback=kruxPsegsCallback")
						.headers(headers_1),
					http("request_83")
						.get(uri14 + "/bin/*****/public/blank.html")
						.headers(headers_13),
					http("request_84")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen_1251705686/image.noscale.20200316171718.svg")
						.headers(headers_3),
					http("request_85")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen/image.noscale.20200529115838.svg")
						.headers(headers_3),
					http("request_86")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen_295660298/image.noscale.20200525130132.svg")
						.headers(headers_3),
					http("request_87")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen_1759618167/image.noscale.20200312134144.svg")
						.headers(headers_3),
					http("request_88")
						.get(uri10 + "/ucps/v1/users/wkoUserData?countryCode=PT&locale=pt-PT")
						.headers(headers_88),
					http("request_89")
						.get(uri14 + "/*****/content-pool/marketing-pool/nbas/nba-all-models/_jcr_content/par/nextactivitiesboxmodule/par/nextactivitieselemen_652186486/image.noscale.20200312134214.svg")
						.headers(headers_3),
					http("request_90")
						.options(uri10 + "/ucps/v1/users/missingData?locale=pt-PT&countryCode=PT")
						.headers(headers_81),
					http("request_91")
						.options(uri06)
						.headers(headers_91),
					http("request_92")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel.noscale.20210315132656.svg")
						.headers(headers_3),
					http("request_93")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_2121258505.noscale.20200529120137.svg")
						.headers(headers_3),
					http("request_94")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_751897814.noscale.20210315133121.svg")
						.headers(headers_3),
					http("request_95")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_354019826.noscale.20181109154812.svg")
						.headers(headers_3),
					http("request_96")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_1642249776.noscale.20200317130003.svg")
						.headers(headers_3),
					http("request_97")
						.get(uri14 + "/*****/_jcr_content/nextstepnavigationbox/elements/nextstepnavigationel_1874000416.noscale.20201120201703.svg")
						.headers(headers_3),
					http("request_98")
						.post(uri15 + "/s1452625568995?AQB=1&ndh=1&pf=1&t=30%2F2%2F2021%2010%3A28%3A5%202%20-60&sdid=5A83839EED8A7993-31FFA8F78A15D7A5&mid=68180277085340374943257854797463341594&aamlh=6&ce=UTF-8&ns=*****ag&cdp=2&cl=7776000&pageName=*****&g=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&r=https%3A%2F%2Fwww.*****-*****.pt%2Fbin%2F*****%2Fpublic%2Fciam%2Foauth-redirection-uri.html%3Ftoken%3D7f6ad7ee-eb4f-4683-2902-937792cacf1f&server=www.*****-*****.pt&aamb=6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y&c1=D%3Dv1&v1=*****&v4=%2F&v5=*****pt%2C*****%7C*****pt%2C*****&c11=2.22.0%7C5.0.1%7C2021-03-29T15%3A24%3A01Z%7C2.19.1&v12=consent_google&v13=prompt&c16=D%3Dv16&v16=aem&v17=PT&v18=pt&v20=MQ6&c21=D%3Dv21&v21=true&c23=aem%3Ahomebu2&v40=1&c52=1617096486&v54=2021-03-30T10%2B01%3A00%7CTuesday&v55=D%3Dmid&c62=D%3Dv62&v62=*****&c63=page_view&v87=aem&v92=965efaeccfa24830ae57029618f84309.37_0&v140=2021&v143=0&v145=user&s=3440x1440&c=24&j=1.6&v=N&k=Y&bw=3440&bh=591&mcorgid=433D17FE52A6475D0A490D4C%40AdobeOrg&AQE=1")
						.headers(headers_31),
					http("request_99")
						.get(uri13 + "/ctjs/controltag.js.0631b7d64dbbd3656a8b7368ad227a04")
						.headers(headers_1),
					http("request_100")
						.get(uri03 + "?v=1&_v=j89&aip=1&a=1344129392&t=pageview&cu=EUR&_s=1&dl=https%3A%2F%2Fwww.*****-*****.pt%2F&ul=en-gb&de=UTF-8&dt=Gama%20de%20Ve%C3%ADculos%20de%20Passageiros%20*****-*****&sd=24-bit&sr=3440x1440&vp=3425x591&je=0&_u=SCCAAEAL~&jid=&gjid=&cid=1695351175.1617016640&tid=UA-175597346-53&_gid=1066772269.1617016640&gtm=2wg3h05WS2663&cg1=homebu2&cd2=*****&cd3=homebu2&cd5=aem&cd6=aem&cd8=PT&cd9=Europe&cd10=pt&cd11=121%7C2.19.1&cd12=2021-03-30T10%3A28%3A05%2B01%3A00&cd13=prompt&cd14=MQ6&cd15=1&cd17=logged_in&cd40=User&cd57=realTarget&cd59=2021%7C%7C0%7Cno_vehicles&cd61=group%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&cd1=1695351175.1617016640&z=72456147")
						.headers(headers_11),
					http("request_101")
						.get(uri06)
						.headers(headers_101),
					http("request_102")
						.get(uri13 + "/partnerjs/xdi/proxy.3d2100fd7107262ecb55ce6847f01fa5.html")
						.headers(headers_16),
					http("request_103")
						.get(uri01 + "/optout_check?request_id=b43964aa-22b2-4c10-98e4-9e6423d69281&callback=Krux.ns.*****portugal.kxjsonp_optOutCheck")
						.headers(headers_1),
					http("request_104")
						.get(uri13 + "/ctjs/controltag.js.0631b7d64dbbd3656a8b7368ad227a04")
						.headers(headers_38),
					http("request_105")
						.get("https://places.*****-*****.com//adrum-xd.97655c10e7b91050c0196f6fd1b25fa5.html")
						.headers(headers_16),
					http("request_106")
						.get(uri16 + "/get/f3d459b5-5aae-4a1a-b42c-8d6b106beaa5?request_id=18643167-176b-41bc-b114-b891bba69bcb&idt=device&dt=kxcookie&callback=Krux.ns.*****portugal.kxjsonp_consent_get_0")
						.headers(headers_1),
					http("request_107")
						.get(uri16 + "/set/f3d459b5-5aae-4a1a-b42c-8d6b106beaa5?request_id=698f29c1-c3ef-4a6c-80a9-6f91ea889cb7&idt=device&dt=kxcookie&dc=1&al=1&tg=1&cd=0&sh=0&re=0&callback=Krux.ns.*****portugal.kxjsonp_consent_set_1")
						.headers(headers_1),
					http("request_108")
						.post(uri17 + "?client=*****de&sessionId=9760cb287e0d4a92a0f03eaa5e13bbf6&version=2.1.1")
						.headers(headers_41)
						.body(RawFileBody("*****/logintest/0108_request.txt")),
					http("request_109")
						.get(uri13 + "/userdata/get?request_id=fc5e1d3f-ea1d-4cd5-b9a8-cb3b9819affa&pub=f3d459b5-5aae-4a1a-b42c-8d6b106beaa5&technographics=1&callback=Krux.ns.*****portugal.kxjsonp_userdata")
						.headers(headers_1),
					http("request_110")
						.get(uri10 + "/ucps/v1/users/missingData?locale=pt-PT&countryCode=PT")
						.headers(headers_110),
					http("request_111")
						.get(uri14 + "/content/apps/spa-translations/loginChecks/hq/pt.json")
						.headers(headers_111),
					http("request_112")
						.get(uri14 + "/*****/content-pool/tool-pages/*****-me/services/upmc-missingdata.html")
						.headers(headers_62),
					http("request_113")
						.get(uri14 + "/libs/granite/csrf/token.json")
						.headers(headers_2),
					http("request_114")
						.get(uri09 + "?id=GTM-5WS2663&l=dataLayer_ow")
						.headers(headers_1),
					http("request_115")
						.get(uri14 + "/*****/_jcr_content/logo.noscale.cloudsvg.imageLogo.20180312094632.svg")
						.headers(headers_3),
					http("request_116")
						.get(uri14 + "/*****/_jcr_content/logo.noscale.cloudsvg.imageClaim.20180312094632.svg")
						.headers(headers_3),
					http("request_117")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.0.20190306091031.svg")
						.headers(headers_3),
					http("request_118")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.1.20190306091031.svg")
						.headers(headers_3),
					http("request_119")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.2.20180406144957.svg")
						.headers(headers_3),
					http("request_120")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.3.20180406144957.svg")
						.headers(headers_3),
					http("request_121")
						.get(uri14 + "/*****/content-pool/tool-pages/footer-configuration/_jcr_content/footer.noscale.sociallink.4.20190730130015.svg")
						.headers(headers_3),
					http("request_122")
						.get(uri04 + "/session/1px.png?settingsId=q8Dq1l4vE")
						.headers(headers_11),
					http("request_123")
						.get(uri05)
						.headers(headers_12),
					http("request_124")
						.get(uri14 + "/bin/*****/public/blank.html")
						.headers(headers_13),
					http("request_125")
						.get(uri14 + "/bin/*****/public/logincheck.json?path=/*****/content-pool/tool-pages/*****-me/services/upmc-missingdata.html")
						.headers(headers_125),
					http("request_126")
						.get(uri14 + "/*****/content-pool/tool-pages/*****-me/services/upmc-missingdata/_jcr_content/userprofilemanagement.payload.json")
						.headers(headers_14),
					http("request_127")
						.get(uri11 + "/plugin/mbmxp/icons/sprite.min.svg")
						.headers(headers_12),
					http("request_128")
						.get(uri04 + "/latest/cdcs-iframe-index.html")
						.headers(headers_16),
					http("request_129")
						.get(uri07 + "?templates=nGKcQgAF@6.2.0,J39GyuWQq@12.4.4,BJ_ocNjds-X@7.1.0,BJf5EjOi-X@12.5.4,UkROORpAd@7.5.0,8L9bkqYbV@9.6.1,BJz7qNsdj-7@15.7.10,WDHZ5U3Y0@1.1.3,iZ8EjfKgU@1.1.1,PlAUsp3NP@1.1.2,8jUniKwJx@1.1.5,9tjzbrfMi@5.1.2,nJgZOQYST@3.1.3,2lPWXFIfh@1.1.2,52KEZJHKQ@8.1.8,HkocEodjb7@52.10.26,uQiyefbRi@15.2.2,B9iVRaMV2@2.0.1,BJ59EidsWQ@25.5.20,H1Vl5NidjWX@40.15.35,GqV8Gv0Kb@1.1.2,BbV__SppQ@1.1.3")
						.headers(headers_12),
					http("request_130")
						.options(uri10 + "/vcas/v1/users/vehicles/assignments?locale=pt-PT")
						.headers(headers_81),
					http("request_131")
						.get(uri19 + "?callback=kruxPsegsCallback")
						.headers(headers_1),
					http("request_132")
						.get(uri14 + "/bin/*****/public/blank.html")
						.headers(headers_13),
					http("request_133")
						.get(uri10 + "/vcas/v1/users/vehicles/assignments?locale=pt-PT")
						.headers(headers_133),
					http("request_134")
						.get(uri12 + "/jquery@3.4.1")
						.headers(headers_1),
					http("request_135")
						.get(uri12 + "/svg4everybody@2.1.9")
						.headers(headers_1),
					http("request_136")
						.get(uri12 + "/lodash@4.17.14")
						.headers(headers_1),
					http("request_137")
						.post(uri15 + "/s11333289263467?AQB=1&ndh=1&pf=1&t=30%2F2%2F2021%2010%3A28%3A8%202%20-60&sdid=4B659212763AF756-53270C82DB5E3153&mid=68180277085340374943257854797463341594&aamlh=6&ce=UTF-8&ns=*****ag&cdp=2&cl=7776000&pageName=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&g=https%3A%2F%2Fwww.*****-*****.pt%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&r=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&ch=*****&server=www.*****-*****.pt&aamb=6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y&c1=D%3Dv1&v1=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&v4=%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&c5=*****%3Acontent-pool&v5=*****pt%2C*****%7C*****pt%2C*****&c6=*****%3Acontent-pool%3Atool-pages&c7=*****%3Acontent-pool%3Atool-pages%3A*****-me&c8=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices&c11=2.22.0%7C5.0.1%7C2021-03-29T15%3A24%3A01Z%7C2.19.1&v12=consent_google&v13=prompt&c16=D%3Dv16&v16=aem&v17=PT&v18=pt&v20=MQ6&c21=D%3Dv21&v21=true&c23=aem%3AuserProfileUtility&v40=1&c52=1617096488&v54=2021-03-30T10%2B01%3A00%7CTuesday&v55=D%3Dmid&c62=D%3Dv62&v62=*****&c63=page_view&v87=aem&v92=965efaeccfa24830ae57029618f84309.37_0&v140=2021&v143=0&v145=user&s=3440x1440&c=24&j=1.6&v=N&k=Y&bw=3440&bh=591&mcorgid=433D17FE52A6475D0A490D4C%40AdobeOrg&AQE=1")
						.headers(headers_31),
					http("request_138")
						.get(uri11 + "/plugin/upmc/upmc-2.24.0/assets/config/config.json")
						.headers(headers_138),
					http("request_139")
						.get(uri03 + "?v=1&_v=j89&aip=1&a=373692410&t=pageview&cu=EUR&_s=1&dl=https%3A%2F%2Fwww.*****-*****.pt%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&ul=en-gb&de=UTF-8&dt=Introduzir%20dados%20em%20falta&sd=24-bit&sr=3440x1440&vp=3425x591&je=0&_u=SCCAAEAL~&jid=&gjid=&cid=1695351175.1617016640&tid=UA-175597346-53&_gid=1066772269.1617016640&gtm=2wg3h05WS2663&cg1=userProfileUtility&cd2=content-pool.tool-pages.*****-me.services.upmc-missingdata&cd3=userProfileUtility&cd5=aem&cd6=aem&cd8=PT&cd9=Europe&cd10=pt&cd11=121%7C2.19.1&cd12=2021-03-30T10%3A28%3A07%2B01%3A00&cd13=prompt&cd14=MQ6&cd15=1&cd17=logged_in&cd40=User&cd57=realTarget&cd59=2021%7C%7C0%7Cno_vehicles&cd1=1695351175.1617016640&z=1680231087")
						.headers(headers_11),
					http("request_140")
						.get(uri13 + "/ctjs/controltag.js.0631b7d64dbbd3656a8b7368ad227a04")
						.headers(headers_1),
					http("request_141")
						.get(uri11 + "/plugin/upmc/upmc-2.24.0/assets/i18n/en-XX.json")
						.headers(headers_141),
					http("request_142")
						.get(uri11 + "/plugin/upmc/upmc-2.24.0/assets/i18n/pt-PT.json")
						.headers(headers_141),
					http("request_143")
						.get(uri11 + "/plugin/upmc/upmc-2.24.0/assets/market-rules/pt-PT.json")
						.headers(headers_141),
					http("request_144")
						.options(uri10 + "/ucps/v1/users?countryCode=PT&countryRegion=PT&locale=pt-PT")
						.headers(headers_81),
					http("request_145")
						.options(uri10 + "/ucps/v1/users/settings/pin/status?countryCode=PT&countryRegion=PT&locale=pt-PT")
						.headers(headers_81),
					http("request_146")
						.get(uri13 + "/partnerjs/xdi/proxy.3d2100fd7107262ecb55ce6847f01fa5.html")
						.headers(headers_16),
					http("request_147")
						.get("https://places.*****-*****.com//adrum-xd.97655c10e7b91050c0196f6fd1b25fa5.html")
						.headers(headers_16),
					http("request_148")
						.get(uri01 + "/optout_check?request_id=34caf29d-0b2b-4e77-b1fb-82a5297013d4&callback=Krux.ns.*****portugal.kxjsonp_optOutCheck")
						.headers(headers_1),
					http("request_149")
						.get(uri13 + "/ctjs/controltag.js.0631b7d64dbbd3656a8b7368ad227a04")
						.headers(headers_38),
					http("request_150")
						.get(uri16 + "/get/f3d459b5-5aae-4a1a-b42c-8d6b106beaa5?request_id=2c90d302-2516-47f0-b0ab-fe58e1037929&idt=device&dt=kxcookie&callback=Krux.ns.*****portugal.kxjsonp_consent_get_0")
						.headers(headers_1),
					http("request_151")
						.get(uri10 + "/ucps/v1/users/settings/pin/status?countryCode=PT&countryRegion=PT&locale=pt-PT")
						.headers(headers_151),
					http("request_152")
						.post(uri17 + "?client=*****de&sessionId=9760cb287e0d4a92a0f03eaa5e13bbf6&version=2.1.1")
						.headers(headers_41)
						.body(RawFileBody("*****/logintest/0152_request.txt")),
					http("request_153")
						.get(uri16 + "/set/f3d459b5-5aae-4a1a-b42c-8d6b106beaa5?request_id=adc37533-15e4-41bc-98a7-b7a48ab8d74a&idt=device&dt=kxcookie&dc=1&al=1&tg=1&cd=0&sh=0&re=0&callback=Krux.ns.*****portugal.kxjsonp_consent_set_1")
						.headers(headers_1),
					http("request_154")
						.get(uri13 + "/userdata/get?request_id=84643e3e-252e-413b-bb81-410b3b6d1eba&pub=f3d459b5-5aae-4a1a-b42c-8d6b106beaa5&technographics=1&callback=Krux.ns.*****portugal.kxjsonp_userdata")
						.headers(headers_1),
					http("request_155")
						.get(uri01 + "/pixel.gif?request_id=89f8d7ff-3bad-4619-8ff7-42639b667675&source=smarttag&fired=user_data_timeout&confid=tebt9ouvh&_kpid=f3d459b5-5aae-4a1a-b42c-8d6b106beaa5&_kcp_s=*****-*****.pt&_kcp_d=www.*****-*****.pt&_knifr=4&_kpref_=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&_kua_kx_lang=en-gb&_kua_kx_tech_browser_language=en-gb&_kua_s_mcvid=68180277085340374943257854797463341594&_kua_kx_whistle=0&_kpa_url_path_1=*****&_kpa_url_path_2=content-pool&_kpa_url_path_3=tool-pages&_kpa_url_path_4=*****-me&_kpa_url_path_5=services&_kpa_url_path_6=upmc-missingdata&_kpa_domain=www.*****-*****.pt&_kpa_s_server=www.*****-*****.pt&_kpa_s_channel=*****&_kpa_s_evar1=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&_kpa_s_evar5=*****pt%2C*****%7C*****pt%2C*****&_kpa_s_prop16=D%3Dv16&_kpa_s_evar16=aem&_kpa_s_evar17=PT&_kpa_s_evar18=pt&_kpa_s_evar20=MQ6&_kpa_s_evar21=true&_kpa_s_evar55=D%3Dmid&_kpa_s_evar62=*****&_kpa_s_prop63=page_view&_kpa_s_evar87=aem&_kpa_s_evar92=965efaeccfa24830ae57029618f84309.37_0&_kpa_s_pagename=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&_kpa_s_dmp_triggerDELIM=%2C&_kpa_s_eventsDELIM=%2C&_knopii=1&t_navigation_type=0&t_dns=0&t_tcp=0&t_http_request=-1&t_http_response=1&t_content_ready=944&t_window_load=1578&t_redirect=0&interchange_ran=false&userdata_was_requested=true&userdata_did_respond=false&browser_bucket=Chrome&browser_version=89&sview=14&kplt0=37751&kplt1=37750&kplt2=37752&jsonp_requests=https%3A%2F%2Fbeacon.krxd.net%2Foptout_check%2C75%2Chttps%3A%2F%2Fconsumer.krxd.net%2Fconsent%2Fget%2Ff3d459b5-5aae-4a1a-b42c-8d6b106beaa5%2C72%2Chttps%3A%2F%2Fconsumer.krxd.net%2Fconsent%2Fset%2Ff3d459b5-5aae-4a1a-b42c-8d6b106beaa5%2C98%2Chttps%3A%2F%2Fcdn.krxd.net%2Fuserdata%2Fget%2C116")
						.headers(headers_11),
					http("request_156")
						.get(uri01 + "/optout_check?request_id=976f198b-8793-4585-b802-7fe33235893c&callback=Krux.ns.*****portugal.kxjsonp_optOutCheck")
						.headers(headers_1),
					http("request_157")
						.get(uri10 + "/ucps/v1/users?countryCode=PT&countryRegion=PT&locale=pt-PT")
						.headers(headers_157),
					http("request_158")
						.get(uri03 + "?v=1&_v=j89&aip=1&a=373692410&t=event&ni=True&cu=EUR&_s=1&dl=https%3A%2F%2Fwww.*****-*****.pt%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&ul=en-gb&de=UTF-8&dt=Introduzir%20dados%20em%20falta&sd=24-bit&sr=3440x1440&vp=3425x591&je=0&ec=impression&ea=mmu&el=upmc&_u=SDCEAEALB~&jid=&gjid=&cid=1695351175.1617016640&tid=UA-175597346-53&_gid=1066772269.1617016640&gtm=2wg3h05WS2663&cd2=content-pool.tool-pages.*****-me.services.upmc-missingdata&cd3=userProfileUtility&cd5=upmc&cd6=aem&cd8=PT&cd9=Europe&cd10=pt&cd11=121%7C2.24.0&cd12=2021-03-30T10%3A28%3A09%2B01%3A00&cd13=prompt&cd14=MQ6&cd15=1&cd17=logged_in&cd57=realTarget&cd59=2021%7C%7C0%7Cno_vehicles&cd1=1695351175.1617016640&z=1050124066")
						.headers(headers_11),
					http("request_159")
						.get(uri11 + "/global/latest/images/sprites/icons__warning.svg")
						.headers(headers_12),
					http("request_160")
						.get(uri03 + "?v=1&_v=j89&aip=1&a=373692410&t=event&ni=True&cu=EUR&_s=1&dl=https%3A%2F%2Fwww.*****-*****.pt%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&ul=en-gb&de=UTF-8&dt=Introduzir%20dados%20em%20falta&sd=24-bit&sr=3440x1440&vp=3425x591&je=0&ec=impression&ea=mmu&el=upmc_missing_data&_u=SDCEAEALB~&jid=&gjid=&cid=1695351175.1617016640&tid=UA-175597346-53&_gid=1066772269.1617016640&gtm=2wg3h05WS2663&cd2=content-pool.tool-pages.*****-me.services.upmc-missingdata&cd3=userProfileUtility&cd5=upmc&cd6=upmc&cd8=PT&cd9=Europe&cd10=pt&cd11=121%7C2.24.0&cd12=2021-03-30T10%3A28%3A10%2B01%3A00&cd13=prompt&cd14=MQ6&cd15=1&cd17=logged_in&cd57=realTarget&cd59=2021%7C%7C0%7Cno_vehicles&cd1=1695351175.1617016640&z=1145192804")
						.headers(headers_11),
					http("request_161")
						.get(uri11 + "/global/latest/images/sprites/icons__other.svg")
						.headers(headers_12),
					http("request_162")
						.post(uri15 + "/s11946294464504?AQB=1&ndh=1&pf=1&t=30%2F2%2F2021%2010%3A28%3A10%202%20-60&mid=68180277085340374943257854797463341594&aamlh=6&ce=UTF-8&ns=*****ag&cdp=2&cl=7776000&pageName=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&g=https%3A%2F%2Fwww.*****-*****.pt%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&ch=*****&server=www.*****-*****.pt&v2=upmc-missingdata&v4=%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&v5=*****pt%2C*****%7C*****pt%2C*****&c11=2.22.0%7C5.0.1%7C2021-03-29T15%3A24%3A01Z%7C2.24.0&c16=D%3Dv16&v16=upmc&v17=PT&v18=pt&v20=MQ6&c21=D%3Dv21&v21=true&c26=D%3Dv26&v26=upmc_missing_data&c27=D%3Dv27&v27=mmu&c52=1617096490&v54=2021-03-30T10%2B01%3A00%7CTuesday&v55=D%3Dmid&c63=link_click&v87=aem&v147=undefined%3A%20undefined&pe=lnk_o&pev2=upmc&s=3440x1440&c=24&j=1.6&v=N&k=Y&bw=3440&bh=591&mcorgid=433D17FE52A6475D0A490D4C%40AdobeOrg&lrt=2&AQE=1")
						.headers(headers_31),
					http("request_163")
						.post(uri15 + "/s16338156759826?AQB=1&ndh=1&pf=1&t=30%2F2%2F2021%2010%3A28%3A10%202%20-60&mid=68180277085340374943257854797463341594&aamlh=6&ce=UTF-8&ns=*****ag&cdp=2&cl=7776000&g=https%3A%2F%2Fwww.*****-*****.pt%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&ch=*****&server=www.*****-*****.pt&v2=upmc-missingdata&v4=%2F*****%2Fcontent-pool%2Ftool-pages%2F*****-me%2Fservices%2Fupmc-missingdata.html&v5=*****pt%2C*****%7C*****pt%2C*****&c11=2.22.0%7C5.0.1%7C2021-03-29T15%3A24%3A01Z%7C2.24.0&c16=D%3Dv16&v16=upmc&v17=PT&v18=pt&v20=MQ6&c21=D%3Dv21&v21=true&c26=D%3Dv26&v26=upmc_missing_data&c27=D%3Dv27&v27=mmu&c52=1617096490&v54=2021-03-30T10%2B01%3A00%7CTuesday&v55=D%3Dmid&c63=link_click&v87=upmc&v147=undefined%3A%20undefined&pe=lnk_o&pev2=upmc_missing_data&s=3440x1440&c=24&j=1.6&v=N&k=Y&bw=3440&bh=591&mcorgid=433D17FE52A6475D0A490D4C%40AdobeOrg&lrt=2&AQE=1")
						.headers(headers_31),
					http("request_164")
						.get(uri01 + "/pixel.gif?request_id=f896d0e9-b868-4097-a2fb-437a255ec7e9&source=smarttag&fired=ajax&confid=tebt9ouvh&_kpid=f3d459b5-5aae-4a1a-b42c-8d6b106beaa5&_kcp_s=*****-*****.pt&_kcp_d=www.*****-*****.pt&_knifr=4&_kpref_=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&pageview=false&_kua_kx_lang=en-gb&_kua_kx_tech_browser_language=en-gb&_kua_s_mcvid=68180277085340374943257854797463341594&_kua_kx_whistle=0&_kpa_url_path_1=*****&_kpa_url_path_2=content-pool&_kpa_url_path_3=tool-pages&_kpa_url_path_4=*****-me&_kpa_url_path_5=services&_kpa_url_path_6=upmc-missingdata&_kpa_domain=www.*****-*****.pt&_kpa_s_server=www.*****-*****.pt&_kpa_s_channel=*****&_kpa_s_evar1=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&_kpa_s_evar5=*****pt%2C*****%7C*****pt%2C*****&_kpa_s_prop16=D%3Dv16&_kpa_s_evar16=upmc&_kpa_s_evar17=PT&_kpa_s_evar18=pt&_kpa_s_evar20=MQ6&_kpa_s_evar21=true&_kpa_s_evar55=D%3Dmid&_kpa_s_evar62=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&_kpa_s_prop63=link_click&_kpa_s_evar87=upmc&_kpa_s_evar92=965efaeccfa24830ae57029618f84309.37_0&_kpa_s_pagename=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&_kpa_s_dmp_triggerDELIM=%2C&_kpa_s_eventsDELIM=%2C&_kpa_s_evar2=upmc-missingdata&_kpa_s_evar26=upmc_missing_data&_kpa_s_evar27=mmu&_kpa_s_dmp_trigger=link_click_%3D24%2Cscroll_50_not_met&_knopii=1&t_navigation_type=0&t_dns=0&t_tcp=0&t_http_request=-1&t_http_response=1&t_content_ready=944&t_window_load=1578&t_redirect=0&interchange_ran=false&userdata_was_requested=true&userdata_did_respond=false&browser_bucket=Chrome&browser_version=89&sview=15&kplt0=37751&kplt1=37750&kplt2=37752&jsonp_requests=https%3A%2F%2Fbeacon.krxd.net%2Foptout_check%2C75%2Chttps%3A%2F%2Fconsumer.krxd.net%2Fconsent%2Fget%2Ff3d459b5-5aae-4a1a-b42c-8d6b106beaa5%2C72%2Chttps%3A%2F%2Fconsumer.krxd.net%2Fconsent%2Fset%2Ff3d459b5-5aae-4a1a-b42c-8d6b106beaa5%2C98%2Chttps%3A%2F%2Fcdn.krxd.net%2Fuserdata%2Fget%2C116%2Chttps%3A%2F%2Fbeacon.krxd.net%2Foptout_check%2C53")
						.headers(headers_11),
					http("request_165")
						.get(uri01 + "/pixel.gif?request_id=39ebd76c-df22-4fa9-aa22-ea986a851f38&source=smarttag&fired=ajax&confid=tebt9ouvh&_kpid=f3d459b5-5aae-4a1a-b42c-8d6b106beaa5&_kcp_s=*****-*****.pt&_kcp_d=www.*****-*****.pt&_knifr=4&_kpref_=https%3A%2F%2Fwww.*****-*****.pt%2F%3Fgroup%3Dall%26subgroup%3Dsee-all%26view%3DBODYTYPE&pageview=false&_kua_kx_lang=en-gb&_kua_kx_tech_browser_language=en-gb&_kua_s_mcvid=68180277085340374943257854797463341594&_kua_kx_whistle=0&_kpa_url_path_1=*****&_kpa_url_path_2=content-pool&_kpa_url_path_3=tool-pages&_kpa_url_path_4=*****-me&_kpa_url_path_5=services&_kpa_url_path_6=upmc-missingdata&_kpa_domain=www.*****-*****.pt&_kpa_s_server=www.*****-*****.pt&_kpa_s_channel=*****&_kpa_s_evar1=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&_kpa_s_evar5=*****pt%2C*****%7C*****pt%2C*****&_kpa_s_prop16=D%3Dv16&_kpa_s_evar16=upmc&_kpa_s_evar17=PT&_kpa_s_evar18=pt&_kpa_s_evar20=MQ6&_kpa_s_evar21=true&_kpa_s_evar55=D%3Dmid&_kpa_s_evar62=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&_kpa_s_prop63=link_click&_kpa_s_evar87=upmc&_kpa_s_evar92=965efaeccfa24830ae57029618f84309.37_0&_kpa_s_pagename=*****%3Acontent-pool%3Atool-pages%3A*****-me%3Aservices%3Aupmc-missingdata&_kpa_s_dmp_triggerDELIM=%2C&_kpa_s_eventsDELIM=%2C&_kpa_s_evar2=upmc-missingdata&_kpa_s_evar26=upmc_missing_data&_kpa_s_evar27=mmu&_kpa_s_dmp_trigger=link_click_%3D24%2Cscroll_50_not_met&_knopii=1&t_navigation_type=0&t_dns=0&t_tcp=0&t_http_request=-1&t_http_response=1&t_content_ready=944&t_window_load=1578&t_redirect=0&interchange_ran=false&userdata_was_requested=true&userdata_did_respond=false&browser_bucket=Chrome&browser_version=89&sview=16&kplt0=37751&kplt1=37750&kplt2=37752")
						.headers(headers_11),
					http("request_166")
						.get(uri01 + "/optout_check?request_id=58888b2b-92b6-44e5-9cc2-613fac5d2e30&callback=Krux.ns.*****portugal.kxjsonp_optOutCheck")
						.headers(headers_1),
					http("request_167")
						.get(uri01 + "/optout_check?request_id=17628fe4-7b65-4c10-b68b-8dd08df6a272&callback=Krux.ns.*****portugal.kxjsonp_optOutCheck")
						.headers(headers_1)))
			.pause(6)
			.exec(http("request_168")
				.post(uri08 + "/eumcollector/beacons/browser/v1/EUM-AAB-AZM/adrum")
				.headers(headers_41)
				.body(RawFileBody("*****/logintest/0168_request.txt")))
	}

	val login = scenario("login").exec(Scenario.scn)

	setUp(login.inject(
		atOnceUsers(3)
	)).protocols(httpProtocol)
}