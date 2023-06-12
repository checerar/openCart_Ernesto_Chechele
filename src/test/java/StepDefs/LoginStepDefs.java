package StepDefs;

import Pages.LoginPage;
import Pages.PagesFactory;
import Pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefs {


    LoginPage loginPage = PagesFactory.getInstance().getLoginPage();
    RegistrationPage registrationPage = PagesFactory.getInstance().getRegistrationPage();
    @Given("the user is registered")
    public void userIsRegistered() {
        //

    }

    @Given("is in the login page")
    public void userIsInLoginPage() {
        //

    }

    @When("the user enters valid credentials {string} and {string}")
    public void enterValidCredentials(String username, String password) {
        //
    }

    @When("the user enters invalid credentials {string} and {string}")
    public void enterInvalidCredentials(String username, String password) {
        //
    }


    @When("the user clicks on the {string} link")
    public void clickForgotPasswordLink(String link) {
        //  (por ejemplo, "Forgot Password")
    }

    @When("the user enters their email address {string} in the provided field")
    public void enterEmailAddress(String email) {
        //
    }

    @Then("the user should be redirected to the home page")
    public void verifyRedirectToHomePage() {
        //
    }

    @Then("the user should receive an error message indicating that the credentials are invalid")
    public void verifyInvalidCredentialsErrorMessage() {
        //
    }

    @Then("the user should be redirected to the password recovery page")
    public void verifyRedirectToPasswordRecoveryPage() {
        //

    }

    @Then("the user should receive a message {string}")
    public void verifyMessage(String message) {
        //
    }
}
