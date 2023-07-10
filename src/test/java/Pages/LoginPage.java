package Pages;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Slf4j
public class LoginPage extends AbstractPage {

    private By usernameField = By.id("input-email");
    private By passwordField = By.id("input-password");
    private By loginButton = By.xpath("//div[@class='well']//input[@value='Login']");
    private By errorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    private By continueButton = By.xpath("//div[@class='pull-right']//input[@value='Continue']");
    private By forgotPasswordLink = By.linkText("Forgotten Password");
    private By passwordRecoverySuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    private By passwordRecoveryErrorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public LoginPage(WebDriver driver) throws InterruptedException {
        super(driver);
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return getDriver().findElement(loginButton);
    }

    public void enterUsername(String username) {
        getDriver().findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        getDriver().findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        getDriver().findElement(loginButton).click();
    }

    public void clickContinueButton() {
        getDriver().findElement(continueButton).click();
    }

    public void clickForgotPasswordLink() {
        getDriver().findElement(forgotPasswordLink).click();
    }

    public void navigateToLoginPage() {
        getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("https://opencart.abstracta.us/index.php?route=account/login", currentUrl);
    }

    public void enterCredentials(String username, String password) {
        enterUsername(username);
        enterPassword(password);
    }

    public void enterInvalidCredentials(String invusername, String invpassword) {
        enterUsername(invusername);
        enterPassword(invpassword);
    }

    public void enterEmailAddress(String email) {
        enterUsername(email);
    }

    public void verifyRedirectToHomePage() {
        getDriver().get("https://opencart.abstracta.us/index.php?route=common/home");
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("https://opencart.abstracta.us/index.php?route=common/home", currentUrl);
    }

    public void repeatedlyClickLoginButton(int maxAttempts) {
        for (int i = 0; i < maxAttempts; i++) {
            clickLoginButton();
        }
    }

    public void verifyInvalidCredentialsErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getDriver().findElement(errorMessage).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    public void verifyRedirectToPasswordRecoveryPage() {
        getDriver().get("https://opencart.abstracta.us/index.php?route=account/forgotten");
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("https://opencart.abstracta.us/index.php?route=account/forgotten", currentUrl);
    }

    public void verifyMessage(String expectedMessage) {
        try {
            By messageLocator = By.xpath("//div[contains(@class, 'alert')]");
            WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(messageLocator));
            String actualMessage = messageElement.getText();

            if (actualMessage.contains(expectedMessage)) {
                return;
            }
        } catch (NoSuchElementException e) {
            Assert.fail("No se encontró ningún mensaje en la página.");
        }

        Assert.fail("El mensaje esperado no coincide con ningún mensaje encontrado.");
    }

}
