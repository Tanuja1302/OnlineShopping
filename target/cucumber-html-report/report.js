$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Verify the Online shopping site functionality",
  "description": "",
  "id": "verify-the-online-shopping-site-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify the user should be login successfully with valid credentials",
  "description": "",
  "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Logindetails"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on LogIn link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter username as \"\u003cUsername\u003e\" and Password as \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Logout button",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 14,
      "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials;;1"
    },
    {
      "cells": [
        "tbelwal@yopmail.com",
        "qwerty1"
      ],
      "line": 15,
      "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials;;2"
    },
    {
      "cells": [
        "",
        ""
      ],
      "line": 16,
      "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials;;3"
    },
    {
      "cells": [
        "tanu@yopmail.com",
        "qwerty1"
      ],
      "line": 17,
      "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Verify the user should be login successfully with valid credentials",
  "description": "",
  "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Logindetails"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on LogIn link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter username as \"tbelwal@yopmail.com\" and Password as \"qwerty1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Page.user_is_on_home_page()"
});
formatter.result({
  "duration": 14802266653,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.user_click_on_LogIn_link()"
});
formatter.result({
  "duration": 2666165365,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tbelwal@yopmail.com",
      "offset": 19
    },
    {
      "val": "qwerty1",
      "offset": 57
    }
  ],
  "location": "Login_Page.user_should_enter_valid_credentials(String,String)"
});
formatter.result({
  "duration": 489717171,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.click_on_Login_button()"
});
formatter.result({
  "duration": 2061783033,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.user_should_be_on_Home_page()"
});
formatter.result({
  "duration": 5453299,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.Click_on_Logout_button()"
});
formatter.result({
  "duration": 4502500736,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify the user should be login successfully with valid credentials",
  "description": "",
  "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Logindetails"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on LogIn link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter username as \"\" and Password as \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Page.user_is_on_home_page()"
});
formatter.result({
  "duration": 15895160552,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.user_click_on_LogIn_link()"
});
formatter.result({
  "duration": 2773361685,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    },
    {
      "val": "",
      "offset": 38
    }
  ],
  "location": "Login_Page.user_should_enter_valid_credentials(String,String)"
});
formatter.result({
  "duration": 445338093,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.click_on_Login_button()"
});
formatter.result({
  "duration": 1855225361,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.user_should_be_on_Home_page()"
});
formatter.result({
  "duration": 4956252,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[My account] - My Store\u003e but was:\u003c[Login] - My Store\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat StepDefinition.Login_Page.user_should_be_on_Home_page(Login_Page.java:45)\r\n\tat ✽.Then User should be on Home page(Login.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login_Page.Click_on_Logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "Verify the user should be login successfully with valid credentials",
  "description": "",
  "id": "verify-the-online-shopping-site-functionality;verify-the-user-should-be-login-successfully-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Logindetails"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on LogIn link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter username as \"tanu@yopmail.com\" and Password as \"qwerty1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Page.user_is_on_home_page()"
});
formatter.result({
  "duration": 14858679167,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.user_click_on_LogIn_link()"
});
formatter.result({
  "duration": 3037532005,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tanu@yopmail.com",
      "offset": 19
    },
    {
      "val": "qwerty1",
      "offset": 54
    }
  ],
  "location": "Login_Page.user_should_enter_valid_credentials(String,String)"
});
formatter.result({
  "duration": 493960127,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.click_on_Login_button()"
});
formatter.result({
  "duration": 2911137911,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.user_should_be_on_Home_page()"
});
formatter.result({
  "duration": 4696971,
  "status": "passed"
});
formatter.match({
  "location": "Login_Page.Click_on_Logout_button()"
});
formatter.result({
  "duration": 4269871961,
  "status": "passed"
});
});