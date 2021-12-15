Feature: DeleteLead functionally for Leaftaps application

Background:
Given Open the chrome browser
And Load the application url

Scenario Outline: DeleteLead with mandatory information
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Merge Leads' link
Then 'Merge Leads' page should be displayed
When Click on from lead
When Click on Lead fromID
When Click on to lead
When Click on Lead toID
When Click on merge button
Then 'View Lead' page should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
