@LoginSuite
Feature: Login

  Background:
    Given the user is registered
    And is in the login page

  @LoginOk
  Scenario Outline: Verify valid user can login
    When the user enters valid credentials "<username>" and "<password>"
    And clicks on the "Login" button
    Then the user should be redirected to the home page

    Examples:
      | username             | password  |
      | eechechele@gmail.com | 123456789 |


  @LoginKo
  Scenario Outline: Verify invalid user can´t login
    When the user enters invalid credentials "<username>" and "<password>"
    And clicks on the "Login" button
    Then the user should receive an error message indicating that the credentials are invalid

    Examples:
      | username             | password |
      | eechechele@gmail.com | 12345678 |

  @PasswordRecovery
  Scenario: Verify the functionality of the Password Recovery link
    When the user clicks on the "Forgot Password" link
    Then the user should be redirected to the password recovery page

  @PasswordRecoveryWithEmailConfirmation
  Scenario Outline: Verify that the user recive an email confirmation to recover the password
    When the user enters their email address "<email>" in the provided field
    And clicks on the "Continue" button
    Then the user should receive a message "<message>"

    Examples:
      | email                | message                                                                     |
      | eechechele@gmail.com | An email with a confirmation link has been sent your email address          |
      | user2@example.com    | Warning: The E-Mail Address was not found in our records, please try again! |
