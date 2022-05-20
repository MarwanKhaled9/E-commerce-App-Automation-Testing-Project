@regression
Feature: F08_wishListAdd | user able to add products in his wishlist

  Scenario: product added to wishlist successfully
    When user add a product to wishlist
    Then wishlist notification is displayed