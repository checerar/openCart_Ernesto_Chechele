package StepDefs;
import Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegistrationStepDefs {

    private WebDriver driver;
    private RegistrationPage registrationPage;

    public RegistrationStepDefs(WebDriver driver) {
        this.driver = driver;
        this.registrationPage = new RegistrationPage(driver);
    }
    @Given("the user is on the home page")
    public void userIsOnHomePage() {
        // Navegar a la página de inicio
        driver.get("http://opencart.abstracta.us");
    }

    @Given("clicks on My Account")
    public void clickOnMyAccount() {
        // Implementa aquí la lógica para hacer clic en "My Account"
    }

    @Given("clicks on Register option")
    public void clickOnRegisterOption() {
        // Implementa aquí la lógica para hacer clic en "Register" (opción de registro)
    }

    @When("the user fills in all the mandatory {string} with {string}")
    public void fillInMandatoryFields(String field, String value) {
        // Implementa aquí la lógica para llenar los campos obligatorios con los valores proporcionados
    }

    @When("clicks in the checkbox of the Privacy Policy")
    public void clickPrivacyPolicyCheckbox() {
        // Implementa aquí la lógica para hacer clic en la casilla de verificación de la Política de Privacidad
    }

    @When("clicks on the {string} button")
    public void clickContinueButton(String button) {
        // Implementa aquí la lógica para hacer clic en el botón "Continue" o similar
    }

    @Then("the user should receive a success message indicating successful registration")
    public void verifySuccessMessage() {
        // Implementa aquí la lógica para verificar el mensaje de éxito de registro
    }

    @Then("the user should see an error message")
    public void verifyErrorMessage() {
        // Implementa aquí la lógica para verificar el mensaje de error
    }

    @Then("the user should see an error message indicating that they must agree to the Privacy Policy")
    public void verifyPrivacyPolicyErrorMessage() {
        // Implementa aquí la lógica para verificar el mensaje de error de Política de Privacidad
    }

    @Then("the user should see an error message indicating that the E-Mail Address is already registered")
    public void verifyExistingEmailErrorMessage() {
        // Implementa aquí la lógica para verificar el mensaje de error de correo electrónico existente
    }
}
