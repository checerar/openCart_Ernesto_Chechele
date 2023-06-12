package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogoutPage extends AbstractPage{
    private WebDriver driver;

    // Locators
    private By successMessage = By.id("content");

    public LogoutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
