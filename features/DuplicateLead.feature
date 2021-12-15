Feature: DuplicateLead functionally for Leaftaps application

Background:
Given Open the chrome browser
And Load the application url

Scenario Outline: DuplicateLead with mandatory information
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Find Leads' link
Then 'Find Leads' page should be displayed
When Click on phone
Given Enter the number as '99'
When Click on FindLeads button
When Click on Lead ID
When Click on DuplicateLead
When Click on create lead
Then 'View Lead' page should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
