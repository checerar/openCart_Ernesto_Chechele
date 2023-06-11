@CheckoutSuite
Feature: Validate the checkout process

  Background:
    Given the user is on the checkout page

  @Payment
  Scenario Outline: Make Payment
    When the user chooses "<Billing Details>" on Step 2: Billing Details
    And clicks on the Continue button
    And the user chooses "<Delivery Details>" on Step 3: Delivery Details
    And clicks on the Continue button
    And the user chooses "<Delivery Method>" on Step 4: Delivery Method
    And clicks on the Continue button
    And the user chooses "<Payment Method>" on Step 5: Payment Method
    And checks the "<Terms&Conditions>"
    And clicks on the Continue Button
    Then the user should see the Confirm Order form with details
    And the user can click on the Confirm Order button
    Then the user is redirected to the checkout success page
    And should see a successful message: "Your order has been placed!"

    Examples:
      | Billing Details                     | Delivery Details                    | Delivery Method      | Payment Method    |
      | I want to use an existing address   | I want to use an existing address   | Flat Shipping Rate   | Bank Transfer     |
      | I want to use an existing address   | I want to use an existing address   | Flat Shipping Rate   | Cash On Delivery  |

