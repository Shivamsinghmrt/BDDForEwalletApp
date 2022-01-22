$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/ValidRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "ValidRegistration Test",
  "description": "",
  "id": "validregistration-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Succesfully account created",
  "description": "",
  "id": "validregistration-test;succesfully-account-created",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@validregister"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on registration page1 of ewallet",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters valid inputs in fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "message displayed registration successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidRegistration.user_is_on_registration_page_of_ewallet()"
});
formatter.result({
  "duration": 7599060231,
  "status": "passed"
});
formatter.match({
  "location": "ValidRegistration.user_enters_valid_inputs_in_fields()"
});
formatter.result({
  "duration": 6718687049,
  "status": "passed"
});
formatter.match({
  "location": "ValidRegistration.message_displayed_registration_successfully()"
});
formatter.result({
  "duration": 705216146,
  "status": "passed"
});
});