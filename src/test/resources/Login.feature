@LoginSuite
Feature: Login

  Background:
    Given the user is registered
    And the user is on the home page
    And the user clicks on the "My Account" link
    And the user clicks on the "Login" link
    And the user is on the login page

  @LoginOk
  Scenario Outline: Verify valid user can login
    When the user enters valid credentials "<username>" and "<password>"
    And clicks on the "Login" button
    Then the user should be redirected to the account page

    Examples:
      | username             | password  |
      | eechechele@gmail.com | 123456789 |


  @LoginKo
  Scenario Outline: Verify invalid user can't login
    When the user enters invalid credentials "<invusername>" and "<invpassword>"
    And clicks on the "Login" button "<maxAttempts>" attempts
    Then the user should receive an error "<errorMessage>" message

    Examples:
      | invusername        | invpassword | maxAttempts | errorMessage                                                                                       |
      | chechel@gmail.com | 12345678    | 1           | Warning: No match for E-Mail Address and/or Password.                                              |
      | use@example.com   | 1           | 6           | Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.   |



  @PasswordRecovery
  Scenario: Verify the functionality of the Password Recovery link
    And the user clicks on the "Forgotten Password" link
    Then the user should be redirected to the password recovery page

  @PasswordRecoveryWithEmailConfirmation
  Scenario Outline: Verify that the user recives an email confirmation to recover the password
    And the user clicks on the "Forgotten Password" link
    When the user enters their email address "<email>" in the provided field
    And clicks on the "Continue" button
    Then the user should receive a message "<message>"

    Examples:
      | email                | message                                                                     |
      | eechechele@gmail.com | An email with a confirmation link has been sent your email address.         |
      | user1@example.com    | Warning: The E-Mail Address was not found in our records, please try again! |
