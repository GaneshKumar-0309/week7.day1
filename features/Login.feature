Feature: Login into Leaftaps

Scenario: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the homescreen is displayed

Scenario: Negative Scenario
Given Type the username as 'demouser'
And Type the password as 'crmsfa1'
When Click on the Login button
But Error message is displayed
