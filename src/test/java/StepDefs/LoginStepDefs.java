package StepDefs;

import Pages.LoginPage;
import Pages.PagesFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefs {

    LoginPage loginPage = PagesFactory.getInstance().getLoginPage();

    @Given("the user is registered")
    public void userIsRegistered() {
        // Lógica para verificar que el usuario esté registrado
    }

    @Given("is in the login page")
    public void userIsInLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @When("the user enters valid credentials {string} and {string}")
    public void enterValidCredentials(String username, String password) {
        loginPage.enterCredentials(username, password);
    }

    @And("clicks on the {string} button")
    public void clicksOnTheButton(String button) {
        if (button.equals("Login")) {
            loginPage.clickLoginButton();
        } else if (button.equals("Continue")) {
            loginPage.clickContinueButton();
        }
    }

    @When("the user enters invalid credentials {string} and {string}")
    public void enterInvalidCredentials(String invusername, String invpassword) {
        loginPage.enterInvalidCredentials(invusername, invpassword);
    }

    @When("the user clicks on the {string} link")
    public void clickForgotPasswordLink(String link) {
        loginPage.clickForgotPasswordLink();
    }

    @When("the user enters their email address {string} in the provided field")
    public void enterEmailAddress(String email) {
        loginPage.enterEmailAddress(email);
    }

    @Then("the user should be redirected to the home page")
    public void verifyRedirectToHomePage() {
        loginPage.verifyRedirectToHomePage();
    }

    @Then("the user should be redirected to the password recovery page")
    public void verifyRedirectToPasswordRecoveryPage() {
        loginPage.verifyRedirectToPasswordRecoveryPage();
    }

    @Then("the user should receive a message {string}")
    public void verifyMessage(String message) {
        loginPage.verifyMessage(message);
    }

    @When("the user clicks on the {string} button {int} attempts")
    public void clicksOnTheButtonAttempts(String button, int maxAttempts) {
        loginPage.repeatedlyClickLoginButton(maxAttempts);
    }

    @Then("the user should receive an error {string} message")
    public void verifyErrorMessage(String errorMessage) {
        loginPage.verifyInvalidCredentialsErrorMessage(errorMessage);
    }
    @And("clicks on the {string} button {string} attempts")
    public void clicksOnTheButtonAttempts(String button, String maxAttempts) {
        int attempts = Integer.parseInt(maxAttempts);
        if (button.equals("Login")) {
            loginPage.repeatedlyClickLoginButton(attempts);
        }
    }

}
