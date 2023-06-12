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
        // Implementa aquí la lógica para hacer clic en el botón "Add to Cart" del producto indicado
    }

    @Then("the {string} should be added to the shopping cart")
    public void verifyProductAddedToCart(String product) {
        // Implementa aquí la lógica para verificar que el producto indicado se haya añadido al carrito de compras
    }


    @Given("the user has added a {string} to the shopping cart")
    public void userHasAddedProductToCart(String product) {
        // Implementa aquí la lógica para simular que el usuario ha agregado el producto indicado al carrito de compras
    }

    @When("the user clicks on the shopping cart icon")
    public void clickShoppingCartIcon() {
        // Implementa aquí la lógica para hacer clic en el icono del carrito de compras
    }

    @When("clicks on the {string} button next to the {string}")
    public void clickRemoveButton(String button, String product) {
        // Implementa aquí la lógica para hacer clic en el botón "Remove" junto al producto indicado
    }

    @Then("the {string} should be removed from the shopping cart")
    public void verifyProductRemovedFromCart(String product) {
        // Implementa aquí la lógica para verificar que el producto indicado se haya eliminado del carrito de compras
    }

    @Given("the user is on the {string} page")
    public void theUserIsOnThePage(String arg0) {
    }

    @And("the user has logged in with username {string} and password {string}")
    public void theUserHasLoggedInWithUsernameAndPassword(String arg0, String arg1) {
    }
}
