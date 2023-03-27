package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.LoginPage;
import utils.BrowserUtils;

public class LoginSteps {
    LoginPage page;
    public LoginSteps() {
        page = new LoginPage();

    }
    @Given("I open the page")
    public void i_open_the_page() {
BrowserUtils.getDriver();
    }
    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        BrowserUtils.sendKeys(page.username, username);
BrowserUtils.sendKeys(page.password, password);
    }
    @When("I click on Login button")
    public void iClickOnLoginButton() {
        BrowserUtils.click(page.loginBtn);
    }
    @Then("Verify the title of the page is {string}")
    public void verifyTheTitleOfThePageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        System.out.println(BrowserUtils.getDriver().getTitle());


    }



}









