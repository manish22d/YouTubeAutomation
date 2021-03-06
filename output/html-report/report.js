$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UI.feature");
formatter.feature({
  "line": 1,
  "name": "UI Functional Test",
  "description": "",
  "id": "ui-functional-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I want to perform test on YouTube",
  "keyword": "Given "
});
formatter.match({
  "location": "YouTubeSteps.i_want_to_perform_test_on_YouTube()"
});
formatter.result({
  "duration": 13332368000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "YouTube logo displayed correctly in homepage",
  "description": "",
  "id": "ui-functional-test;youtube-logo-displayed-correctly-in-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@manish"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user navigates to YouTube homepage",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "verify YouTube logo displayed correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify YouTube apps dropdown displayed all options",
  "rows": [
    {
      "cells": [
        "YouTube TV"
      ],
      "line": 11
    },
    {
      "cells": [
        "YouTube Music"
      ],
      "line": 12
    },
    {
      "cells": [
        "YouTube Kids"
      ],
      "line": 13
    },
    {
      "cells": [
        "Creator Academy"
      ],
      "line": 14
    },
    {
      "cells": [
        "YouTube for Artists"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "YouTubeSteps.user_navigates_to_YouTube_homepage()"
});
formatter.result({
  "duration": 5501548400,
  "status": "passed"
});
formatter.match({
  "location": "YouTubeSteps.verify_YouTube_logo_displayed_correctly()"
});
formatter.result({
  "duration": 76038100,
  "status": "passed"
});
formatter.match({
  "location": "YouTubeSteps.verify_YouTube_apps_dropdown_displayed_all_options(String\u003e)"
});
formatter.result({
  "duration": 5706434700,
  "status": "passed"
});
});                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           formatter.result({
  "duration": 9420562186900,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d92.0.4515.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.19042 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-NQ28SJGQ\u0027, ip: \u0027172.22.208.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\mrman\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 92.0.4515.131, webStorageEnabled: true}\nSession ID: 8ce6547a64f6788183ce2f48d2d2dbf6\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027start\u0027]//a[@id\u003d\u0027logo\u0027]/div/yt-icon[@id\u003d\u0027logo-icon\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat sun.reflect.GeneratedMethodAccessor9.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.lambda$new$1(EventFiringWebDriver.java:105)\r\n\tat com.sun.proxy.$Proxy14.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:194)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:301)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:298)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:686)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:682)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:260)\r\n\tat com.youtube.pages.SearchResult.getListOfVideoTitles(SearchResult.java:32)\r\n\tat com.youtube.steps.YouTubeSteps.verify_user_is_able_to_scroll_till_end_of_page_using_infinite_scrolling(YouTubeSteps.java:71)\r\n\tat ???.And verify user is able to scroll till end of page using infinite scrolling(UI.feature:23)\r\n",
  "status": "failed"
});
});