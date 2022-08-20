Feature: Edit Lead in Leaftaps

Background: Positive Login
Given Type the username as "demosalesmanager"
And Type the password as "crmsfa"
When Click on the Login button
Then Verify the homescreen is displayed

Scenario Outline: Edit Lead with different data
Given Click on CRMSFA Link
And Click on Leads Tab
And Click on Find Leads Link
When Type in the first name as <firstName>
And Click Find Leads Button
And Click on the first resulting lead
Then Verify the View Leads Title Page
And Click on Edit button
And Change the Company Name as <companyName>
And Click on update button
Then Confirm the Changed Name Appears

 
 Examples:
|firstName|companyName|
|Ganesh|Volante Technologies|
|Harish|MasterCard Tech|