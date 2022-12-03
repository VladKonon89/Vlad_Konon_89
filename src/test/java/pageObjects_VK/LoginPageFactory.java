package pageObjects_VK;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageObjects.MainPage;

public class LoginPageFactory {
    private WebDriver driver;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory,this);
    }

    @FindBy(xpath = "//*[@type='email']")  // getter
    private WebElement emailField;

    @FindBy(css = "[type='password']")
    private WebElement passwordField;

    @FindBy(tagName = "button")
    private WebElement loginButton;

    @FindBy(className = "error")
    private WebElement errorFrame;

    public MainPage loginToApp(String username, String password){
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        return new MainPage(driver);
    }

    public void open(String url){
        driver.get(url);
    }

    public boolean isError(){
        try{
            return errorFrame.isDisplayed();
        }catch (NoSuchElementException err){
            return false;
        }
    }

}
