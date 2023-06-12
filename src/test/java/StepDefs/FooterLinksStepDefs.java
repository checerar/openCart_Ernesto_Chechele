package StepDefs;

import Pages.FooterLinksPage;
import Pages.LoginPage;
import Pages.PagesFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class FooterLinksStepDefs {

    FooterLinksPage footerLinksPage = PagesFactory.getInstance().getFooterLinksPage();
    @When("the user clicks on {string} in the Information section of the footer")
    public void clickInformationLink(String link) {
    }

    @When("the user clicks on {string} in the Customer Service section of the footer")
    public void clickCustomerServiceLink(String link) {
    }

    @When("the user clicks on {string} in the Extras section of the footer")
    public void clickExtrasLink(String link) {
    }

    @When("the user is logged in and clicks on {string} in the My Account section of the footer")
    public void clickMyAccountLink(String link) {
    }

    @Then("the user should be redirected to the corresponding page with the title: {string}")
    public void verifyPageTitle(String title) {
    }

    @Then("the user should be redirected to the corresponding URL {string} with the title: {string}")
    public void verifyURLAndTitle(String url, String title) {
    }
}
