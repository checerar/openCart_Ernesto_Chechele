package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Locators
    private By successMessage = By.className("alert alert-success alert-dismissible");
    private By productInCart = By.xpath("//div[@id='cart']//a[text()='MacBook']");
    private By removeButton = By.xpath("//button[@title='Remove']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    public boolean isProductInCart(String product) {
        return driver.findElements(productInCart).stream()
                .anyMatch(element -> element.getText().equals(product));
    }

    public void clickRemoveButton(String product) {
        driver.findElements(productInCart).stream()
                .filter(element -> element.getText().equals(product))
                .findFirst()
                .ifPresent(element -> element.findElement(removeButton).click());
    }
}
