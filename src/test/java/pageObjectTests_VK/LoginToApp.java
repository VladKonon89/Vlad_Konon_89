package pageObjectTests_VK;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects_VK.LoginPage;

public class LoginToApp extends BaseTest {
    @Test
    public void loginToApp_correctCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());
    }

    @Test
    public void loginToApp_incorrectCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp(username, "WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
