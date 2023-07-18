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
  Scenario Outline: Registration with missing information
    When the user fills in the registration form with missing information
    And clicks on the checkbox of the Privacy Policy
    And clicks on the "Continue" button
    Then the user should see the field "<field>" error message "<errorMessage>"

    Examples:
      | field           |errorMessage                                   |
      |firstname        |First Name must be between 1 and 32 characters!|
      |lastname         |Last Name must be between 1 and 32 characters! |
      |email            |E-Mail Address does not appear to be valid!    |
      |telephone        |Telephone must be between 3 and 32 characters! |
      |password         |Password must be between 4 and 20 characters!  |



  @PrivacyPolicyKo
  Scenario: Registration without accepting the privacy policy
    When the user fills in all the mandatory fields with valid information without accepting the  privacy policy
    And clicks on the "Continue" button
    Then the user should see an error message

  @ExistingMail
  Scenario Outline: Registration with existing email
    When the user fills in all the mandatory fields with valid information
    And the user enters an existing email: "eechechele@gmail.com"
    And clicks on the "Continue" button
    Then the user should see an error message "<message>"
    Examples:
      | message                                         |
      | Warning: E-Mail Address is already registered!  |
