package StepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LogoutStepDefs {

    @Given("the user is logged in to the website")
    public void userIsLoggedIn() {
        // Implementa aquí la lógica para iniciar sesión en el sitio web
    }

    @When("the user clicks on the {string} menu")
    public void clickMenu(String menu) {
        // Implementa aquí la lógica para hacer clic en el menú indicado (por ejemplo, "My Account")
    }

    @When("the user clicks on the {string} option")
    public void clickOption(String option) {
        // Implementa aquí la lógica para hacer clic en la opción indicada (por ejemplo, "Logout")
    }

    @When("the user navigates to a different page {string} while being logged in")
    public void navigateToDifferentPage(String url) {
        // Implementa aquí la lógica para navegar a una página diferente mientras se está logueado
    }

    @Then("the user should be redirected to the logout page")
    public void verifyRedirectToLogoutPage() {
        // Implementa aquí la lógica para verificar que el usuario sea redirigido a la página de logout
    }

    @Then("the user should see a success message: {string}")
    public void verifySuccessMessage(String message) {
        // Implementa aquí la lógica para verificar el mensaje de éxito proporcionado
    }
}
