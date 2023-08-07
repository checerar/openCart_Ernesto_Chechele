package StepDefs;

import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.PagesFactory;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutStepDefs {

    CheckoutPage checkoutPage = PagesFactory.getInstance().getCheckoutPage();

    @And("the user clicks on the Checkout link")
    public void ClicksCheckoutLink() {
        checkoutPage.checkoutLink();
    }
    @And("the user provides the billing details {string}")
    public void billingDetails(String billingDetails) {
        checkoutPage.billingDetails(billingDetails);
    }

    @And("clicks on the Continue button with name: {string}")
    public void continueButton(String buttonName) {
        checkoutPage.clickContinueButton(buttonName);
    }
    @And("the user provides the delivery details {string}")
    public void deliveryDetails(String deliveryDetails) {
        checkoutPage.deliveryDetails(deliveryDetails);
    }

    @And("the user selects the delivery method {string}")
    public void deliveryMethod(String deliveryMethod) {
        checkoutPage.deliveryMethod(deliveryMethod);
    }

    @And("the user selects the payment method {string}")
    public void paymentMethod(String paymentMethod) {
        checkoutPage.paymentMethod(paymentMethod);
    }

    @And("checks the Terms&Conditions checkbox")
    public void termsAndConditions() {
        checkoutPage.termsAndConditions();
    }

    @Then("the user should see the Confirm Order form with details")
    public void confirmOrderForm() {
        checkoutPage.orderForm();
    }

    @And("the user can click on the Confirm Order button")
    public void confirmOrderButton() {
        checkoutPage.orderButton();
    }

    @And("the user is redirected to the checkout success page with the message: {string}")
    public void CheckoutSuccess(String message) {
        checkoutPage.checkoutSuccess(message);
    }
}

