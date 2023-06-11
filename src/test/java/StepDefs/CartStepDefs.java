package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CartStepDefs {

    @Given("the user is logged in")
    public void userIsLoggedIn() {
        // Implementa aquí la lógica para el inicio de sesión del usuario
    }

    @When("the user clicks on the {string} button of a {string}")
    public void clickAddToCartButton(String button, String product) {
        // Implementa aquí la lógica para hacer clic en el botón "Add to Cart" del producto indicado
    }

    @Then("the {string} should be added to the shopping cart")
    public void verifyProductAddedToCart(String product) {
        // Implementa aquí la lógica para verificar que el producto indicado se haya añadido al carrito de compras
    }

    @Then("the user should see a success message: {string}")
    public void verifySuccessMessage(String message) {
        // Implementa aquí la lógica para verificar que se muestre el mensaje de éxito indicado
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
}
