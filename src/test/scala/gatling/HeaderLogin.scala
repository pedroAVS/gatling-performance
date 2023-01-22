package gatling

import io.gatling.http.Predef.http

trait HeaderLogin {

  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_1 = Map(
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_2 = Map(
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_3 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_10 = Map(
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "font",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_11 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_12 = Map(
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_13 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "iframe",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "upgrade-insecure-requests" -> "1")

  val headers_14 = Map(
    "accept" -> "application/json, text/javascript, */*; q=0.01",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-requested-with" -> "XMLHttpRequest")

  val headers_16 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "iframe",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1")

  val headers_31 = Map(
    "content-type" -> "text/plain;charset=UTF-8",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_38 = Map(
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_41 = Map(
    "content-type" -> "text/plain",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_55 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_56 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "style",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_57 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_58 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Cache-Control" -> "no-cache",
    "Content-Type" -> "application/json; charset=UTF-8",
    "Origin" -> "https://id.*****-*****.com",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_60 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Cache-Control" -> "no-cache",
    "Origin" -> "https://id.*****-*****.com",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_62 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "upgrade-insecure-requests" -> "1")

  val headers_76 = Map(
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-applicationname" -> "Logincheck",
    "x-trackingid" -> "da1ffe3587eec2f7")

  val headers_81 = Map(
    "access-control-request-headers" -> "authorization,x-applicationname,x-trackingid",
    "access-control-request-method" -> "GET",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_88 = Map(
    "authorization" -> "Bearer eyJhbGciOiJSU0EtT0FFUC0yNTYiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoiYWxwaGEiLCJjdHkiOiJKV1QifQ.N-Tmaqv9dh9uznub_6xe4ngA4Q2hQzJ4i5egy3MOkWVpoISxiyxfUgO18k1pdZoAVRC4lCBMqUAufRxAbIrdJF02LRYx2GXb-q3RoJ6e_s8Fu_DeyjnI0WgeDbLlpbQrNmWvsD957KB5IHAhGRtX4k06mjfucOM_9RwFKITCv4EJjhByEePIBo0QZH908hZNIGFvSvB3UBOj89opY62xFdAzl6mQo5fOusKjTASCh9-XcRhGW7mpKhS7i93i2MBZKAPeHC0XkEhWc1jUdhAcmsDb5_fgoHl7di_ruUwhri8UNz8vsDqcf5AVlDKB4XwsO5jpGAgP1wF6gicquuQf0g.3-4luI-jFeqQc077HWr_Bg.xVCMFlKYfz_x-sRuexaitC-_6BEQbHOKanvM2Brnd8jQSo7DoBvINqw8punoxF_W_64_WQV-9haft4jeb5Rb4vZWZ2UlNJbBdrp6Bju5W8QvPq-eaHcRCx5uFS40PvJsq8RA4i4X9IzNHETObvjAZ_1aYFRduzFj9kGwdBkOHQSysGqIcP-qhi6qg9zZOO7CXnEEbiMBgtUdY7gCJJpPOk5YD1Ne8G-tKYHqwCLa_0Haa484xw68z9xMj8_qbGdVinIf5PN_XeyiyTI2_0HFBdz6GAzekfi-Dm41PgV0IYNXR-u_v_iG-2YLZPjWM3e4q4hTKpgoCPtE_j4EyITbmlbRhr8S13zxihIiH5lca7RtPKsWLSco-ChNCJ2l4UHoum8jl4rccJXeudvpMABX5rU_2lui5a5IAfThp_-d-wkwYyqbG_m11wGom6SDN2GZtloM1pW2lUMJ_tHoEOtEIiXclldgPi6i32Xey-Zq9F6fPPhv2AK0dWf9GrhoHgqRa3I67mNRsYfRN6SFZjJBEOKx4JyFQbPHRA5nVF7yLldv8146qmxUIaziueEILHJjGp9ipqSPvy0DsQ9Modr694Oudyam4gwX49jII1VWYNZqcSRR2-VjlV13wsSEivsdZmNEkT7kImMuc7g6w6QPgc4TV4zXJoIY2CFU6PpoPSzmttbVi9X7N35GcKyp3xUg4i14Da22B9IfEw3fStDOI825TQKo1qtUQMXWR2kuC46CaJs4Zk7J6sVF7gDdlBUZknCx-w9fG1NGLFLWNFDwlF3hLXXxzlPsCxOXF5u8OrnFhx8iIhGzfKRKUet7aZYKJFlcQwreWeWoY08PRSRwyK4b5Ehji-RlnSZ2V0Q0dH2vVERyLQtzYTnEbSzHaaleqGU2bcnyzvnzJnS6prTN0MedqZQv2H-TCyhidDB5UlXUCixBkYRucJ3m5YxpHG9x2XiD_wvhz7Tq9NdN_K0joVqNFZO9cMQ50UYoQDPwyei57QdROSpErZpKGmCDJLXSz_uubzGXez3yKRjTp1nglZgtvbZxL2WndloMatlnxttvEd5W4ULBK0qESUQf_u_q90RWCPP5FDxkEpsH-gd0J0Nta_CLjH6Y9bm3Xx6jPoER6sy4G5F3_9TGrFK1hJU_R8TblcTWh2eo0PVIoFhzXQzmiKRvbqqyNahId48EJnpShCocQE1fBg6yD69K5__9w6zbhyImSFBf8wEp86PRw7y7i3Yme3brG-LZCpcrDjWZDaCcOIkO1_js73H9jcahyuse6ZMeZGQxWvDq8-MnqOys1sBTXmb_96UB98HQBpOZjXePQIDtQqcq3Qk_KtXwvMGAeJgae1bzCGjjrTzkKGLh-ohAkPSr7egNaQV5vBAvf7wyQqTXATBPfEr-XEWnDN0mSC0ZZ5LeHawxZESB5KWK2ZNidQwwWjdpGvKsSD6-_ol3Bi2hUPLPAGBlcSw80M9g40rxOLTIXkynVihI5E7GQ4mbdsUQo521CBM7XRuq88FtLDY3fu_8FGvGULQBGxGzrv2lW7Sv5EiuufupbeH3TZEXhuOmnNjBdJbNI0dbK2WXnbXCcPVgICDoDQoqmUctorFnVY4dHdPgCpRwMx3X_Iy3ty-WpoF0g5Omio3LSizGgZN98zSIkDe68xVs1YsNrvzDNohoi2n0_Uj3lctdUAwr5E3kLxtyqmfwkyoeP1bZmQWtZtwF0unpIaVkpN1UvvLlnWez9_lBDcKpvovMpJEH6bqHwRBSFgA5UiG1gJxzABetWWNrs-k5ox4vYb82jiu6SzJ63_71KLMPDuCgRGzMzZSCUvbC0TvLkYoOgVnS8uoUoEiFBih42D7znVgYYrzXo-dHpWEIxYUGtX-wF5PuHb-Guzx01uLZbFebSxVyGzdbnYmueVdOkTMU5_NH79L1GOfi6JGVbL4-tkweN79kBgjGDIpAIzevwPI0wsmM9MzcEuTPbTqHzHFYNpzzofUWnW6DyHW5eNUoyn-xdwY96W1kQSI8yQ0R6ftabFkdIuGzmS--J3w9e57K3LKBPpN0NpTzv1ME0_XAyXVxIt65MpJEwExe70N347D_LiF_A5vPlPVTuefWO-M0YgEjN7Dlcbif8TTIXpBEoFrSaKnHfir5LCDnImq2WS7WC2EyjOh7S8cE9UPaU6DSlRwzU_pCD9JXxZjMda-wSClo1aBNwFKqmMhAPHIvfMiosOpseVShfw-GHRrof86CqH6kseUQM8FJJ8C4ECF51U3b4WZYs6bW6ry5uzdiaceyKGNax6v9QCuT8eIGH3sdqio-1qclc3eB83juWTPCRU9dq_hMpO0TusFEvuTPRzmwW0WIwQmFMq9XSG2DbxjXZQwe9oXsZqJiozo6EAx4dSy8a2hU3_kYX3jJxDoqhCrgsd0mWAOtnKMZlEV0h3iT_XyxPP5nR-4f3rTmrqMW_onnE5CyYpqwQfZINL9ekQ4pisXo3K91UG5f6Csl39cbha4vgtgKp9q0AGeg6Q5UbcnX2J44o1wUQtjbxIHaUISodD4bszH2z7kp7dIl-pyL0RlGPao-euSKl4HEfIkr3M_J8yKPeERNDlf_gRCgaWGjeY3DZFDkhkR4MW5HAPjIza2welqk9t7btceryG1AiFLu4exXYBOMQGKz1E0KkiO1SeQwWz6IakPdfKi6E8jMqfndoGWtDZM7XvHa-NGyIlJOyLzCRo98Z_ZbGwPR46dPKjhN_rmDckeWdS9SlcpGp4hXKuKLS4aiPOMJE1vjBnhzTMO8e54tg8A272x40Et4T1v3LsiLCkcfHy-Zl8CBhXCcNr10ZmYp0om007bqaDeMqVm3UEi4QfvQn3J008XBQfJJx6tX-ASwTEkwRnEWPnoa7ZusC7XlQiUYwUtRaDmmd-HYdlNrw86U25mvtjRqnOtesigJUrYGzeb569I2LbKx9ePHnyHyX6P4VZlG4acyIsn1cGs0qTFoJA1CklYyw7rtmppOl9XZ7J_dstYGaVY5odoLKphdzC91tQfP4Pyg7vwr9e7vDhl2ZBGXbvlb-y0GSePurVid4ixWz94ri43Vsgq0Ph4JcSSLf2G_KECmj-vHAK8syi8s95fdbd8o6GKAUepFveO0FQUHsLvQzrfPB590kvbuTyOrrxwKMSOi_xFYghj_InEUXtwsUeEpBdmepfcf_X8gr2Cf9kJxbvosLg2n0RX8pFo4KIKWrZf-MB3O9XZaXSmnNGARH_trmqr9qpkED98p_coaykbm8VTWX9XDlao-yreZ6O3Z6zL5F559nCiz8BcbOQ_yU94.4cEqQaiWfqUrlk6HPKQKmw",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "x-applicationname" -> "Logincheck",
    "x-trackingid" -> "3bca47526d6cc69a")

  val headers_91 = Map(
    "Access-Control-Request-Headers" -> "authorization-jwe,content-type,mmc-market,x-applicationname,x-trackingid",
    "Access-Control-Request-Method" -> "GET",
    "Cache-Control" -> "no-cache",
    "Origin" -> "https://www.*****-*****.pt",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_101 = Map(
    "Cache-Control" -> "no-cache",
    "Content-Type" -> "application/json",
    "MMC-Market" -> "PT",
    "Origin" -> "https://www.*****-*****.pt",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site",
    "X-ApplicationName" -> "Logincheck",
    "X-TrackingId" -> "9693ba80107ba773",
    "authorization-jwe" -> "Bearer eyJhbGciOiJSU0EtT0FFUC0yNTYiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoiYWxwaGEiLCJjdHkiOiJKV1QifQ.N-Tmaqv9dh9uznub_6xe4ngA4Q2hQzJ4i5egy3MOkWVpoISxiyxfUgO18k1pdZoAVRC4lCBMqUAufRxAbIrdJF02LRYx2GXb-q3RoJ6e_s8Fu_DeyjnI0WgeDbLlpbQrNmWvsD957KB5IHAhGRtX4k06mjfucOM_9RwFKITCv4EJjhByEePIBo0QZH908hZNIGFvSvB3UBOj89opY62xFdAzl6mQo5fOusKjTASCh9-XcRhGW7mpKhS7i93i2MBZKAPeHC0XkEhWc1jUdhAcmsDb5_fgoHl7di_ruUwhri8UNz8vsDqcf5AVlDKB4XwsO5jpGAgP1wF6gicquuQf0g.3-4luI-jFeqQc077HWr_Bg.xVCMFlKYfz_x-sRuexaitC-_6BEQbHOKanvM2Brnd8jQSo7DoBvINqw8punoxF_W_64_WQV-9haft4jeb5Rb4vZWZ2UlNJbBdrp6Bju5W8QvPq-eaHcRCx5uFS40PvJsq8RA4i4X9IzNHETObvjAZ_1aYFRduzFj9kGwdBkOHQSysGqIcP-qhi6qg9zZOO7CXnEEbiMBgtUdY7gCJJpPOk5YD1Ne8G-tKYHqwCLa_0Haa484xw68z9xMj8_qbGdVinIf5PN_XeyiyTI2_0HFBdz6GAzekfi-Dm41PgV0IYNXR-u_v_iG-2YLZPjWM3e4q4hTKpgoCPtE_j4EyITbmlbRhr8S13zxihIiH5lca7RtPKsWLSco-ChNCJ2l4UHoum8jl4rccJXeudvpMABX5rU_2lui5a5IAfThp_-d-wkwYyqbG_m11wGom6SDN2GZtloM1pW2lUMJ_tHoEOtEIiXclldgPi6i32Xey-Zq9F6fPPhv2AK0dWf9GrhoHgqRa3I67mNRsYfRN6SFZjJBEOKx4JyFQbPHRA5nVF7yLldv8146qmxUIaziueEILHJjGp9ipqSPvy0DsQ9Modr694Oudyam4gwX49jII1VWYNZqcSRR2-VjlV13wsSEivsdZmNEkT7kImMuc7g6w6QPgc4TV4zXJoIY2CFU6PpoPSzmttbVi9X7N35GcKyp3xUg4i14Da22B9IfEw3fStDOI825TQKo1qtUQMXWR2kuC46CaJs4Zk7J6sVF7gDdlBUZknCx-w9fG1NGLFLWNFDwlF3hLXXxzlPsCxOXF5u8OrnFhx8iIhGzfKRKUet7aZYKJFlcQwreWeWoY08PRSRwyK4b5Ehji-RlnSZ2V0Q0dH2vVERyLQtzYTnEbSzHaaleqGU2bcnyzvnzJnS6prTN0MedqZQv2H-TCyhidDB5UlXUCixBkYRucJ3m5YxpHG9x2XiD_wvhz7Tq9NdN_K0joVqNFZO9cMQ50UYoQDPwyei57QdROSpErZpKGmCDJLXSz_uubzGXez3yKRjTp1nglZgtvbZxL2WndloMatlnxttvEd5W4ULBK0qESUQf_u_q90RWCPP5FDxkEpsH-gd0J0Nta_CLjH6Y9bm3Xx6jPoER6sy4G5F3_9TGrFK1hJU_R8TblcTWh2eo0PVIoFhzXQzmiKRvbqqyNahId48EJnpShCocQE1fBg6yD69K5__9w6zbhyImSFBf8wEp86PRw7y7i3Yme3brG-LZCpcrDjWZDaCcOIkO1_js73H9jcahyuse6ZMeZGQxWvDq8-MnqOys1sBTXmb_96UB98HQBpOZjXePQIDtQqcq3Qk_KtXwvMGAeJgae1bzCGjjrTzkKGLh-ohAkPSr7egNaQV5vBAvf7wyQqTXATBPfEr-XEWnDN0mSC0ZZ5LeHawxZESB5KWK2ZNidQwwWjdpGvKsSD6-_ol3Bi2hUPLPAGBlcSw80M9g40rxOLTIXkynVihI5E7GQ4mbdsUQo521CBM7XRuq88FtLDY3fu_8FGvGULQBGxGzrv2lW7Sv5EiuufupbeH3TZEXhuOmnNjBdJbNI0dbK2WXnbXCcPVgICDoDQoqmUctorFnVY4dHdPgCpRwMx3X_Iy3ty-WpoF0g5Omio3LSizGgZN98zSIkDe68xVs1YsNrvzDNohoi2n0_Uj3lctdUAwr5E3kLxtyqmfwkyoeP1bZmQWtZtwF0unpIaVkpN1UvvLlnWez9_lBDcKpvovMpJEH6bqHwRBSFgA5UiG1gJxzABetWWNrs-k5ox4vYb82jiu6SzJ63_71KLMPDuCgRGzMzZSCUvbC0TvLkYoOgVnS8uoUoEiFBih42D7znVgYYrzXo-dHpWEIxYUGtX-wF5PuHb-Guzx01uLZbFebSxVyGzdbnYmueVdOkTMU5_NH79L1GOfi6JGVbL4-tkweN79kBgjGDIpAIzevwPI0wsmM9MzcEuTPbTqHzHFYNpzzofUWnW6DyHW5eNUoyn-xdwY96W1kQSI8yQ0R6ftabFkdIuGzmS--J3w9e57K3LKBPpN0NpTzv1ME0_XAyXVxIt65MpJEwExe70N347D_LiF_A5vPlPVTuefWO-M0YgEjN7Dlcbif8TTIXpBEoFrSaKnHfir5LCDnImq2WS7WC2EyjOh7S8cE9UPaU6DSlRwzU_pCD9JXxZjMda-wSClo1aBNwFKqmMhAPHIvfMiosOpseVShfw-GHRrof86CqH6kseUQM8FJJ8C4ECF51U3b4WZYs6bW6ry5uzdiaceyKGNax6v9QCuT8eIGH3sdqio-1qclc3eB83juWTPCRU9dq_hMpO0TusFEvuTPRzmwW0WIwQmFMq9XSG2DbxjXZQwe9oXsZqJiozo6EAx4dSy8a2hU3_kYX3jJxDoqhCrgsd0mWAOtnKMZlEV0h3iT_XyxPP5nR-4f3rTmrqMW_onnE5CyYpqwQfZINL9ekQ4pisXo3K91UG5f6Csl39cbha4vgtgKp9q0AGeg6Q5UbcnX2J44o1wUQtjbxIHaUISodD4bszH2z7kp7dIl-pyL0RlGPao-euSKl4HEfIkr3M_J8yKPeERNDlf_gRCgaWGjeY3DZFDkhkR4MW5HAPjIza2welqk9t7btceryG1AiFLu4exXYBOMQGKz1E0KkiO1SeQwWz6IakPdfKi6E8jMqfndoGWtDZM7XvHa-NGyIlJOyLzCRo98Z_ZbGwPR46dPKjhN_rmDckeWdS9SlcpGp4hXKuKLS4aiPOMJE1vjBnhzTMO8e54tg8A272x40Et4T1v3LsiLCkcfHy-Zl8CBhXCcNr10ZmYp0om007bqaDeMqVm3UEi4QfvQn3J008XBQfJJx6tX-ASwTEkwRnEWPnoa7ZusC7XlQiUYwUtRaDmmd-HYdlNrw86U25mvtjRqnOtesigJUrYGzeb569I2LbKx9ePHnyHyX6P4VZlG4acyIsn1cGs0qTFoJA1CklYyw7rtmppOl9XZ7J_dstYGaVY5odoLKphdzC91tQfP4Pyg7vwr9e7vDhl2ZBGXbvlb-y0GSePurVid4ixWz94ri43Vsgq0Ph4JcSSLf2G_KECmj-vHAK8syi8s95fdbd8o6GKAUepFveO0FQUHsLvQzrfPB590kvbuTyOrrxwKMSOi_xFYghj_InEUXtwsUeEpBdmepfcf_X8gr2Cf9kJxbvosLg2n0RX8pFo4KIKWrZf-MB3O9XZaXSmnNGARH_trmqr9qpkED98p_coaykbm8VTWX9XDlao-yreZ6O3Z6zL5F559nCiz8BcbOQ_yU94.4cEqQaiWfqUrlk6HPKQKmw",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_110 = Map(
    "authorization" -> "Bearer eyJhbGciOiJSU0EtT0FFUC0yNTYiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoiYWxwaGEiLCJjdHkiOiJKV1QifQ.N-Tmaqv9dh9uznub_6xe4ngA4Q2hQzJ4i5egy3MOkWVpoISxiyxfUgO18k1pdZoAVRC4lCBMqUAufRxAbIrdJF02LRYx2GXb-q3RoJ6e_s8Fu_DeyjnI0WgeDbLlpbQrNmWvsD957KB5IHAhGRtX4k06mjfucOM_9RwFKITCv4EJjhByEePIBo0QZH908hZNIGFvSvB3UBOj89opY62xFdAzl6mQo5fOusKjTASCh9-XcRhGW7mpKhS7i93i2MBZKAPeHC0XkEhWc1jUdhAcmsDb5_fgoHl7di_ruUwhri8UNz8vsDqcf5AVlDKB4XwsO5jpGAgP1wF6gicquuQf0g.3-4luI-jFeqQc077HWr_Bg.xVCMFlKYfz_x-sRuexaitC-_6BEQbHOKanvM2Brnd8jQSo7DoBvINqw8punoxF_W_64_WQV-9haft4jeb5Rb4vZWZ2UlNJbBdrp6Bju5W8QvPq-eaHcRCx5uFS40PvJsq8RA4i4X9IzNHETObvjAZ_1aYFRduzFj9kGwdBkOHQSysGqIcP-qhi6qg9zZOO7CXnEEbiMBgtUdY7gCJJpPOk5YD1Ne8G-tKYHqwCLa_0Haa484xw68z9xMj8_qbGdVinIf5PN_XeyiyTI2_0HFBdz6GAzekfi-Dm41PgV0IYNXR-u_v_iG-2YLZPjWM3e4q4hTKpgoCPtE_j4EyITbmlbRhr8S13zxihIiH5lca7RtPKsWLSco-ChNCJ2l4UHoum8jl4rccJXeudvpMABX5rU_2lui5a5IAfThp_-d-wkwYyqbG_m11wGom6SDN2GZtloM1pW2lUMJ_tHoEOtEIiXclldgPi6i32Xey-Zq9F6fPPhv2AK0dWf9GrhoHgqRa3I67mNRsYfRN6SFZjJBEOKx4JyFQbPHRA5nVF7yLldv8146qmxUIaziueEILHJjGp9ipqSPvy0DsQ9Modr694Oudyam4gwX49jII1VWYNZqcSRR2-VjlV13wsSEivsdZmNEkT7kImMuc7g6w6QPgc4TV4zXJoIY2CFU6PpoPSzmttbVi9X7N35GcKyp3xUg4i14Da22B9IfEw3fStDOI825TQKo1qtUQMXWR2kuC46CaJs4Zk7J6sVF7gDdlBUZknCx-w9fG1NGLFLWNFDwlF3hLXXxzlPsCxOXF5u8OrnFhx8iIhGzfKRKUet7aZYKJFlcQwreWeWoY08PRSRwyK4b5Ehji-RlnSZ2V0Q0dH2vVERyLQtzYTnEbSzHaaleqGU2bcnyzvnzJnS6prTN0MedqZQv2H-TCyhidDB5UlXUCixBkYRucJ3m5YxpHG9x2XiD_wvhz7Tq9NdN_K0joVqNFZO9cMQ50UYoQDPwyei57QdROSpErZpKGmCDJLXSz_uubzGXez3yKRjTp1nglZgtvbZxL2WndloMatlnxttvEd5W4ULBK0qESUQf_u_q90RWCPP5FDxkEpsH-gd0J0Nta_CLjH6Y9bm3Xx6jPoER6sy4G5F3_9TGrFK1hJU_R8TblcTWh2eo0PVIoFhzXQzmiKRvbqqyNahId48EJnpShCocQE1fBg6yD69K5__9w6zbhyImSFBf8wEp86PRw7y7i3Yme3brG-LZCpcrDjWZDaCcOIkO1_js73H9jcahyuse6ZMeZGQxWvDq8-MnqOys1sBTXmb_96UB98HQBpOZjXePQIDtQqcq3Qk_KtXwvMGAeJgae1bzCGjjrTzkKGLh-ohAkPSr7egNaQV5vBAvf7wyQqTXATBPfEr-XEWnDN0mSC0ZZ5LeHawxZESB5KWK2ZNidQwwWjdpGvKsSD6-_ol3Bi2hUPLPAGBlcSw80M9g40rxOLTIXkynVihI5E7GQ4mbdsUQo521CBM7XRuq88FtLDY3fu_8FGvGULQBGxGzrv2lW7Sv5EiuufupbeH3TZEXhuOmnNjBdJbNI0dbK2WXnbXCcPVgICDoDQoqmUctorFnVY4dHdPgCpRwMx3X_Iy3ty-WpoF0g5Omio3LSizGgZN98zSIkDe68xVs1YsNrvzDNohoi2n0_Uj3lctdUAwr5E3kLxtyqmfwkyoeP1bZmQWtZtwF0unpIaVkpN1UvvLlnWez9_lBDcKpvovMpJEH6bqHwRBSFgA5UiG1gJxzABetWWNrs-k5ox4vYb82jiu6SzJ63_71KLMPDuCgRGzMzZSCUvbC0TvLkYoOgVnS8uoUoEiFBih42D7znVgYYrzXo-dHpWEIxYUGtX-wF5PuHb-Guzx01uLZbFebSxVyGzdbnYmueVdOkTMU5_NH79L1GOfi6JGVbL4-tkweN79kBgjGDIpAIzevwPI0wsmM9MzcEuTPbTqHzHFYNpzzofUWnW6DyHW5eNUoyn-xdwY96W1kQSI8yQ0R6ftabFkdIuGzmS--J3w9e57K3LKBPpN0NpTzv1ME0_XAyXVxIt65MpJEwExe70N347D_LiF_A5vPlPVTuefWO-M0YgEjN7Dlcbif8TTIXpBEoFrSaKnHfir5LCDnImq2WS7WC2EyjOh7S8cE9UPaU6DSlRwzU_pCD9JXxZjMda-wSClo1aBNwFKqmMhAPHIvfMiosOpseVShfw-GHRrof86CqH6kseUQM8FJJ8C4ECF51U3b4WZYs6bW6ry5uzdiaceyKGNax6v9QCuT8eIGH3sdqio-1qclc3eB83juWTPCRU9dq_hMpO0TusFEvuTPRzmwW0WIwQmFMq9XSG2DbxjXZQwe9oXsZqJiozo6EAx4dSy8a2hU3_kYX3jJxDoqhCrgsd0mWAOtnKMZlEV0h3iT_XyxPP5nR-4f3rTmrqMW_onnE5CyYpqwQfZINL9ekQ4pisXo3K91UG5f6Csl39cbha4vgtgKp9q0AGeg6Q5UbcnX2J44o1wUQtjbxIHaUISodD4bszH2z7kp7dIl-pyL0RlGPao-euSKl4HEfIkr3M_J8yKPeERNDlf_gRCgaWGjeY3DZFDkhkR4MW5HAPjIza2welqk9t7btceryG1AiFLu4exXYBOMQGKz1E0KkiO1SeQwWz6IakPdfKi6E8jMqfndoGWtDZM7XvHa-NGyIlJOyLzCRo98Z_ZbGwPR46dPKjhN_rmDckeWdS9SlcpGp4hXKuKLS4aiPOMJE1vjBnhzTMO8e54tg8A272x40Et4T1v3LsiLCkcfHy-Zl8CBhXCcNr10ZmYp0om007bqaDeMqVm3UEi4QfvQn3J008XBQfJJx6tX-ASwTEkwRnEWPnoa7ZusC7XlQiUYwUtRaDmmd-HYdlNrw86U25mvtjRqnOtesigJUrYGzeb569I2LbKx9ePHnyHyX6P4VZlG4acyIsn1cGs0qTFoJA1CklYyw7rtmppOl9XZ7J_dstYGaVY5odoLKphdzC91tQfP4Pyg7vwr9e7vDhl2ZBGXbvlb-y0GSePurVid4ixWz94ri43Vsgq0Ph4JcSSLf2G_KECmj-vHAK8syi8s95fdbd8o6GKAUepFveO0FQUHsLvQzrfPB590kvbuTyOrrxwKMSOi_xFYghj_InEUXtwsUeEpBdmepfcf_X8gr2Cf9kJxbvosLg2n0RX8pFo4KIKWrZf-MB3O9XZaXSmnNGARH_trmqr9qpkED98p_coaykbm8VTWX9XDlao-yreZ6O3Z6zL5F559nCiz8BcbOQ_yU94.4cEqQaiWfqUrlk6HPKQKmw",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "x-applicationname" -> "Logincheck",
    "x-trackingid" -> "c95c0584ae9cdaf3")

  val headers_111 = Map(
    "adrum" -> "isAjax:true",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_125 = Map(
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-applicationname" -> "Logincheck",
    "x-trackingid" -> "737d6d802f11394c")

  val headers_133 = Map(
    "authorization" -> "Bearer eyJhbGciOiJSU0EtT0FFUC0yNTYiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoiYWxwaGEiLCJjdHkiOiJKV1QifQ.N-Tmaqv9dh9uznub_6xe4ngA4Q2hQzJ4i5egy3MOkWVpoISxiyxfUgO18k1pdZoAVRC4lCBMqUAufRxAbIrdJF02LRYx2GXb-q3RoJ6e_s8Fu_DeyjnI0WgeDbLlpbQrNmWvsD957KB5IHAhGRtX4k06mjfucOM_9RwFKITCv4EJjhByEePIBo0QZH908hZNIGFvSvB3UBOj89opY62xFdAzl6mQo5fOusKjTASCh9-XcRhGW7mpKhS7i93i2MBZKAPeHC0XkEhWc1jUdhAcmsDb5_fgoHl7di_ruUwhri8UNz8vsDqcf5AVlDKB4XwsO5jpGAgP1wF6gicquuQf0g.3-4luI-jFeqQc077HWr_Bg.xVCMFlKYfz_x-sRuexaitC-_6BEQbHOKanvM2Brnd8jQSo7DoBvINqw8punoxF_W_64_WQV-9haft4jeb5Rb4vZWZ2UlNJbBdrp6Bju5W8QvPq-eaHcRCx5uFS40PvJsq8RA4i4X9IzNHETObvjAZ_1aYFRduzFj9kGwdBkOHQSysGqIcP-qhi6qg9zZOO7CXnEEbiMBgtUdY7gCJJpPOk5YD1Ne8G-tKYHqwCLa_0Haa484xw68z9xMj8_qbGdVinIf5PN_XeyiyTI2_0HFBdz6GAzekfi-Dm41PgV0IYNXR-u_v_iG-2YLZPjWM3e4q4hTKpgoCPtE_j4EyITbmlbRhr8S13zxihIiH5lca7RtPKsWLSco-ChNCJ2l4UHoum8jl4rccJXeudvpMABX5rU_2lui5a5IAfThp_-d-wkwYyqbG_m11wGom6SDN2GZtloM1pW2lUMJ_tHoEOtEIiXclldgPi6i32Xey-Zq9F6fPPhv2AK0dWf9GrhoHgqRa3I67mNRsYfRN6SFZjJBEOKx4JyFQbPHRA5nVF7yLldv8146qmxUIaziueEILHJjGp9ipqSPvy0DsQ9Modr694Oudyam4gwX49jII1VWYNZqcSRR2-VjlV13wsSEivsdZmNEkT7kImMuc7g6w6QPgc4TV4zXJoIY2CFU6PpoPSzmttbVi9X7N35GcKyp3xUg4i14Da22B9IfEw3fStDOI825TQKo1qtUQMXWR2kuC46CaJs4Zk7J6sVF7gDdlBUZknCx-w9fG1NGLFLWNFDwlF3hLXXxzlPsCxOXF5u8OrnFhx8iIhGzfKRKUet7aZYKJFlcQwreWeWoY08PRSRwyK4b5Ehji-RlnSZ2V0Q0dH2vVERyLQtzYTnEbSzHaaleqGU2bcnyzvnzJnS6prTN0MedqZQv2H-TCyhidDB5UlXUCixBkYRucJ3m5YxpHG9x2XiD_wvhz7Tq9NdN_K0joVqNFZO9cMQ50UYoQDPwyei57QdROSpErZpKGmCDJLXSz_uubzGXez3yKRjTp1nglZgtvbZxL2WndloMatlnxttvEd5W4ULBK0qESUQf_u_q90RWCPP5FDxkEpsH-gd0J0Nta_CLjH6Y9bm3Xx6jPoER6sy4G5F3_9TGrFK1hJU_R8TblcTWh2eo0PVIoFhzXQzmiKRvbqqyNahId48EJnpShCocQE1fBg6yD69K5__9w6zbhyImSFBf8wEp86PRw7y7i3Yme3brG-LZCpcrDjWZDaCcOIkO1_js73H9jcahyuse6ZMeZGQxWvDq8-MnqOys1sBTXmb_96UB98HQBpOZjXePQIDtQqcq3Qk_KtXwvMGAeJgae1bzCGjjrTzkKGLh-ohAkPSr7egNaQV5vBAvf7wyQqTXATBPfEr-XEWnDN0mSC0ZZ5LeHawxZESB5KWK2ZNidQwwWjdpGvKsSD6-_ol3Bi2hUPLPAGBlcSw80M9g40rxOLTIXkynVihI5E7GQ4mbdsUQo521CBM7XRuq88FtLDY3fu_8FGvGULQBGxGzrv2lW7Sv5EiuufupbeH3TZEXhuOmnNjBdJbNI0dbK2WXnbXCcPVgICDoDQoqmUctorFnVY4dHdPgCpRwMx3X_Iy3ty-WpoF0g5Omio3LSizGgZN98zSIkDe68xVs1YsNrvzDNohoi2n0_Uj3lctdUAwr5E3kLxtyqmfwkyoeP1bZmQWtZtwF0unpIaVkpN1UvvLlnWez9_lBDcKpvovMpJEH6bqHwRBSFgA5UiG1gJxzABetWWNrs-k5ox4vYb82jiu6SzJ63_71KLMPDuCgRGzMzZSCUvbC0TvLkYoOgVnS8uoUoEiFBih42D7znVgYYrzXo-dHpWEIxYUGtX-wF5PuHb-Guzx01uLZbFebSxVyGzdbnYmueVdOkTMU5_NH79L1GOfi6JGVbL4-tkweN79kBgjGDIpAIzevwPI0wsmM9MzcEuTPbTqHzHFYNpzzofUWnW6DyHW5eNUoyn-xdwY96W1kQSI8yQ0R6ftabFkdIuGzmS--J3w9e57K3LKBPpN0NpTzv1ME0_XAyXVxIt65MpJEwExe70N347D_LiF_A5vPlPVTuefWO-M0YgEjN7Dlcbif8TTIXpBEoFrSaKnHfir5LCDnImq2WS7WC2EyjOh7S8cE9UPaU6DSlRwzU_pCD9JXxZjMda-wSClo1aBNwFKqmMhAPHIvfMiosOpseVShfw-GHRrof86CqH6kseUQM8FJJ8C4ECF51U3b4WZYs6bW6ry5uzdiaceyKGNax6v9QCuT8eIGH3sdqio-1qclc3eB83juWTPCRU9dq_hMpO0TusFEvuTPRzmwW0WIwQmFMq9XSG2DbxjXZQwe9oXsZqJiozo6EAx4dSy8a2hU3_kYX3jJxDoqhCrgsd0mWAOtnKMZlEV0h3iT_XyxPP5nR-4f3rTmrqMW_onnE5CyYpqwQfZINL9ekQ4pisXo3K91UG5f6Csl39cbha4vgtgKp9q0AGeg6Q5UbcnX2J44o1wUQtjbxIHaUISodD4bszH2z7kp7dIl-pyL0RlGPao-euSKl4HEfIkr3M_J8yKPeERNDlf_gRCgaWGjeY3DZFDkhkR4MW5HAPjIza2welqk9t7btceryG1AiFLu4exXYBOMQGKz1E0KkiO1SeQwWz6IakPdfKi6E8jMqfndoGWtDZM7XvHa-NGyIlJOyLzCRo98Z_ZbGwPR46dPKjhN_rmDckeWdS9SlcpGp4hXKuKLS4aiPOMJE1vjBnhzTMO8e54tg8A272x40Et4T1v3LsiLCkcfHy-Zl8CBhXCcNr10ZmYp0om007bqaDeMqVm3UEi4QfvQn3J008XBQfJJx6tX-ASwTEkwRnEWPnoa7ZusC7XlQiUYwUtRaDmmd-HYdlNrw86U25mvtjRqnOtesigJUrYGzeb569I2LbKx9ePHnyHyX6P4VZlG4acyIsn1cGs0qTFoJA1CklYyw7rtmppOl9XZ7J_dstYGaVY5odoLKphdzC91tQfP4Pyg7vwr9e7vDhl2ZBGXbvlb-y0GSePurVid4ixWz94ri43Vsgq0Ph4JcSSLf2G_KECmj-vHAK8syi8s95fdbd8o6GKAUepFveO0FQUHsLvQzrfPB590kvbuTyOrrxwKMSOi_xFYghj_InEUXtwsUeEpBdmepfcf_X8gr2Cf9kJxbvosLg2n0RX8pFo4KIKWrZf-MB3O9XZaXSmnNGARH_trmqr9qpkED98p_coaykbm8VTWX9XDlao-yreZ6O3Z6zL5F559nCiz8BcbOQ_yU94.4cEqQaiWfqUrlk6HPKQKmw",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "x-applicationname" -> "Logincheck",
    "x-trackingid" -> "6786bbf9d4bdd711")

  val headers_138 = Map(
    "accept" -> "application/json, text/javascript, */*; q=0.01",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_141 = Map(
    "accept" -> "application/json, text/plain, */*",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_151 = Map(
    "accept" -> "application/json, text/plain, */*",
    "authorization" -> "Bearer eyJhbGciOiJSU0EtT0FFUC0yNTYiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoiYWxwaGEiLCJjdHkiOiJKV1QifQ.N-Tmaqv9dh9uznub_6xe4ngA4Q2hQzJ4i5egy3MOkWVpoISxiyxfUgO18k1pdZoAVRC4lCBMqUAufRxAbIrdJF02LRYx2GXb-q3RoJ6e_s8Fu_DeyjnI0WgeDbLlpbQrNmWvsD957KB5IHAhGRtX4k06mjfucOM_9RwFKITCv4EJjhByEePIBo0QZH908hZNIGFvSvB3UBOj89opY62xFdAzl6mQo5fOusKjTASCh9-XcRhGW7mpKhS7i93i2MBZKAPeHC0XkEhWc1jUdhAcmsDb5_fgoHl7di_ruUwhri8UNz8vsDqcf5AVlDKB4XwsO5jpGAgP1wF6gicquuQf0g.3-4luI-jFeqQc077HWr_Bg.xVCMFlKYfz_x-sRuexaitC-_6BEQbHOKanvM2Brnd8jQSo7DoBvINqw8punoxF_W_64_WQV-9haft4jeb5Rb4vZWZ2UlNJbBdrp6Bju5W8QvPq-eaHcRCx5uFS40PvJsq8RA4i4X9IzNHETObvjAZ_1aYFRduzFj9kGwdBkOHQSysGqIcP-qhi6qg9zZOO7CXnEEbiMBgtUdY7gCJJpPOk5YD1Ne8G-tKYHqwCLa_0Haa484xw68z9xMj8_qbGdVinIf5PN_XeyiyTI2_0HFBdz6GAzekfi-Dm41PgV0IYNXR-u_v_iG-2YLZPjWM3e4q4hTKpgoCPtE_j4EyITbmlbRhr8S13zxihIiH5lca7RtPKsWLSco-ChNCJ2l4UHoum8jl4rccJXeudvpMABX5rU_2lui5a5IAfThp_-d-wkwYyqbG_m11wGom6SDN2GZtloM1pW2lUMJ_tHoEOtEIiXclldgPi6i32Xey-Zq9F6fPPhv2AK0dWf9GrhoHgqRa3I67mNRsYfRN6SFZjJBEOKx4JyFQbPHRA5nVF7yLldv8146qmxUIaziueEILHJjGp9ipqSPvy0DsQ9Modr694Oudyam4gwX49jII1VWYNZqcSRR2-VjlV13wsSEivsdZmNEkT7kImMuc7g6w6QPgc4TV4zXJoIY2CFU6PpoPSzmttbVi9X7N35GcKyp3xUg4i14Da22B9IfEw3fStDOI825TQKo1qtUQMXWR2kuC46CaJs4Zk7J6sVF7gDdlBUZknCx-w9fG1NGLFLWNFDwlF3hLXXxzlPsCxOXF5u8OrnFhx8iIhGzfKRKUet7aZYKJFlcQwreWeWoY08PRSRwyK4b5Ehji-RlnSZ2V0Q0dH2vVERyLQtzYTnEbSzHaaleqGU2bcnyzvnzJnS6prTN0MedqZQv2H-TCyhidDB5UlXUCixBkYRucJ3m5YxpHG9x2XiD_wvhz7Tq9NdN_K0joVqNFZO9cMQ50UYoQDPwyei57QdROSpErZpKGmCDJLXSz_uubzGXez3yKRjTp1nglZgtvbZxL2WndloMatlnxttvEd5W4ULBK0qESUQf_u_q90RWCPP5FDxkEpsH-gd0J0Nta_CLjH6Y9bm3Xx6jPoER6sy4G5F3_9TGrFK1hJU_R8TblcTWh2eo0PVIoFhzXQzmiKRvbqqyNahId48EJnpShCocQE1fBg6yD69K5__9w6zbhyImSFBf8wEp86PRw7y7i3Yme3brG-LZCpcrDjWZDaCcOIkO1_js73H9jcahyuse6ZMeZGQxWvDq8-MnqOys1sBTXmb_96UB98HQBpOZjXePQIDtQqcq3Qk_KtXwvMGAeJgae1bzCGjjrTzkKGLh-ohAkPSr7egNaQV5vBAvf7wyQqTXATBPfEr-XEWnDN0mSC0ZZ5LeHawxZESB5KWK2ZNidQwwWjdpGvKsSD6-_ol3Bi2hUPLPAGBlcSw80M9g40rxOLTIXkynVihI5E7GQ4mbdsUQo521CBM7XRuq88FtLDY3fu_8FGvGULQBGxGzrv2lW7Sv5EiuufupbeH3TZEXhuOmnNjBdJbNI0dbK2WXnbXCcPVgICDoDQoqmUctorFnVY4dHdPgCpRwMx3X_Iy3ty-WpoF0g5Omio3LSizGgZN98zSIkDe68xVs1YsNrvzDNohoi2n0_Uj3lctdUAwr5E3kLxtyqmfwkyoeP1bZmQWtZtwF0unpIaVkpN1UvvLlnWez9_lBDcKpvovMpJEH6bqHwRBSFgA5UiG1gJxzABetWWNrs-k5ox4vYb82jiu6SzJ63_71KLMPDuCgRGzMzZSCUvbC0TvLkYoOgVnS8uoUoEiFBih42D7znVgYYrzXo-dHpWEIxYUGtX-wF5PuHb-Guzx01uLZbFebSxVyGzdbnYmueVdOkTMU5_NH79L1GOfi6JGVbL4-tkweN79kBgjGDIpAIzevwPI0wsmM9MzcEuTPbTqHzHFYNpzzofUWnW6DyHW5eNUoyn-xdwY96W1kQSI8yQ0R6ftabFkdIuGzmS--J3w9e57K3LKBPpN0NpTzv1ME0_XAyXVxIt65MpJEwExe70N347D_LiF_A5vPlPVTuefWO-M0YgEjN7Dlcbif8TTIXpBEoFrSaKnHfir5LCDnImq2WS7WC2EyjOh7S8cE9UPaU6DSlRwzU_pCD9JXxZjMda-wSClo1aBNwFKqmMhAPHIvfMiosOpseVShfw-GHRrof86CqH6kseUQM8FJJ8C4ECF51U3b4WZYs6bW6ry5uzdiaceyKGNax6v9QCuT8eIGH3sdqio-1qclc3eB83juWTPCRU9dq_hMpO0TusFEvuTPRzmwW0WIwQmFMq9XSG2DbxjXZQwe9oXsZqJiozo6EAx4dSy8a2hU3_kYX3jJxDoqhCrgsd0mWAOtnKMZlEV0h3iT_XyxPP5nR-4f3rTmrqMW_onnE5CyYpqwQfZINL9ekQ4pisXo3K91UG5f6Csl39cbha4vgtgKp9q0AGeg6Q5UbcnX2J44o1wUQtjbxIHaUISodD4bszH2z7kp7dIl-pyL0RlGPao-euSKl4HEfIkr3M_J8yKPeERNDlf_gRCgaWGjeY3DZFDkhkR4MW5HAPjIza2welqk9t7btceryG1AiFLu4exXYBOMQGKz1E0KkiO1SeQwWz6IakPdfKi6E8jMqfndoGWtDZM7XvHa-NGyIlJOyLzCRo98Z_ZbGwPR46dPKjhN_rmDckeWdS9SlcpGp4hXKuKLS4aiPOMJE1vjBnhzTMO8e54tg8A272x40Et4T1v3LsiLCkcfHy-Zl8CBhXCcNr10ZmYp0om007bqaDeMqVm3UEi4QfvQn3J008XBQfJJx6tX-ASwTEkwRnEWPnoa7ZusC7XlQiUYwUtRaDmmd-HYdlNrw86U25mvtjRqnOtesigJUrYGzeb569I2LbKx9ePHnyHyX6P4VZlG4acyIsn1cGs0qTFoJA1CklYyw7rtmppOl9XZ7J_dstYGaVY5odoLKphdzC91tQfP4Pyg7vwr9e7vDhl2ZBGXbvlb-y0GSePurVid4ixWz94ri43Vsgq0Ph4JcSSLf2G_KECmj-vHAK8syi8s95fdbd8o6GKAUepFveO0FQUHsLvQzrfPB590kvbuTyOrrxwKMSOi_xFYghj_InEUXtwsUeEpBdmepfcf_X8gr2Cf9kJxbvosLg2n0RX8pFo4KIKWrZf-MB3O9XZaXSmnNGARH_trmqr9qpkED98p_coaykbm8VTWX9XDlao-yreZ6O3Z6zL5F559nCiz8BcbOQ_yU94.4cEqQaiWfqUrlk6HPKQKmw",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "x-applicationname" -> "upmc-connect",
    "x-trackingid" -> "DwI5wmr1A6rHI6L5nL8Yorw4lJ7FLPfx")

  val headers_157 = Map(
    "accept" -> "application/json, text/plain, */*",
    "authorization" -> "Bearer eyJhbGciOiJSU0EtT0FFUC0yNTYiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoiYWxwaGEiLCJjdHkiOiJKV1QifQ.N-Tmaqv9dh9uznub_6xe4ngA4Q2hQzJ4i5egy3MOkWVpoISxiyxfUgO18k1pdZoAVRC4lCBMqUAufRxAbIrdJF02LRYx2GXb-q3RoJ6e_s8Fu_DeyjnI0WgeDbLlpbQrNmWvsD957KB5IHAhGRtX4k06mjfucOM_9RwFKITCv4EJjhByEePIBo0QZH908hZNIGFvSvB3UBOj89opY62xFdAzl6mQo5fOusKjTASCh9-XcRhGW7mpKhS7i93i2MBZKAPeHC0XkEhWc1jUdhAcmsDb5_fgoHl7di_ruUwhri8UNz8vsDqcf5AVlDKB4XwsO5jpGAgP1wF6gicquuQf0g.3-4luI-jFeqQc077HWr_Bg.xVCMFlKYfz_x-sRuexaitC-_6BEQbHOKanvM2Brnd8jQSo7DoBvINqw8punoxF_W_64_WQV-9haft4jeb5Rb4vZWZ2UlNJbBdrp6Bju5W8QvPq-eaHcRCx5uFS40PvJsq8RA4i4X9IzNHETObvjAZ_1aYFRduzFj9kGwdBkOHQSysGqIcP-qhi6qg9zZOO7CXnEEbiMBgtUdY7gCJJpPOk5YD1Ne8G-tKYHqwCLa_0Haa484xw68z9xMj8_qbGdVinIf5PN_XeyiyTI2_0HFBdz6GAzekfi-Dm41PgV0IYNXR-u_v_iG-2YLZPjWM3e4q4hTKpgoCPtE_j4EyITbmlbRhr8S13zxihIiH5lca7RtPKsWLSco-ChNCJ2l4UHoum8jl4rccJXeudvpMABX5rU_2lui5a5IAfThp_-d-wkwYyqbG_m11wGom6SDN2GZtloM1pW2lUMJ_tHoEOtEIiXclldgPi6i32Xey-Zq9F6fPPhv2AK0dWf9GrhoHgqRa3I67mNRsYfRN6SFZjJBEOKx4JyFQbPHRA5nVF7yLldv8146qmxUIaziueEILHJjGp9ipqSPvy0DsQ9Modr694Oudyam4gwX49jII1VWYNZqcSRR2-VjlV13wsSEivsdZmNEkT7kImMuc7g6w6QPgc4TV4zXJoIY2CFU6PpoPSzmttbVi9X7N35GcKyp3xUg4i14Da22B9IfEw3fStDOI825TQKo1qtUQMXWR2kuC46CaJs4Zk7J6sVF7gDdlBUZknCx-w9fG1NGLFLWNFDwlF3hLXXxzlPsCxOXF5u8OrnFhx8iIhGzfKRKUet7aZYKJFlcQwreWeWoY08PRSRwyK4b5Ehji-RlnSZ2V0Q0dH2vVERyLQtzYTnEbSzHaaleqGU2bcnyzvnzJnS6prTN0MedqZQv2H-TCyhidDB5UlXUCixBkYRucJ3m5YxpHG9x2XiD_wvhz7Tq9NdN_K0joVqNFZO9cMQ50UYoQDPwyei57QdROSpErZpKGmCDJLXSz_uubzGXez3yKRjTp1nglZgtvbZxL2WndloMatlnxttvEd5W4ULBK0qESUQf_u_q90RWCPP5FDxkEpsH-gd0J0Nta_CLjH6Y9bm3Xx6jPoER6sy4G5F3_9TGrFK1hJU_R8TblcTWh2eo0PVIoFhzXQzmiKRvbqqyNahId48EJnpShCocQE1fBg6yD69K5__9w6zbhyImSFBf8wEp86PRw7y7i3Yme3brG-LZCpcrDjWZDaCcOIkO1_js73H9jcahyuse6ZMeZGQxWvDq8-MnqOys1sBTXmb_96UB98HQBpOZjXePQIDtQqcq3Qk_KtXwvMGAeJgae1bzCGjjrTzkKGLh-ohAkPSr7egNaQV5vBAvf7wyQqTXATBPfEr-XEWnDN0mSC0ZZ5LeHawxZESB5KWK2ZNidQwwWjdpGvKsSD6-_ol3Bi2hUPLPAGBlcSw80M9g40rxOLTIXkynVihI5E7GQ4mbdsUQo521CBM7XRuq88FtLDY3fu_8FGvGULQBGxGzrv2lW7Sv5EiuufupbeH3TZEXhuOmnNjBdJbNI0dbK2WXnbXCcPVgICDoDQoqmUctorFnVY4dHdPgCpRwMx3X_Iy3ty-WpoF0g5Omio3LSizGgZN98zSIkDe68xVs1YsNrvzDNohoi2n0_Uj3lctdUAwr5E3kLxtyqmfwkyoeP1bZmQWtZtwF0unpIaVkpN1UvvLlnWez9_lBDcKpvovMpJEH6bqHwRBSFgA5UiG1gJxzABetWWNrs-k5ox4vYb82jiu6SzJ63_71KLMPDuCgRGzMzZSCUvbC0TvLkYoOgVnS8uoUoEiFBih42D7znVgYYrzXo-dHpWEIxYUGtX-wF5PuHb-Guzx01uLZbFebSxVyGzdbnYmueVdOkTMU5_NH79L1GOfi6JGVbL4-tkweN79kBgjGDIpAIzevwPI0wsmM9MzcEuTPbTqHzHFYNpzzofUWnW6DyHW5eNUoyn-xdwY96W1kQSI8yQ0R6ftabFkdIuGzmS--J3w9e57K3LKBPpN0NpTzv1ME0_XAyXVxIt65MpJEwExe70N347D_LiF_A5vPlPVTuefWO-M0YgEjN7Dlcbif8TTIXpBEoFrSaKnHfir5LCDnImq2WS7WC2EyjOh7S8cE9UPaU6DSlRwzU_pCD9JXxZjMda-wSClo1aBNwFKqmMhAPHIvfMiosOpseVShfw-GHRrof86CqH6kseUQM8FJJ8C4ECF51U3b4WZYs6bW6ry5uzdiaceyKGNax6v9QCuT8eIGH3sdqio-1qclc3eB83juWTPCRU9dq_hMpO0TusFEvuTPRzmwW0WIwQmFMq9XSG2DbxjXZQwe9oXsZqJiozo6EAx4dSy8a2hU3_kYX3jJxDoqhCrgsd0mWAOtnKMZlEV0h3iT_XyxPP5nR-4f3rTmrqMW_onnE5CyYpqwQfZINL9ekQ4pisXo3K91UG5f6Csl39cbha4vgtgKp9q0AGeg6Q5UbcnX2J44o1wUQtjbxIHaUISodD4bszH2z7kp7dIl-pyL0RlGPao-euSKl4HEfIkr3M_J8yKPeERNDlf_gRCgaWGjeY3DZFDkhkR4MW5HAPjIza2welqk9t7btceryG1AiFLu4exXYBOMQGKz1E0KkiO1SeQwWz6IakPdfKi6E8jMqfndoGWtDZM7XvHa-NGyIlJOyLzCRo98Z_ZbGwPR46dPKjhN_rmDckeWdS9SlcpGp4hXKuKLS4aiPOMJE1vjBnhzTMO8e54tg8A272x40Et4T1v3LsiLCkcfHy-Zl8CBhXCcNr10ZmYp0om007bqaDeMqVm3UEi4QfvQn3J008XBQfJJx6tX-ASwTEkwRnEWPnoa7ZusC7XlQiUYwUtRaDmmd-HYdlNrw86U25mvtjRqnOtesigJUrYGzeb569I2LbKx9ePHnyHyX6P4VZlG4acyIsn1cGs0qTFoJA1CklYyw7rtmppOl9XZ7J_dstYGaVY5odoLKphdzC91tQfP4Pyg7vwr9e7vDhl2ZBGXbvlb-y0GSePurVid4ixWz94ri43Vsgq0Ph4JcSSLf2G_KECmj-vHAK8syi8s95fdbd8o6GKAUepFveO0FQUHsLvQzrfPB590kvbuTyOrrxwKMSOi_xFYghj_InEUXtwsUeEpBdmepfcf_X8gr2Cf9kJxbvosLg2n0RX8pFo4KIKWrZf-MB3O9XZaXSmnNGARH_trmqr9qpkED98p_coaykbm8VTWX9XDlao-yreZ6O3Z6zL5F559nCiz8BcbOQ_yU94.4cEqQaiWfqUrlk6HPKQKmw",
    "origin" -> "https://www.*****-*****.pt",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "x-applicationname" -> "upmc-connect",
    "x-trackingid" -> "GD1uxOOdTy7US45ZBPu0VKSHWSyU2xjs")
}
