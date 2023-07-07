package Pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.TimeoutException;
@Slf4j
public class LoginPage extends AbstractPage {


/*private WebElement usernameField;
private WebElement passwordField;
private WebElement loginButton;
private WebElement forgotPasswordLink;
*/
    private By usernameField = By.id("input-email");
    private By passwordField = By.id("input-password");
    private By loginButton = By.xpath("//div[@class='well']//input[@value='Login']");
    private By forgotPasswordLink = By.linkText("Forgotten Password");

    public LoginPage(WebDriver driver) {
        super(driver);
        //PagesFactory.initElements(driver, this);
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return (WebElement) loginButton;
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

    public void clickForgotPasswordLink() {
        getDriver().findElement(forgotPasswordLink).click();
    }

    public void navigateToLoginPage() { getDriver().get("https://demo.opencart.com/index.php?route=account/login");
    }

    public void enterCredentials(String username, String password) {    enterUsername(username);
        enterPassword(password);

    }

    public void enterInvalidCredentials(String invusername, String invpassword) {   enterUsername(invusername);
        enterPassword(invpassword);
    }

    public void enterEmailAddress(String email) {
        enterUsername(email);

    }

    public void verifyRedirectToHomePage() {
        getDriver().get("https://demo.opencart.com/index.php?route=common/home");
    }

    public void verifyInvalidCredentialsErrorMessage() {
        getDriver().findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));

    }

    public void verifyRedirectToPasswordRecoveryPage() {
        getDriver().get("https://demo.opencart.com/index.php?route=account/forgotten");
    }

    public void verifyMessage(String message) {
        getDriver().findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
    }
}
