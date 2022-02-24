Feature: Login page input details

@Logindetails
Scenario Outline: Login to Amazon page

Given User is on Amazon page
When user put the input value <Name> and details as given
And Then click on Button
Then User navigate to password testbox page and put password value <Password>


Examples:
| Name  | Password |
| Pratyushtiwari30@gmail.com 	| Tewari@123## |