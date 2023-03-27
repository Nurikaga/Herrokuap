package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);

    }
    @FindBy(xpath = "//input[@placeholder='Enter Username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

}
