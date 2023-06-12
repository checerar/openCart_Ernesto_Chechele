package StepDefs;

import Pages.LoginPage;
import Pages.PagesFactory;
import Pages.ProductOptionsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProductOptionsStepDefs {
    ProductOptionsPage productOptionsPage = PagesFactory.getInstance().getProductOptionsPage();
    @Given("the user is logged in")
    public void userIsLoggedIn() {
    }

    @When("the user searches for the product {string} in the search bar")
    public void searchProduct(String product) {
    }

    @Then("the user should see {int} search results")
    public void verifySearchResults(int number) {
    }
}
