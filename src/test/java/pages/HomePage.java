package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Enter Username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//u[text()='Sign out']")
    public WebElement signOutBtn;

    @FindBy(xpath = "//div[@class='topics']")
    public WebElement page;

    @FindBy(xpath = "//button[text()='Add do ']")
    public WebElement addDoBtn;

    @FindBy(xpath = "//textarea")
    public WebElement inputField;

    @FindBy(xpath = "//button[text()='Enter']")
    public WebElement enterBtn;

    @FindBy(xpath = "(//div[@class='anyClass'])[1]/div[@class='row']")
    public List<WebElement> texts;
}