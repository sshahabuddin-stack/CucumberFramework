Feature: Amazon Search

Scenario: Search a Product
Given I have a search field on Amazon Page
When I search a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple Macbook Pro" should be displayed


Scenario: Add a Product
Given I have a search field on Amazon Page
When I search a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple Macbook Pro" should be displayed