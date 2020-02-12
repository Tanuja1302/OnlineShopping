
Feature:Verify the Online shopping site functionality

@Logindetails

Scenario Outline: Verify the user should be login successfully with valid credentials
Given User is on home page
When User click on LogIn link
Then enter username as "<Username>" and Password as "<Password>"
And Click on Login button
Then User should be on Home page
And Click on Logout button
Examples:
| Username 				| Password |
| tbelwal@yopmail.com 	| qwerty1 |
|                        |         |
| tanu@yopmail.com 		| qwerty1 |



@Registration_Testcase
Scenario Outline: Verify the user should be Registered successfully with valid details
Given User is on Landing  page for sign up
When User click on SignUp link 
Then User should be on Sign Up page
Then enter Email as "<Email_id>" and Click on Create Account button
Then Enter all the required details
And Click on Create Account Button
Then User should be redirected to Dashboard page

Examples:
| Email_id | 
| testauto11@yopmail.com | 
| testauto12@yopmail.com  | 




@Search_And_Order_Product
Scenario Outline: Verify that the  user should be able to login before order the product
Given User is on home page
When User click on LogIn link
Then enter username as "<Username>" and Password as "<Password>"
And Click on Login button
Then User should be on Home page
Then Search for a Product "<Product_Name>"
And Click on Search icon
Then Select product or add to card
Then Click on Checkout button in pop up
And Click on Process to Checkout at summaryPage
Then Click on Process to checkout at Address summaryPage
And Click on Process to checkout at Shipping summaryPage
Then Select a payment Mode
Then Confirm the order

Examples:
| Username 				| Password |  Product_Name |
| tbelwal@yopmail.com 	| qwerty1  |  Faded Short Sleeve T-shirts |

@Registration_PageValidation_Testcase
Scenario Outline: Verify the user should be Registered successfully after validating the details
Given User is on Landing  page for sign up
When User click on SignUp link 
Then User should be on Sign Up page
Then enter Email as "<Email_id>" and Click on Create Account button
And enter the name and Validate first name field
Examples:
| Email_id | 
| testauto111@yopmail.com | 
