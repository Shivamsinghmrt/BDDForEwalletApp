Feature: InvalidRegistration Test

@invalidregister
Scenario: Unsuccesfull to creat account 
Given User is on registration page2 of ewallet
When User enters invalid inputs in fields
Then message displayed registration Unsuccessfull

