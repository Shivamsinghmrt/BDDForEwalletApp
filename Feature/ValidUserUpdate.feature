Feature: ValidUserUpdate Test

@validuserupdate
Scenario: Succesfully Updated
Given User is logged in and on userdashboard 
When User click on update button
When inserts valid inputs in the field
When User click on submit button
Then message displayed updation successfull

