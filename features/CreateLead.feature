Feature: Create Lead in Leaftaps

Background: Positive Login
Given Type the username as "demosalesmanager"
And Type the password as "crmsfa"
When Click on the Login button
Then Verify the homescreen is displayed

Scenario Outline: Create Lead with different data
Given Click CRMSFA Link
And Click Leads Tab
And Click Create Leads Link
When Type the company name as <companyName>
And Type the first name as <firstName>
And Type the last name as <lastName>
And Click Create Leads Button
Then Verify the View Leads Page
 
 Examples:
|companyName|firstName|lastName|
|Volante|Ganesh|S|
|MasterCard|Harish|S|