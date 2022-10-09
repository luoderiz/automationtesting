package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.RegistrationConstants;
import lippia.web.services.LoginService;
import lippia.web.services.RegistrationService;

public class RegistrationSteps {
    @When("I click on My Account Menu")
    public void clickOnMyAccountMenu() {
        RegistrationService.click(RegistrationConstants.MY_ACCOUNT_MENU);
    }
    @And("I enter the valid email {string} in the Register TextBox")
    public void enterValidEmail(String arg0) {
        RegistrationService.enter(RegistrationConstants.EMAIL_TEXTBOX, arg0);
    }
    @And("I enter the valid password {string} in the Register Textbox")
    public void enterValidPassword(String arg0) {
        RegistrationService.enter(RegistrationConstants.PASSWORD_TEXTBOX, arg0);
    }
    @When("I click on Register Button")
    public void clickOnRegisterButton() {
        RegistrationService.click(RegistrationConstants.REGISTER_BUTTON);
    }
    @Then("I will be registered and logged in")
    public void registrationSuccessful() {
        LoginService.checkUrl();
    }
    @And("I enter (.*) in Register EmailAddress TextBox")
    public void enterEmail(String email) {
        RegistrationService.enter(RegistrationConstants.EMAIL_TEXTBOX, email);
    }
    @And("I enter (.*) in Register Password Textbox")
    public void enterPassword(String password) {
        RegistrationService.enter(RegistrationConstants.PASSWORD_TEXTBOX, password);
    }
    @Then("An error message will announce Registration failure")
    public void registrationFail() {
        RegistrationService.verifyFailure();
    }
}
