package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage extends AbstractPage {

    private final By myAccount = By.xpath("//span[@class='caret']");
    private final By clickLogout = By.xpath("//ul/li/a[contains(text(), 'Logout')]");
    private final By successMessage = By.xpath("//p[contains(text(), 'You have been logged off your account. It is now safe to leave the computer.')]");

    public LogoutPage(WebDriver driver) throws InterruptedException {
        super(driver);
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return getDriver().findElement(myAccount);
    }

    public void clickMenu(String menuText)  {
        getDriver().findElement(myAccount).click();
    }

    public void clickOption(String optionText) {
        getDriver().findElement(clickLogout).click();
    }

    public void verifyRedirectToLogoutPage() {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("https://opencart.abstracta.us/index.php?route=account/logout", currentUrl);
    }

    public void verifySuccessMessage(String expectedMessage) {
        String actualMessage = getDriver().findElement(successMessage).getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    public void navigateToDifferentPage(String url) {
        getDriver().get(url);
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(url, currentUrl);
    }
}
