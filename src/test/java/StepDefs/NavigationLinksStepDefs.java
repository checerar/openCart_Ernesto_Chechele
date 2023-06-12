package StepDefs;

import Pages.LoginPage;
import Pages.NavigationLinksPage;
import Pages.PagesFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class NavigationLinksStepDefs {
    NavigationLinksPage navigationLinksPage = PagesFactory.getInstance().getNavigationLinksPage();
    @Given("a user is on the home page")
    public void userIsOnHomePage() {
    }

    @When("the user clicks on {string} in the navigation bar")
    public void clickNavigationLink(String title) {
    }

    @Then("the user should see a dropdown menu with {int} options (if applicable)")
    public void verifyDropdownMenuOptions(int options) {
    }

    @Then("the user should be redirected to the URL {string} (if applicable)")
    public void verifyRedirectToURL(String url) {
    }
}
