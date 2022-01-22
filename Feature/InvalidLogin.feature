Feature: InvalidLogin Test


@invalidlogin
Scenario: Test ewallet with invalid credentials
Given User is on login page2 of ewallet
When User enters invalid credentials
Then User should see a error message