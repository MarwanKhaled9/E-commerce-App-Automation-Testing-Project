@regression
Feature: F09_shoppingCartAdd | user able to add products in shopping cart

  Scenario: product added to shopping cart successfully
    When user add a product to shopping cart
    Then added to shopping cart notification is displayed