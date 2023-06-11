package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class FooterLinksStepDefs {

    @Given("the user is on the home page")
    public void userIsOnHomePage() {
        // Implementa aquí la lógica para navegar a la página de inicio
    }

    @When("the user clicks on {string} in the Information section of the footer")
    public void clickInformationLink(String link) {
        // Implementa aquí la lógica para hacer clic en el enlace correspondiente de la sección de Información del footer
    }

    @When("the user clicks on {string} in the Customer Service section of the footer")
    public void clickCustomerServiceLink(String link) {
        // Implementa aquí la lógica para hacer clic en el enlace correspondiente de la sección de Atención al cliente del footer
    }

    @When("the user clicks on {string} in the Extras section of the footer")
    public void clickExtrasLink(String link) {
        // Implementa aquí la lógica para hacer clic en el enlace correspondiente de la sección de Extras del footer
    }

    @When("the user is logged in and clicks on {string} in the My Account section of the footer")
    public void clickMyAccountLink(String link) {
        // Implementa aquí la lógica para hacer clic en el enlace correspondiente de la sección de Mi cuenta del footer
    }

    @Then("the user should be redirected to the corresponding page with the title: {string}")
    public void verifyPageTitle(String title) {
        // Implementa aquí la lógica para verificar que el usuario sea redirigido a la página correspondiente y tenga el título correcto
    }

    @Then("the user should be redirected to the corresponding URL {string} with the title: {string}")
    public void verifyURLAndTitle(String url, String title) {
        // Implementa aquí la lógica para verificar que el usuario sea redirigido a la URL correspondiente y tenga el título correcto
    }
}
