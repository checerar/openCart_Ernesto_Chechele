package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefs {

    @Given("the user is registered")
    public void userIsRegistered() {
        // Implementa aquí la lógica para registrar al usuario previamente
    }

    @Given("is in the login page")
    public void userIsInLoginPage() {
        // Implementa aquí la lógica para navegar a la página de inicio de sesión
    }

    @When("the user enters valid credentials {string} and {string}")
    public void enterValidCredentials(String username, String password) {
        // Implementa aquí la lógica para ingresar las credenciales válidas proporcionadas
    }

    @When("the user enters invalid credentials {string} and {string}")
    public void enterInvalidCredentials(String username, String password) {
        // Implementa aquí la lógica para ingresar las credenciales inválidas proporcionadas
    }

    @When("clicks on the {string} button")
    public void clickButton(String button) {
        // Implementa aquí la lógica para hacer clic en el botón indicado (por ejemplo, "Login" o "Continue")
    }

    @When("the user clicks on the {string} link")
    public void clickForgotPasswordLink(String link) {
        // Implementa aquí la lógica para hacer clic en el enlace indicado (por ejemplo, "Forgot Password")
    }

    @When("the user enters their email address {string} in the provided field")
    public void enterEmailAddress(String email) {
        // Implementa aquí la lógica para ingresar la dirección de correo electrónico proporcionada en el campo correspondiente
    }

    @Then("the user should be redirected to the home page")
    public void verifyRedirectToHomePage() {
        // Implementa aquí la lógica para verificar que el usuario sea redirigido a la página de inicio
    }

    @Then("the user should receive an error message indicating that the credentials are invalid")
    public void verifyInvalidCredentialsErrorMessage() {
        // Implementa aquí la lógica para verificar el mensaje de error de credenciales inválidas
    }

    @Then("the user should be redirected to the password recovery page")
    public void verifyRedirectToPasswordRecoveryPage() {
        // Implementa aquí la lógica para verificar que el usuario sea redirigido a la página de recuperación de contraseña
    }

    @Then("the user should receive a message {string}")
    public void verifyMessage(String message) {
        // Implementa aquí la lógica para verificar el mensaje recibido por el usuario
    }
}
