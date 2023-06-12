package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends AbstractPage{
    private WebDriver driver;

    // Locators
    private By billingDetailsDropdown = By.xpath("//input[@type='radio' and @name='payment_address' and @value='existing']");

    private By continueButtonBilling = By.id("button-payment-address");
    private By deliveryDetailsDropdown = By.xpath("//input[@type='radio' and @name='shipping_address' and @value='existing']");

    private By continueButtonDetails = By.id("button-shipping-address");

    private By deliveryMethodDropdown = By.xpath("//input[@type='radio' and @name='shipping_method' and @value='flat.flat']");
    private By continueButtonMethod = By.id("button-shipping-method");
    private By paymentMethodDropdown = By.xpath("//input[@type='radio' and @name='payment_method' and @value='bank_transfer']");
    private By termsAndConditionsCheckbox = By.xpath("//input[@type='checkbox' and @name='agree']");
    private By continueButtonPayment = By.id("button-payment-method");
    private By confirmOrderButton = By.id("button-confirm");
    private By successMessage = By.xpath("//div[@id='content' and contains(@class, 'col-sm-12')]//h1[text()='Your order has been placed!']");
            ;


    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }

    public void chooseBillingDetails(String billingDetails) {
        selectOptionFromDropdown(billingDetailsDropdown, billingDetails);
    }

    public void clickContinueButtonBilling() {
        driver.findElement(continueButtonBilling).click();
    }

    public void chooseDeliveryDetails(String deliveryDetails) {
        selectOptionFromDropdown(deliveryDetailsDropdown, deliveryDetails);
    }
   public void clickContinueButtonDetails() {
        driver.findElement(continueButtonDetails).click();
    }

    public void chooseDeliveryMethod(String deliveryMethod) {
        selectOptionFromDropdown(deliveryMethodDropdown, deliveryMethod);
    }
 public void clickContinueButtonMethod() {
        driver.findElement(continueButtonMethod).click();
    }

    public void choosePaymentMethod(String paymentMethod) {
        selectOptionFromDropdown(paymentMethodDropdown, paymentMethod);
    }


    public void checkTermsAndConditions() {
        WebElement checkbox = driver.findElement(termsAndConditionsCheckbox);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void clickContinueButtonPayment() {
        driver.findElement(continueButtonPayment).click();
    }

    public void clickConfirmOrderButton() {
        driver.findElement(confirmOrderButton).click();
    }

    public boolean isCheckoutSuccessPageDisplayed() {
        return driver.getCurrentUrl().contains("checkout/success");
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    private void selectOptionFromDropdown(By dropdownLocator, String option) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        dropdown.click();
        dropdown.findElement(By.xpath("//option[text()='" + option + "']")).click();
    }
}
