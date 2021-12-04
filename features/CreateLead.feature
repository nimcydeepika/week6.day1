Feature: CreateLead functionality in leaftaps

Background:
Given open the chrome browser
And load the application url

Scenario: CreateLead with manadatory informations
Given open the chrome browser
And load the application url
And enter the username as 'Demosalesmanager'
And enter the password as 'crmsfa'
When click on login button
Then home page should be displayed
When click on CRMSFA
When click on Leads
When click  on create lead
Given type company name
Given type first name 
And type last name
When click create lead button
