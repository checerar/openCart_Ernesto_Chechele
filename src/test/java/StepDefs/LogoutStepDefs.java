package StepDefs;


import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.PagesFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LogoutStepDefs {
    LogoutPage logoutPage = PagesFactory.getInstance().getLogoutPage();
    @Given("the user is logged in to the website")
    public void userIsLoggedIn() {
    }

    @When("the user clicks on the {string} menu")
    public void clickMenu(String menu) {
    }

    @When("the user clicks on the {string} option")
    public void clickOption(String option) {
    }

    @When("the user navigates to a different page {string} while being logged in")
    public void navigateToDifferentPage(String url) {
    }

    @Then("the user should be redirected to the logout page")
    public void verifyRedirectToLogoutPage() {
    }

    @Then("the user should see a success message: {string}")
    public void verifySuccessMessage(String message) {
    }
}
