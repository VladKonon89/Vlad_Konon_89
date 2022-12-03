package pageObjectTests_VK;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects_VK.LoginPageFactory;

public class LoginTestFactory extends BaseTest {

    @Test
    public void loginToAppFactory_correctCredentials(){
        LoginPageFactory loginTestFactory = new LoginPageFactory(driver);
        loginTestFactory.open(url);
        MainPage mainPage = loginTestFactory.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }

    @Test
    public void loginToAppFactory_incorrectCredentials(){
        LoginPageFactory loginTestFactory = new LoginPageFactory(driver);
        loginTestFactory.open(url);
        loginTestFactory.loginToApp(username,"WrongPassword");
        Assert.assertTrue(loginTestFactory.isError());
    }

}
