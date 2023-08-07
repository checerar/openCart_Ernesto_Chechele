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

    private final By usernameField = By.id("input-email");
    private final By passwordField = By.id("input-password");
    private final By loginButton = By.xpath("//div[@class='well']//input[@value='Login']");
    private final By errorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    private final By continueButton = By.xpath("//div[@class='pull-right']//input[@value='Continue']");
    private final By forgottenPasswordLink = By.linkText("Forgotten Password");
    private final By logInLink = By.linkText("Login");
    private final By myAccountLink = By.linkText("My Account");

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

    public void clickForgottenPasswordLink() {
        getDriver().findElement(forgottenPasswordLink).click();
    }

    public void clickMyAccountLink() {
        getDriver().findElement(myAccountLink).click();
    }

    public void navigateToHomePage() {
        String expectedUrl = "https://opencart.abstracta.us/";
        navigateToUrl(expectedUrl);
    }

    public void clickLoginLink() {
        getDriver().findElement(logInLink).click();
    }

    public void navigateToLoginPage() {
        String expectedUrl = "https://opencart.abstracta.us/index.php?route=account/login";
        navigateToUrl(expectedUrl);
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

    public void verifyRedirectToAccountPage() {
        String expectedUrl = "https://opencart.abstracta.us/index.php?route=account/account";
        verifyCurrentUrl(expectedUrl);
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
        String expectedUrl = "https://opencart.abstracta.us/index.php?route=account/forgotten";
        verifyCurrentUrl(expectedUrl);
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

    private void navigateToUrl(String expectedUrl) {
        getDriver().get(expectedUrl);
        verifyCurrentUrl(expectedUrl);
    }

    private void verifyCurrentUrl(String expectedUrl) {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    public void clickRegisterLink() {
        By registerLink = By.linkText("Register");
        getDriver().findElement(registerLink).click();
    }
}
