package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends AbstractPage{
    private WebDriver driver;

    // Locators
    private By successMessage = By.id("content");

    public LogoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
