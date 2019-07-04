Feature: signup

Scenario Outline: test signup function with different set of inputs

Given open signup page
When user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters dob as "<dob>"
And user enters psd as "<password>"
And user enters cpsd as "<confirmpassword>"
Then click signup button
And verify signup success message

Examples:
|firstname|lastname|dob|password|confirmpassword|
|jeeva|mani|13/4/98|jeeva123|jeeva123|
|jeevasree|manisree|13/4/98|jeeva123|jeeva123|