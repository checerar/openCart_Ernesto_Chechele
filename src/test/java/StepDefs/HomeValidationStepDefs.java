package StepDefs;

import Pages.HomeValidationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import Pages.PagesFactory;


public class HomeValidationStepDefs {

        HomeValidationPage  homeValidationPage = PagesFactory.getInstance().getHomeValidationPage();

        @When("the user interacts with selected {string} categories in the navigation bar")
        public void NavigationBar(String category) {
            homeValidationPage.NavigationBar(category);
        }

        @Then("the user should be redirected to the {string} page \\(if applicable)")
        public void RedirectedToThePage(String url) {
                homeValidationPage.RedirectedToThePage(url);
        }

        @When("the user searches for the product {string} in the search bar")
        public void SearchBar(String product) {
                homeValidationPage.SearchBar(product);
        }
        @Then("the user should see the number of search {string} results")
        public void SearchResults(String results) {
                homeValidationPage.SearchResults(results);
        }
        @When("the user clicks on the {string} link in the footer")
        public void Footer(String link) {
                homeValidationPage.ClicksLinksFooter(link);
        }
        @Then("the user should be redirected to the URL {string} with the title: {string}")
        public void URLWithTitle(String url, String title) {
                homeValidationPage.URLWithTitle(url, title);
        }
        @And("clicks on the {string} link in the My Account section of the footer")
        public void MyAccountSection(String account) {
                homeValidationPage.MyAccountSection(account);
        }

        @Then("the user should be redirected to {string} with the title: {string}")
        public void RedirectedWithTheTitle(String relativeUrl, String pageTitle) {
                homeValidationPage.RelativeUrlPageTitle(relativeUrl, pageTitle);
        }
}




