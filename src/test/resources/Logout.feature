@LogoutSuite
Feature: User Logout

  Background:
    Given the user is logged in to the website with username: "eechechele@gmail.com" and password: "123456789"
    And the user is on the accountpage

  @LogoutOk
  Scenario: Successful User Logout
    When the user clicks on the "My Account" menu
    And the user clicks on the "Logout" option
    Then the user should be redirected to the logout page
    And the user should see a success message: "You have been logged off your account."

  @LogoutPages
  Scenario Outline: Successful user Logout from different pages
    When the user navigates to a different page "<url>" while being logged in
    And the user clicks on the "My Account" menu
    And the user clicks on the "Logout" option
    Then the user should be redirected to the logout page
    And the user should see a success message: "<message>"

    Examples:
      | url                                                                                   | message                                |
      | http://opencart.abstracta.us/index.php?route=product/category&path=57                 | You have been logged off your account. |
      | http://opencart.abstracta.us/index.php?route=product/category&path=17                 | You have been logged off your account. |
      | http://opencart.abstracta.us/index.php?route=product/category&path=24                 | You have been logged off your account. |
      | http://opencart.abstracta.us/index.php?route=product/product&path=20_27&product_id=41 | You have been logged off your account. |
