@CheckoutSuite
Feature: Validate the checkout process

  @Checkout
  Scenario Outline: Make Payment with both payment methods
    Given the user is on the home page
    When the user is logged in to the website with username: "eechechele@gmail.com" and password: "123456789"
    And the user clicks on the Checkout link
    And the user provides the billing details "<Billing Details>"
    And clicks on the Continue button with name: 'billing details'
    And the user provides the delivery details "<Delivery Details>"
    And clicks on the Continue button with name: 'delivery details'
    And the user selects the delivery method "<Delivery Method>"
    And clicks on the Continue button with name: 'delivery method'
    And the user selects the payment method "<Payment Method>"
    And checks the Terms&Conditions checkbox
    And clicks on the Continue button with name: 'payment method'
    Then the user should see the Confirm Order form with details
    And the user can click on the Confirm Order button
    And the user is redirected to the checkout success page with the message: "Your order has been placed!"

    Examples:
      | Billing Details                     | Delivery Details                    | Delivery Method      | Payment Method    |
      | I want to use an existing address   | I want to use an existing address   | Flat Shipping Rate   | Bank Transfer     |
      | I want to use an existing address   | I want to use an existing address   | Flat Shipping Rate   | Cash On Delivery  |
