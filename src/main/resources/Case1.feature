Feature: To register in the TestMe application


Scenario: To sign up using valid details
Given user opens the test me app
When user enters UserName as "sheeba" 
And FirstName as "jeeva" 
And LastName as "mani"
And Password as "Jeeva123" 
And Confirmpassword as "Jeeva123" 
And Gender as "Female" 
And Email as "jeeva123@gmail.com" 
And Mobilenumber as "9999999999" 
And DOB as "13/04/1998" 
And Address as "bbbcccdddddd"
And Securityquestion as "What is your Birth Place"
And answer as "Mysore"
And click Register button
Then verify registeration success