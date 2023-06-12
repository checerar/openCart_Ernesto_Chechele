package StepDefs;
import Pages.LoginPage;
import Pages.PagesFactory;
import Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegistrationStepDefs {
    RegistrationPage registrationPage = PagesFactory.getInstance().getRegistrationPage();

    @Given("the user is on the home page")
    public void userIsOnHomePage() {
    }

    @Given("clicks on My Account")
    public void clickOnMyAccount() {
        }

    @Given("clicks on Register option")
    public void clickOnRegisterOption() {

    }

    @When("the user fills in all the mandatory {string} with {string}")
    public void fillInMandatoryFields(String field, String value) {
    }

    @When("clicks in the checkbox of the Privacy Policy")
    public void clickPrivacyPolicyCheckbox() {
    }

    @When("clicks on the {string} button")
    public void clickContinueButton(String button) {
    }

    @Then("the user should receive a success message indicating successful registration")
    public void verifySuccessMessage() {
    }

    @Then("the user should see an error message")
    public void verifyErrorMessage() {
    }

    @Then("the user should see an error message indicating that they must agree to the Privacy Policy")
    public void verifyPrivacyPolicyErrorMessage() {
    }

    @Then("the user should see an error message indicating that the E-Mail Address is already registered")
    public void verifyExistingEmailErrorMessage() {
    }

    @When("the user fills in any mandatory {string} with missing {string} information")
    public void theUserFillsInAnyMandatoryWithMissingInformation(String arg0, String arg1) {
    }
}
