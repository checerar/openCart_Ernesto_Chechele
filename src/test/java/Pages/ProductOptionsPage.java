package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductOptionsPage extends AbstractPage{
    private WebDriver driver;

    // Locators
    private By searchBar = By.xpath("//input[@class='form-control input-lg' and @name='search']");
    private By searchButton = By.className("btn btn-default btn-lg");
    private By searchResults = By.xpath("//div[@class='product-thumb']");

    public ProductOptionsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }

    public void searchProduct(String product) {
        WebElement searchInput = driver.findElement(searchBar);
        searchInput.clear();
        searchInput.sendKeys(product);
        driver.findElement(searchButton).click();
    }

    public int getSearchResultsCount() {
        return driver.findElements(searchResults).size();
    }
}
