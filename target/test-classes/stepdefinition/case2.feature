Feature: Login

Scenario Outline: TestMe app login
Given users open the application
When user enters the un as "<username>"
And user enters the psd as "<password>"
Then click on login button
And close the application

Examples:
|username|password|
|lalitha|password123|