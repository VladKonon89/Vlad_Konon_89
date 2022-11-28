package pageObjects_VK;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.MainPage;

public class LoginPage {
    private WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }

    private WebElement getEmailField(){
        return driver.findElement(By.xpath("//*[@type='email']"));
    }

    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[type='password']"));
    }

    private WebElement getLoginButton(){
        By loginButtonLocator = By.tagName("button");
        return driver.findElement(loginButtonLocator);
    }

    public MainPage loginToApp(String username, String password) {
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public void open(String url){
        driver.get(url);
    }

    public boolean isError(){
        By errorLocator = By.className("error");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorLocator));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }

}
