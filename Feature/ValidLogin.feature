Feature: ValidLogin Test

@validlogin
Scenario: Succesful login with valid credentials
Given User is on login page1 of ewallet
When User enters valid credentials
Then message displayed login successfully

