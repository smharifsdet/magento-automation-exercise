Feature: Verify the Add to Cart functionality

@SmokeTest
Scenario: Verify that adding single product in to the Cart is successfull

Given user is able to logged in with a valid credentials and the product is in stock  

When user clicks on add to cart button for the product

Then user should be able to add the product in to the cart successfully

