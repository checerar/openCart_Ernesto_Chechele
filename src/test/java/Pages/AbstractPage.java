package Pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static java.lang.Thread.sleep;

@Slf4j
public abstract class AbstractPage {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    AbstractPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        sleep(1000);
    }

    public abstract WebElement getPageLoadedTestElement();

    protected WebDriver getDriver() {
        return driver;
    }

    protected boolean isPageLoaded(WebElement element) {
        boolean isLoaded = false;
        try {
            isLoaded = element.isDisplayed();
        } catch (NoSuchElementException elementException) {
            elementException.printStackTrace();
        }
        return isLoaded;
    }


}
