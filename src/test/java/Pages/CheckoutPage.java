package Pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import java.util.List;
@Slf4j
public class CheckoutPage extends AbstractPage {

    private final By checkoutLink = By.linkText("Checkout");
    private final By existingPaymentOption = By.cssSelector("input[type='radio'][name='payment_address'][value='existing']");
    private final By existingDeliveryDetails = By.cssSelector("input[type='radio'][name='shipping_address'][value='existing']");
    private final By deliveryMethods = By.cssSelector("input[type='radio'][name='shipping_method'][value='flat.flat']");
    private final By transferPaymentMethod = By.cssSelector("input[type='radio'][name='payment_method'][value='bank_transfer']");
    private final By cashPaymentMethod = By.cssSelector("input[type='radio'][name='payment_method'][value='cod']");
    private final By termsAndConditions = By.name("agree");
    private final By confirmOrderButton = By.id("button-confirm");
    private final By order = By.className("table table-bordered table-hover");
    private final By billingContinueButton = By.id("button-payment-address");
    private final By deliveryContinueButton = By.id("button-shipping-address");
    private final By deliveryMethodContinueButton = By.id("button-shipping-method");
    private final By paymentContinueButton = By.id("button-payment-method");
    private final By checkout = By.xpath("//h1[contains((text(), 'Checkout')]");
    private final By checkoutSuccess = By.xpath("//h1[contains((text(), 'Your order has been placed!')]");

    public CheckoutPage(WebDriver driver) throws InterruptedException {
        super(driver);

    }
    @Override
    public WebElement getPageLoadedTestElement() {
        return getDriver().findElement(checkout);
    }

    public void checkoutLink() {
        getDriver().findElement(checkoutLink).click();
    }

    public void billingDetails(String billingDetails) {
        getDriver().findElement(existingPaymentOption).click();
    }
    public void clickContinueButton(String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "billing details":
                clickButton(billingContinueButton);
                break;
            case "delivery details":
                clickButton(deliveryContinueButton);
                break;
            case "delivery method":
                clickButton(deliveryMethodContinueButton);
                break;
            case "payment method":
                clickButton(paymentContinueButton);
                break;
            case "confirm order":
                clickButton(confirmOrderButton);
                break;
            default:
                throw new IllegalArgumentException("Botón de Continuar no encontrado: " + buttonName);
        }
    }

    private void clickButton(By buttonLocator) {
        try {
            WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
            continueButton.click();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("No se pudo encontrar el botón: " + buttonLocator);
        }
    }

    public void deliveryMethod(String deliveryMethod) {
        getDriver().findElement(deliveryMethods).click();
    }

    public void deliveryDetails(String deliveryDetails) {
        getDriver().findElement(existingDeliveryDetails).click();
    }
    public void paymentMethod(String paymentMethod) {
        if (paymentMethod.equals("Bank Transfer")) {
            getDriver().findElement(transferPaymentMethod).click();
        } else if (paymentMethod.equals("Cash On Delivery")) {
            getDriver().findElement(cashPaymentMethod).click();
        } else {
            throw new IllegalArgumentException("Método de pago no válido");
        }
    }

    public void termsAndConditions() {
        getDriver().findElement(termsAndConditions).click();
    }
    public boolean orderForm() {
        WebElement table = driver.findElement(order);
        String[] expectedCellTexts = {
                "Product Name",
                "Model",
                "Quantity",
                "Unit Price",
                "Total"
        };

        List<WebElement> cells = table.findElements(By.tagName("td"));
        List<String> actualCellTexts = new ArrayList<>();

        for (WebElement cell : cells) {
            actualCellTexts.add(cell.getText());
        }
        for (String expectedCellText : expectedCellTexts) {
            if (!actualCellTexts.contains(expectedCellText)) {
                return false;
            }
        }
        return true;
    }

    public void orderButton() {
        getDriver().findElement(confirmOrderButton).click();
    }

    public boolean checkoutSuccess(String message) {
        WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutSuccess));
        return successElement.getText().contains(message);
    }


}
