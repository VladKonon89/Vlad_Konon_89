package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginToApp extends BaseTest{

    @Test
    public void loginToApp_correctCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp("sim@email.com","te$t$tudent");
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginToApp_incorrectCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp("sim@email.com","WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }

}
