Feature: Create Contact in Salesforce Application

Background: 
Given Launch browser,get Url and Login

Scenario Outline: 
When Click Contacts from AppLauncher
And Click New Button
And Select salutation from Combo
And Input First Name field as <fname>
And Input Last Name field as <lname>
And Input mobile number as <mobile>
And Input Email ID Field as <email>
When Click Save Button
Then Confirm the Save Operation with <fname>

Examples:

|fname|lname|mobile|email|
|'Preethi'|'Mani'|'1236547890'|'abcc@gmail.com'|
|'Arthi'|'Mani'|'9876547890'|'xyzzee@gmail.com'|



