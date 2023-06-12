package StepDefs;

import Pages.CartPage;
import Pages.LoginPage;
import Pages.PagesFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CartStepDefs {

    CartPage cartPage = PagesFactory.getInstance().getCartPage();
    @When("the user clicks on the {string} button of a {string}")
    public void clickAddToCartButton(String button, String product) {
    }

    @Then("the {string} should be added to the shopping cart")
    public void verifyProductAddedToCart(String product) {
    }


    @Given("the user has added a {string} to the shopping cart")
    public void userHasAddedProductToCart(String product) {
    }
    @When("the user clicks on the shopping cart icon")
    public void clickShoppingCartIcon() {
    }

    @When("clicks on the {string} button next to the {string}")
    public void clickRemoveButton(String button, String product) {
    }

    @Then("the {string} should be removed from the shopping cart")
    public void verifyProductRemovedFromCart(String product) {
    }

    @Given("the user is on the {string} page")
    public void theUserIsOnThePage(String arg0) {
    }

    @And("the user has logged in with username {string} and password {string}")
    public void theUserHasLoggedInWithUsernameAndPassword(String arg0, String arg1) {
    }
}
