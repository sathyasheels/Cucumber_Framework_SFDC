Feature: check UserMenu functionality

Scenario: User successfully lands on MyProfile page
Given user is in login page
When user enters valid username and valid password
Then user should land on homepage
Then user clicks on UserMenu dropdown
Then user clicks on MyProfile option
Then MyProfile page should get displayed