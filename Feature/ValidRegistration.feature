Feature: ValidRegistration Test

@validregister
Scenario: Succesfully account created
Given User is on registration page1 of ewallet
When User enters valid inputs in fields
Then message displayed registration successfully

