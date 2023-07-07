package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FooterLinksPage extends AbstractPage {
    private WebDriver driver;

    // Locators
    private By informationSection = By.name("Information");
    private By customerServiceSection = By.name("Customer Service");
    private By extrasSection = By.name("Extras");
    private By myAccountSection = By.name("My Account");

    public FooterLinksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }
    public void clickInformationLink(String link) {
        WebElement informationSectionElement = driver.findElement(informationSection);
        WebElement linkElement = informationSectionElement.findElement(By.linkText(link));
        linkElement.click();
    }

    public void clickCustomerServiceLink(String link) {
        WebElement customerServiceSectionElement = driver.findElement(customerServiceSection);
        WebElement linkElement = customerServiceSectionElement.findElement(By.linkText(link));
        linkElement.click();
    }

    public void clickExtrasLink(String link) {
        WebElement extrasSectionElement = driver.findElement(extrasSection);
        WebElement linkElement = extrasSectionElement.findElement(By.linkText(link));
        linkElement.click();
    }

    public void clickMyAccountLink(String link) {
        WebElement myAccountSectionElement = driver.findElement(myAccountSection);
        WebElement linkElement = myAccountSectionElement.findElement(By.linkText(link));
        linkElement.click();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
