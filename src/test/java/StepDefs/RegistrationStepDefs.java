package StepDefs;

import Pages.RegistrationPage;
import Pages.PagesFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RegistrationStepDefs {
    RegistrationPage registrationPage = PagesFactory.getInstance().getRegistrationPage();
    @And("the user is on the registration page")
    public void RegistrationPage() {
        registrationPage.navigateToRegistrationPage();
    }
    @When("the user fills in all the mandatory fields with valid information")
    public void fillRegistrationForm() {
        String firstName = registrationPage.getRandomFirstName();
        String lastName = registrationPage.getRandomLastName();
        String email = registrationPage.getRandomEmail();
        String telephone = registrationPage.getRandomTelephone();
        String password = registrationPage.getRandomPassword();
        String passwordConfirm = password;

        registrationPage.fillRegistrationForm(firstName, lastName, email, telephone, password, passwordConfirm);
    }
    @And("clicks on the checkbox of the Privacy Policy")
    public void PrivacyPolicy() {
        registrationPage.clickPrivacyPolicy();
    }

    @Then("the user should receive a success message indicating successful registration")
    public void SuccessfulRegistration() {
        Assert.assertTrue("Successful registration message not displayed", registrationPage.isSuccessfulRegistrationMessageDisplayed());
    }

    @When("the user fills in the registration form with missing information")
    public void fillRegistrationFormWithMissingInformation() {
        registrationPage.fillRegistrationForm("", "", "", "", "", "");
    }
    @And("the user enters an existing email: {string}")
    public void enterExistingEmail(String existingEmail) {
        registrationPage.clearEmailField();
        registrationPage.setEmail(existingEmail);
    }

    @Then("the user should see an error message {string}")
    public void verifyErrorMessage(String errorMessage) {
        registrationPage.verifyErrorMessage(errorMessage);
    }

    @When("the user fills in all the mandatory fields with valid information without accepting the  privacy policy")
    public void validInformationWithoutAcceptingPrivacyPolicy() {
        fillRegistrationForm();
    }
    @Then("the user should see the field {string} error message {string}")
    public void verifyFieldErrorMessage(String field, String expectedErrorMessage) {
        String actualErrorMessage = registrationPage.getErrorMessage(field);
        Assert.assertEquals("Error message for field " + field + " does not match", expectedErrorMessage, actualErrorMessage);
    }

    @Then("the user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        Assert.assertTrue("Error message not displayed: " + "Warning: You must agree to the Privacy Policy!", registrationPage.isErrorMessageDisplayed("Warning: You must agree to the Privacy Policy!"));
    }


}



