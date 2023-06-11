package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class NavigationLinksStepDefs {

    @Given("a user is on the home page")
    public void userIsOnHomePage() {
        // Implementa aquí la lógica para navegar a la página de inicio
    }

    @When("the user clicks on {string} in the navigation bar")
    public void clickNavigationLink(String title) {
        // Implementa aquí la lógica para hacer clic en el enlace de navegación indicado
    }

    @Then("the user should see a dropdown menu with {int} options (if applicable)")
    public void verifyDropdownMenuOptions(int options) {
        // Implementa aquí la lógica para verificar el número de opciones en el menú desplegable
    }

    @Then("the user should be redirected to the URL {string} (if applicable)")
    public void verifyRedirectToURL(String url) {
        // Implementa aquí la lógica para verificar la redirección a la URL indicada
    }
}
