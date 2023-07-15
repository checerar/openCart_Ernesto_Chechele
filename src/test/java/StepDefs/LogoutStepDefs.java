package StepDefs;

import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.PagesFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LogoutStepDefs {
    LoginPage loginPage = PagesFactory.getInstance().getLoginPage();
    LogoutPage logoutPage = PagesFactory.getInstance().getLogoutPage();

    @Given("the user is logged in to the website with username: {string} and password: {string}")
    public void theUserIsLoggedIn(String username, String password) {
        loginPage.navigateToLoginPage();
        loginPage.enterCredentials(username, password);
        loginPage.clickLoginButton();
    }

    @And("the user is on the account page")
    public void theUserIsOnTheAccountPage() {
        loginPage.verifyRedirectToAccountPage();
    }

    @When("the user clicks on the {string} menu")
    public void clickMenu(String myAccount) {
        logoutPage.clickMenu(myAccount);
    }

    @When("the user clicks on the {string} option")
    public void clickOption(String logout) {
        logoutPage.clickOption(logout);
    }

    @When("the user navigates to a different page {string} while being logged in")
    public void navigateToDifferentPage(String url) {
        logoutPage.navigateToDifferentPage(url);
    }

    @Then("the user should be redirected to the logout page")
    public void verifyRedirectToLogoutPage() {
        logoutPage.verifyRedirectToLogoutPage();
    }

    @Then("the user should see a success message: {string}")
    public void verifySuccessMessage(String message) {
        logoutPage.verifySuccessMessage(message);
    }
}
