@CartSuit
Feature: Shopping Cart

  Background:
    Given the user is logged in

  @AddProduct
  Scenario Outline: Add Product to Cart
    When the user clicks on the "Add to Cart" button of a "<product>"
    Then the "<product>" should be added to the shopping cart
    And the user should see a success message: "<message>"

    Examples:
      | product | message                                                |
      | MacBook | Success: You have added MacBook to your shopping cart! |

  @RemoveProduct
  Scenario: Remove Product from Cart
    Given the user has added a "<product>" to the shopping cart
    When the user clicks on the shopping cart icon
    And clicks on the "Remove" button next to the "<product>"
    Then the "<product>" should be removed from the shopping cart


