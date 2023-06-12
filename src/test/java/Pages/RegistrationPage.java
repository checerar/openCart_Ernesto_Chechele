package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends AbstractPage{
    private WebDriver driver;

    // Locators
    private By firstNameField = By.id("input-firstname");
    private By lastNameField = By.id("input-lastname");
    private By emailField = By.id("input-email");
    private By telephoneField = By.id("input-telephone");
    private By passwordField = By.id("input-password");
    private By confirmPasswordField = By.id("input-confirm");
    private By privacyPolicyCheckbox = By.xpath("//input[@type='checkbox']");
    private By continueButton = By.xpath("//div[@class='pull-right']//input[@value='Continue']");

    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterTelephone(String telephone) {
        driver.findElement(telephoneField).sendKeys(telephone);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickPrivacyPolicyCheckbox() {
        driver.findElement(privacyPolicyCheckbox).click();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
}
