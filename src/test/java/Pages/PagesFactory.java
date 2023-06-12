package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.serviceworker.model.RegistrationID;

public class PagesFactory extends AbstractPage {
    private static PagesFactory pagesFactories;
    private final WebDriver driver;
    private final RegistrationPage registrationPage;
    private final LoginPage loginPage;
    private final LogoutPage logoutPage;
    private final CartPage cartPage;
    private final CheckoutPage checkoutPage;
    private final ProductOptionsPage productOptionsPage;

    private final NavigationLinksPage navigationLinksPage;

    private final FooterLinksPage footerLinksPage;

    //constructor
    private PagesFactory(WebDriver driver) {
        super(driver);
        this.driver = driver;
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        productOptionsPage = new ProductOptionsPage(driver);
        navigationLinksPage = new NavigationLinksPage(driver);
        footerLinksPage = new FooterLinksPage(driver);

    }

    @Override
    public WebElement getPageLoadedTestElement() {
        return null;
    }


    public static void start(WebDriver driver) {

        pagesFactories = new PagesFactory(driver);
    }


    public WebDriver getDriver() {

        return driver;

    }

    public static PagesFactory getInstance() {

        return pagesFactories;
    }


    public static PagesFactory getPagesFactories() {

        return pagesFactories;
    }


    public RegistrationPage getRegistrationPage() {

        return registrationPage;

    }

    public LoginPage getLoginPage() {

        return loginPage;

    }

    public LogoutPage getLogoutPage() {

        return logoutPage;

    }

    public CartPage getCartPage() {

        return cartPage;

    }

    public CheckoutPage getCheckoutPage() {

        return checkoutPage;
    }

    public ProductOptionsPage getProductOptionsPage() {
        return productOptionsPage;
    }

    public NavigationLinksPage getNavigationLinksPage() {
        return navigationLinksPage;
    }

    public FooterLinksPage getFooterLinksPage() {
        return footerLinksPage;
    }
}

