@RegistrationSuite
Feature: User Registration

  Background:
    Given the user is on the home page
    And the user clicks on the "My Account" link
    And the user clicks on the "Register" link
    And the user is on the registration page

  @RegistrationOk
  Scenario: Successful Registration
    When the user fills in all the mandatory fields with valid information
    And clicks on the checkbox of the Privacy Policy
    And clicks on the "Continue" button
    Then the user should receive a success message indicating successful registration

  @RegistrationKo
  Scenario: Registration with missing information
    When the user fills in the registration form with missing information
    And clicks on the checkbox of the Privacy Policy
    And clicks on the "Continue" button
    Then the user should see error messages for missing information

  @PrivacyPolicyKo
  Scenario: Registration without accepting the privacy policy
    When the user fills in all the mandatory fields with valid information without accepting the  privacy policy
    And clicks on the "Continue" button
    Then the user should see an error message indicating that they must agree to the Privacy Policy

  @ExistingMail
  Scenario Outline: Registration with existing email
    When the user fills in all the mandatory fields with valid information
    And the user enters an existing email: "<existing email>"
    And clicks on the "Continue" button
    Then the user should see an error message indicating that the E-Mail Address is already registered
    Examples:
      | existing email       |
      | eechechele@gmail.com |
