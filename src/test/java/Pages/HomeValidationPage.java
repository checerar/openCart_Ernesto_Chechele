package Pages;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Slf4j
public class HomeValidationPage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(),'Desktops')]")
    private WebElement desktopsLink;

    @FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks')]")
    private WebElement laptopsNotebooksLink;

    @FindBy(xpath = "//a[contains(text(),'Components')]")
    private WebElement componentsLink;

    @FindBy(xpath = "//a[contains(text(),'Tablets')]")
    private WebElement tabletsLink;

    @FindBy(xpath = "//a[contains(text(),'Software')]")
    private WebElement softwareLink;

    @FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
    private WebElement phonesPDAsLink;

    @FindBy(xpath = "//a[contains(text(),'Cameras')]")
    private WebElement camerasLink;

    @FindBy(xpath = "//a[contains(text(),'MP3 Players')]")
    private WebElement mp3PlayersLink;

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchBar;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    private WebElement searchButton;

    public HomeValidationPage(WebDriver driver) throws InterruptedException{
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }

    public void clickDesktopsLink() {
        desktopsLink.click();
    }

    public void clickLaptopsNotebooksLink() {
        laptopsNotebooksLink.click();
    }

    public void clickComponentsLink() {
        componentsLink.click();
    }

    public void clickTabletsLink() {
        tabletsLink.click();
    }

    public void clickSoftwareLink() {
        softwareLink.click();
    }

    public void clickPhonesPDAsLink() {
        phonesPDAsLink.click();
    }

    public void clickCamerasLink() {
        camerasLink.click();
    }

    public void clickMP3PlayersLink() {
        mp3PlayersLink.click();
    }

    public void enterSearchProduct(String product) {
        searchBar.clear();
        searchBar.sendKeys(product);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void NavigationBar(String category) {
        String xpath = "//ul[@class='nav navbar-nav']/li/a[contains(text(), '" + category + "')]";
        WebElement categoryElement = driver.findElement(By.xpath(xpath));
        categoryElement.click();
    }
    public void RedirectedToThePage(String url) {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue("User is not redirected to the expected URL", currentURL.equals(url));
    }

    public void SearchBar(String product) {
        WebElement searchBar = driver.findElement(By.id("search-bar"));
        searchBar.sendKeys(product);
        searchBar.submit();
    }

    public void SearchResults(String results) {
        WebElement searchResults = driver.findElement(By.cssSelector(".search-results"));
        List<WebElement> resultList = searchResults.findElements(By.tagName("li"));

        int expectedResults = Integer.parseInt(results);
        int actualResults = resultList.size();

        Assert.assertEquals("Number of search results does not match", expectedResults, actualResults);
    }
    public void InformationLink(String information) {
        WebElement informationLink = driver.findElement(By.linkText(information));
        informationLink.click();
    }

    public void ToURLWithTitle(String url, String title) {
        String currentURL = driver.getCurrentUrl();
        String currentTitle = driver.getTitle();

        Assert.assertTrue("User is not redirected to the expected URL", currentURL.equals(url));
        Assert.assertTrue("User is not redirected to the expected page", currentTitle.equals(title));
    }

    public void CustomerServiceLink(String customer) {
        WebElement customerServiceLink = driver.findElement(By.linkText(customer));
        customerServiceLink.click();
    }


    public void ExtrasSection(String extras) {
        WebElement extrasLink = driver.findElement(By.linkText(extras));
        extrasLink.click();
            }


    public void MyAccountSection(String account) {
        WebElement myAccountLink = driver.findElement(By.linkText(account));
        myAccountLink.click();
    }
}




