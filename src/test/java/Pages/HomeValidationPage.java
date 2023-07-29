package Pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
