Feature: Login functionality for testleaf application

Background:
Given open the chrome browser
And load the application url

Scenario: Login using positive credential
Given open the chrome browser
And load the application url
And enter the username as <username>
And enter the password as <password>
When click on login button
Then home page should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'Demo'|'crmsfa'| 
 
Scenario: Login using negative credential
Given open the chrome browser
And load the application url
And enter the username as 'Demo'
And enter the password as 'crmsfa'
When click on login button
But error message should be displayed 
 