package StepDefs;

import Pages.HomeValidationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import Pages.PagesFactory;


public class HomeValidationStepDefs {

        HomeValidationPage  homeValidationPage = PagesFactory.getInstance().getHomeValidationPage();

        @When("the user interacts with the {string} in the navigation bar")
        public void NavigationBar(String category) {
        }
        @Then("the user should see the number of {string} options in the dropdown \\(if applicable)")
        public void Dropdown(String options) {
        }
        @And("the user should be redirected to the {string} page \\(if applicable)")
        public void RedirectedToThePage(String url) {
        }

        @When("the user searches for the product {string} in the search bar")
        public void SearchBar(String product) {
        }

        @Then("the user should see the number of search {string} results")
        public void SearchResults(String results) {
        }

        @When("the user clicks on {string} in the Information section of the footer")
        public void InformationLink(String list) {
        }

        @Then("the user should be redirected to the URL {string} with the title: {string}")
        public void ToURLWithTitle(String url, String title) {
        }

        @When("the user clicks on {string} in the Customer Service section of the footer")
        public void CustomerServiceLink(String list) {
        }


        @When("the user clicks on {string} in the Extras section of the footer")
        public void ExtrasSection(String list) {
        }

        @And("clicks on {string} in the My Account section of the footer")
        public void MyAccountSection(String list) {
        }
}




