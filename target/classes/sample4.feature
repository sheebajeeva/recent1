Feature: Test background keyword

Background: display welcome
Given application displays welcome message

@yellow
Scenario: signin
Given users un and psd
And click signin

@blue
Scenario: search for the product
When user searches for iphone

@blue @yellow
Scenario: add to cart
When user adding the searched product to cart

@red
Scenario: payment process
When user performing payment process using netbanking

@white
Scenario: signout
When user click on signout button

