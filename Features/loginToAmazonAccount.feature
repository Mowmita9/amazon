Feature: searching products
Scenario Outline: searching products on google

Given i am on the google homepage

When i click on the sign in button 
And i enter the "<user_name>" in user input field 
And i enter the "<Password>" in password input field 
And i click on the sign in button 

Then i can login to my amazon account successfully 

Examples:
|user_name   |   Password |
|abc@mail.com|   1323443  |