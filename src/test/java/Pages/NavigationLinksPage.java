package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationLinksPage extends AbstractPage {
    private WebDriver driver;

    // Locators
    private By navigationBar = By.className("nav navbar-nav");
    private By dropdownMenu = By.className("dropdown-menu");

    public NavigationLinksPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }

    public void clickNavigationLink(String title) {
        WebElement navigationBarElement = driver.findElement(navigationBar);
        WebElement linkElement = navigationBarElement.findElement(By.linkText(title));
        linkElement.click();
    }

    public int getDropdownMenuOptionsCount() {
        WebElement dropdownMenuElement = driver.findElement(dropdownMenu);
        return dropdownMenuElement.findElements(By.tagName("li")).size();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}
