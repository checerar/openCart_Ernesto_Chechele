package Pages;

import Utils.ConfigReader;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Slf4j
public class HomeValidationPage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeValidationPage.class);

    public HomeValidationPage(WebDriver driver) throws InterruptedException{
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }
    public void NavigationBar(String category) {
        String xpath = "//ul[@class='nav navbar-nav']/li/a[contains(text(), '" + category + "')]";
        WebElement categoryElement = driver.findElement(By.xpath(xpath));
        categoryElement.click();
    }
    public void RedirectedToThePage(String url) {
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("User is not redirected to the expected URL", url, currentURL);
    }

    public void SearchBar(String product) {
        WebElement searchBar = driver.findElement(By.id("search"));
        searchBar.click();
        WebElement searchElement = driver.findElement(By.xpath("//input[@class='form-control input-lg']"));
        searchElement.sendKeys(product);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();
    }

    public void SearchResults(String results) {
        List<WebElement> resultList = driver.findElements(By.className("product-thumb"));
        int expectedResults = Integer.parseInt(results);
        int actualResults = resultList.size();

        Assert.assertEquals("Number of search results does not match", expectedResults, actualResults);

    }
    public void ClicksLinksFooter(String link) {
        WebElement footerLink = driver.findElement(By.linkText(link));
        wait.until(ExpectedConditions.elementToBeClickable(footerLink));
        footerLink.click();
    }
    public void URLWithTitle(String url, String title) {
        String currentURL = driver.getCurrentUrl();
        String currentTitle = driver.getTitle();

        Assert.assertEquals("User is not redirected to the expected URL", url, currentURL);
        Assert.assertEquals("User is not redirected to the expected page", title, currentTitle);
    }

    public void MyAccountSection(String account) {
        WebElement myAccountLink = driver.findElement(By.linkText(account));
        myAccountLink.click();
    }

    public void RelativeUrlPageTitle(String relativeUrl, String pageTitle) {
        LOGGER.info("Starting URLWithTitle...");
        String baseUrl = ConfigReader.getBaseUrl();
        String expectedUrl = baseUrl + relativeUrl;

        String currentURL = driver.getCurrentUrl();
        String currentTitle = driver.getTitle();
        LOGGER.info("Expected URL: " + expectedUrl);
        LOGGER.info("Actual URL: " + currentURL);
        LOGGER.info("Expected Title: " + pageTitle);
        LOGGER.info("Actual Title: " + currentTitle);

        if (currentURL.startsWith("http://")) {
            currentURL = "https://" + currentURL.substring(7);
        }

        Assert.assertEquals("User is not redirected to the expected URL", expectedUrl, currentURL);
        Assert.assertEquals("User is not redirected to the expected page", pageTitle, currentTitle);
        LOGGER.info("URLWithTitle finished successfully.");
    }
}





