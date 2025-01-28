Feature: Verify the Checkout functionality

@RegressionTest
Scenario: Verify that after adding a product in to the Cart users can successfully proceed to the Checkout

Given user is able to logged in with a valid credentials and the product is in stock  

When user clicks on add to cart button for the product

And after adding the product in to the card and proceed to the checkout

Then the checkout page should displayed the correct product to the users

