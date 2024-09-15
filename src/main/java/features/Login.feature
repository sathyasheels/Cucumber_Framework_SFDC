Feature: check login feature

Background:
Given user is in login page

Scenario: Login using valid credentials
When user enters valid username and valid password
Then user should land on homepage

Scenario: Login using invalid username 
When user enters invalid username and valid password
Then user should get error message

##Scenario: Login using invalid password
##When user enters valid username and invalid password
##Then user should get error message

##Scenario: Login using invalid username and invalid password
##When user enters invalid username and invalid password
##Then user should get error message