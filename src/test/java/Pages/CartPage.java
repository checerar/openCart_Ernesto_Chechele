package Pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Slf4j
public class CartPage extends AbstractPage {

    public static final String PAGE_URL = "https://www.opencart.abstracta.us/cart.html";

    @FindBy(className = "alert alert-success alert-dismissible")
    private WebElement successMessage;

    @FindBy(xpath = "//div[@id='cart']//a[text()='MacBook']")
    private WebElement productInCart;

    @FindBy(xpath = "//button[@title='Remove']")
    private WebElement removeButton;


    public String getSuccessMessage() {
        return driver.findElement((By) successMessage).getText();
    }

    public boolean isProductInCart(String product) {

        return driver.findElements((By) productInCart).stream()
                .anyMatch(element -> element.getText().equals(product));
    }

    public void clickRemoveButton(String product) {
        driver.findElements((By) productInCart).stream()
                .filter(element -> element.getText().equals(product))
                .findFirst()
                .ifPresent(element -> element.findElement((By) removeButton).click());
    }

    public CartPage(WebDriver driver) {
        super(driver);

    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }
}