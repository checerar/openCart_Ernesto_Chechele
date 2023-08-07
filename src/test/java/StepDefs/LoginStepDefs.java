package StepDefs;

import Pages.LoginPage;
import Pages.PagesFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.util.Random;

public class LoginStepDefs {

    private final LoginPage loginPage;
    private final Random random = new Random();

    private String generateRandomUsername() {
        String prefix = "usuario";
        String domain = "example.com";
        int randomNum = random.nextInt(10000);
        return prefix + randomNum + "@" + domain;
    }

    public LoginStepDefs() {
        this.loginPage = PagesFactory.getInstance().getLoginPage();
    }

    @Given("the user is registered")
    public void userIsRegistered() {
        // Lógica para verificar que el usuario esté registrado
    }

    @And("the user is on the home page")
    public void theUserIsOnHomePage() {
        loginPage.navigateToHomePage();
    }

    @And("the user clicks on the {string} link")
    public void clicksOnTheLink(String link) {
        switch (link) {
            case "Login":
                loginPage.clickLoginLink();
                break;
            case "Forgotten Password":
                loginPage.clickForgottenPasswordLink();
                break;
            case "My Account":
                loginPage.clickMyAccountLink();
                break;
                case "Register":
                loginPage.clickRegisterLink();
                break;
        }
    }

    @And("the user is on the login page")
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
       if (invusername.equals("random@example.com")) {
            invusername = generateRandomUsername();
        }
        loginPage.enterInvalidCredentials(invusername, invpassword);
    }

    @When("the user enters their email address {string} in the provided field")
    public void enterEmailAddress(String email) {
        loginPage.enterEmailAddress(email);
    }

    @Then("the user should be redirected to the account page")
    public void verifyRedirectToAccountPage() {
        loginPage.verifyRedirectToAccountPage();
    }

    @Then("the user should be redirected to the password recovery page")
    public void verifyRedirectToPasswordRecoveryPage() {
        loginPage.verifyRedirectToPasswordRecoveryPage();
    }

    @Then("the user should receive a message {string}")
    public void verifyMessage(String message) {
        loginPage.verifyMessage(message);
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
