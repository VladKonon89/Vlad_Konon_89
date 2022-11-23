package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPageFactory;
import pageObjects.MainPage;

public class LoginTestFactory extends BaseTest{
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
        loginTestFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginTestFactory.isError());
    }
}
