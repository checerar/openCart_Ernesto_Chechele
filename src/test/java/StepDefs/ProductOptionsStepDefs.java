package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProductOptionsStepDefs {

    @Given("the user is logged in")
    public void userIsLoggedIn() {
        // Implementa aquí la lógica para iniciar sesión como usuario
    }

    @When("the user searches for the product {string} in the search bar")
    public void searchProduct(String product) {
        // Implementa aquí la lógica para realizar la búsqueda del producto en la barra de búsqueda
    }

    @Then("the user should see {int} search results")
    public void verifySearchResults(int number) {
        // Implementa aquí la lógica para verificar el número de resultados de búsqueda mostrados
    }
}
