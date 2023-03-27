package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class HomeSteps {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
    }
    @Given("I navigate to URL")
    public void iNavigateToURL() {
        BrowserUtils.getDriver();
    }
    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        BrowserUtils.sendKeys(page.username, username);
        BrowserUtils.sendKeys(page.password, password);
    }
    @When("I click Login button")
    public void iClickLoginButton() {
        BrowserUtils.click(page.loginBtn);
}
    @Then("Verify {string} button is displayed")
    public void verify_button_is_displayed(String signOutBtn) {
        BrowserUtils.assertEquals(signOutBtn, page.signOutBtn.getText());
        System.out.println(page.signOutBtn.getText());
    }
    @And("Verify user shouldn't have access to {string} Access button")
    public void verifyUserShouldnTHaveAccessToAccessButton(String manAcBtn) {
        List<WebElement> btns = BrowserUtils.getDriver().findElements(By.xpath("//a/u"));
        for(WebElement btn : btns){
            System.out.println(btn.getText());
            BrowserUtils.assertFalse(btn.getText().contains(manAcBtn));
        }
    }
    @Then("Verify {string} present")
    public void verifyPresent(String dash) {
        BrowserUtils.assertTrue(page.page.getText().contains(dash));
    }

    @When("I click on Add do button")
    public void iClickOnAddDoButton() {
        BrowserUtils.click(page.addDoBtn);
    }

    @And("I enter {string} in the inputField")
    public void iEnterInTheInputField(String text) {
        BrowserUtils.sendKeys(page.inputField, text);
    }


    @And("I click Enter button")
    public void iClickEnterButton() {
        BrowserUtils.click(page.enterBtn);
    }

    @Then("Verify entered {string} is displayed")
    public void verifyEnteredIsDisplayed(String text) {
List<WebElement> list = page.texts;
for(WebElement line : list){
    BrowserUtils.assertTrue(list.contains(text));
}
    }
}





