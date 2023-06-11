package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CheckoutStepDefs {

    @Given("the user is on the checkout page")
    public void userIsOnCheckoutPage() {
        // Implementa aquí la lógica para navegar a la página de checkout
    }

    @When("the user chooses {string} on Step 2: Billing Details")
    public void chooseBillingDetails(String billingDetails) {
        // Implementa aquí la lógica para elegir los detalles de facturación indicados
    }

    @When("clicks on the Continue button")
    public void clickContinueButton() {
        // Implementa aquí la lógica para hacer clic en el botón "Continue"
    }

    @When("the user chooses {string} on Step 3: Delivery Details")
    public void chooseDeliveryDetails(String deliveryDetails) {
        // Implementa aquí la lógica para elegir los detalles de entrega indicados
    }

    @When("the user chooses {string} on Step 4: Delivery Method")
    public void chooseDeliveryMethod(String deliveryMethod) {
        // Implementa aquí la lógica para elegir el método de entrega indicado
    }

    @When("the user chooses {string} on Step 5: Payment Method")
    public void choosePaymentMethod(String paymentMethod) {
        // Implementa aquí la lógica para elegir el método de pago indicado
    }

    @When("checks the {string}")
    public void checkTermsAndConditions(String checkbox) {
        // Implementa aquí la lógica para marcar la casilla de términos y condiciones indicada
    }

    @When("clicks on the Continue Button")
    public void clickContinueButton2() {
        // Implementa aquí la lógica para hacer clic en el botón "Continue"
    }

    @Then("the user should see the Confirm Order form with details")
    public void verifyConfirmOrderForm() {
        // Implementa aquí la lógica para verificar que el usuario vea el formulario de confirmación del pedido
    }

    @Then("the user can click on the Confirm Order button")
    public void clickConfirmOrderButton() {
        // Implementa aquí la lógica para hacer clic en el botón "Confirm Order"
    }

    @Then("the user is redirected to the checkout success page")
    public void verifyCheckoutSuccessPage() {
        // Implementa aquí la lógica para verificar que el usuario sea redirigido a la página de éxito del checkout
    }

    @Then("should see a successful message: {string}")
    public void verifySuccessMessage(String message) {
        // Implementa aquí la lógica para verificar el mensaje de éxito indicado
    }
}
