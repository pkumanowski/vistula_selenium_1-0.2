package steps;

import base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps extends TestBase {

    private TestBase base;

    public LoginSteps(TestBase base){
        this.base = base;
    }

    @Given("^I open login page$")
    public void iOpenLoginPage() throws Throwable {
        base.loginPage.open();
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws Throwable {
        base.loginPage.setEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
        base.loginPage.setPassword(password);
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        base.loginPage.clickLoginButton();
    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        Assert.assertTrue(base.kokpitPage.isLogoutButtonDisplayed());
    }

    @And("^I wait (\\d+) seconds seconds$")
    public void iWaitSecondsSeconds(int arg0) throws Throwable {
        Thread.sleep(3000);
    }

    @Then("^I not am logged in$")
    public void iNotAmLoggedIn() throws Throwable {
        Assert.assertTrue(base.loginPage.isLoginButtonVisible());
    }
}
