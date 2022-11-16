package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLogin {
    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
        System.setProperty("web.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("sim@email.com");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(2000);

        By homeLocator = By.className("home");
        WebElement homeIcon = driver.findElement(homeLocator);

        Assert.assertTrue(homeIcon.isDisplayed());

        driver.quit();
    }
    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {
        System.setProperty("web.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("sim@email.com");
        passwordField.sendKeys("WrongPassword");
        loginButton.click();

        Thread.sleep(300);

        By errorLocator = By.className("error");
        WebElement errorFrame = driver.findElement(errorLocator);

        Assert.assertTrue(errorFrame.isDisplayed());

        driver.quit();
    }
}
