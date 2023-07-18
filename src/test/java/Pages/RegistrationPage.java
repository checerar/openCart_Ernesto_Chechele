package Pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;
import org.junit.Assert;
@Slf4j
public class RegistrationPage extends AbstractPage {

    @FindBy(xpath = "//ul/li/a[contains(text(),'Register')]")
    private WebElement registerLink;
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement enterFirstName;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement enterLastName;
    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement enterTelephone;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement enterEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement enterPassword;
    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement enterPasswordConfirm;
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement checkPrivacyPolicy;

    @FindBy(xpath = "//p[contains(text(), 'Congratulations!')]")
    private WebElement successMessageElement;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement errorMessage;

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String EMAIL_DOMAIN = "example.com";
    private static final int TELEPHONE_LENGTH = 9;
    private static Random random = new Random();

    public RegistrationPage(WebDriver driver) throws InterruptedException {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return registerLink;
    }

    public void navigateToRegistrationPage() {
        String expectedUrl = "https://opencart.abstracta.us/index.php?route=account/register";
        navigateToUrl(expectedUrl);
    }

    public void fillRegistrationForm(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        enterFirstName.sendKeys(firstName);
        enterLastName.sendKeys(lastName);
        enterEmail.sendKeys(email);
        enterTelephone.sendKeys(telephone);
        enterPassword.sendKeys(password);
        enterPasswordConfirm.sendKeys(passwordConfirm);
    }


    public void clickPrivacyPolicy() {
        checkPrivacyPolicy.click();
    }

    public boolean isSuccessfulRegistrationMessageDisplayed() {
        return successMessageElement.isDisplayed();
    }


    private String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    private String generateRandomEmail() {
        String username = generateRandomString(10);
        return username + "@" + EMAIL_DOMAIN;
    }

    private String generateRandomTelephone() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TELEPHONE_LENGTH; i++) {
            sb.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        }
        return sb.toString();
    }

    public String getRandomFirstName() {
        return generateRandomString(8);
    }

    public String getRandomLastName() {
        return generateRandomString(10);
    }

    public String getRandomEmail() {
        return generateRandomEmail();
    }

    public String getRandomTelephone() {
        return generateRandomTelephone();
    }

    public String getRandomPassword() {
        return generateRandomString(8);
    }

    private void navigateToUrl(String expectedUrl) {
        getDriver().get(expectedUrl);
        verifyCurrentUrl(expectedUrl);
    }
    private void verifyCurrentUrl(String expectedUrl) {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }
    public String getErrorMessage(String field) {
        String xpath = "//div[@class='col-sm-10']//input[@name='" + field + "']/following-sibling::div[@class='text-danger']";
        WebElement errorElement = driver.findElement(By.xpath(xpath));
        return errorElement.getText();
    }

    public boolean isErrorMessageDisplayed(String s) {
        return errorMessage.isDisplayed();
    }

    public void setEmail(String email) {
        enterEmail.sendKeys(email);
    }

    public void verifyErrorMessage(String errorMessage) {
        String xpath = String.format("//div[@class='alert alert-danger alert-dismissible']", errorMessage);
        WebElement errorMessageElement = driver.findElement(By.xpath(xpath));
        Assert.assertTrue("Error message not displayed: " + errorMessage, errorMessageElement.isDisplayed());
    }



    public void clearEmailField() {
        enterEmail.clear();
    }
}


