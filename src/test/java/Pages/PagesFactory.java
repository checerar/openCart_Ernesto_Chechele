package Pages;

import org.openqa.selenium.WebDriver;

public class PagesFactory {

    private static PagesFactory pagesFactories;
    private final WebDriver driver;

        private final RegistrationPage registrationPage;
        private final LoginPage loginPage;
       private final LogoutPage logoutPage;
        //private final CartPage cartPage;
        private final CheckoutPage checkoutPage;
       private final HomeValidationPage homeValidationPage;


        //constructor
    private PagesFactory(WebDriver driver) throws InterruptedException {
            this.driver = driver;
            registrationPage = new RegistrationPage(driver);
            loginPage = new LoginPage(driver);
         logoutPage = new LogoutPage(driver);
            //cartPage = new CartPage(driver);
            checkoutPage = new CheckoutPage(driver);
            homeValidationPage = new HomeValidationPage(driver);

        }


        public static void start (WebDriver driver) throws InterruptedException {

            pagesFactories = new PagesFactory(driver);
        }


        public WebDriver getDriver () {

            return driver;

        }

        public static PagesFactory getInstance () {

            return pagesFactories;
        }


        public static PagesFactory getPagesFactories () {

            return pagesFactories;
        }


       public RegistrationPage getRegistrationPage () {

         return registrationPage;

       }

        public LoginPage getLoginPage () {

            return loginPage;

        }

        public LogoutPage getLogoutPage () {

           return logoutPage;

        }

        //public CartPage getCartPage () {

          //  return cartPage;

       // }

        public CheckoutPage getCheckoutPage () {

            return checkoutPage;
        }

        public HomeValidationPage getHomeValidationPage () {

                return homeValidationPage;
        }

    }

