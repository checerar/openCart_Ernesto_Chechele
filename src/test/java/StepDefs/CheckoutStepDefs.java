package StepDefs;

import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.PagesFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CheckoutStepDefs {

    CheckoutPage checkoutPage = PagesFactory.getInstance().getCheckoutPage();
    @Given("the user is on the checkout page")
    public void userIsOnCheckoutPage() {
    }

    @When("the user chooses {string} on Step 2: Billing Details")
    public void chooseBillingDetails(String billingDetails) {
    }

    @When("clicks on the Continue button")
    public void clickContinueButton() {
    }

    @When("the user chooses {string} on Step 3: Delivery Details")
    public void chooseDeliveryDetails(String deliveryDetails) {
    }

    @When("the user chooses {string} on Step 4: Delivery Method")
    public void chooseDeliveryMethod(String deliveryMethod) {
    }

    @When("the user chooses {string} on Step 5: Payment Method")
    public void choosePaymentMethod(String paymentMethod) {
    }

    @When("checks the {string}")
    public void checkTermsAndConditions(String checkbox) {
    }

    @When("clicks on the Continue Button")
    public void clickContinueButton2() {
    }

    @Then("the user should see the Confirm Order form with details")
    public void verifyConfirmOrderForm() {
    }

    @Then("the user can click on the Confirm Order button")
    public void clickConfirmOrderButton() {
    }

    @Then("the user is redirected to the checkout success page")
    public void verifyCheckoutSuccessPage() {
    }

    @Then("should see a successful message: {string}")
    public void verifySuccessMessage(String message) {
    }
}
