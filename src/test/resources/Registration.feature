@RegistrationSuite
Feature: User Registration

  Background:
    Given the user is on the home page
    And clicks on My Account
    And clicks on Register option

  @RegistrationOk
  Scenario Outline: Successful Registration
    When the user fills in all the mandatory "<fields>" with "<valid information>"
    And clicks in the checkbox of the Privacy Policy
    And clicks on the "Continue" button
    Then the user should receive a success message indicating successful registration
    Examples:
      | fields           | valid information    |
      | First Name       | Ernesto              |
      | Last Name        | Chechele             |
      | E-mail           | eechechele@gmail.com |
      | Telephone        | 123456789            |
      | Password         | 123456789            |
      | Password Confirm | 123456789            |

  @RegistrationKo
  Scenario Outline: Registration with missing information
    When the user fills in any mandatory "<fields>" with missing "<missing>" information
    And clicks in the checkbox of the Privacy Policy
    And clicks on the "Continue" button
    Then the user should see an error message
    Examples:
      | fields           | missing |
      | First Name       |         |
      | Last Name        |         |
      | E-mail           |         |
      | Telephone        |         |
      | Password         |         |
      | Password Confirm |         |

  @PrivacyPolicyKo
  Scenario: Registration without accepting the privacy policy
    When the user fills in all the mandatory fields with valid information
    And does not check the privacy policy checkbox
    And clicks on the "Continue" button
    Then the user should see an error message indicating that they must agree to the Privacy Policy

  @ExistingMail
  Scenario Outline: Registration with existing email
    When the user fills in all the mandatory fields with valid information
    And the user enters an email that is already registered in the system: "<existing email>"
    And clicks on the "Continue" button
    Then the user should see an error message indicating that the E-Mail Address is already registered
    Examples:
      | existing email       |
      | eechechele@gmail.com |
