package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Koel_CreatePlaylist {
    private WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("web.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15, 300);

        driver.get("https://bbb.testpro.io");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(100);
        driver.quit();
    }
    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
//        System.setProperty("web.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        wait = new WebDriverWait(driver,15,400);
//        driver.get("https://bbb.testpro.io");

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("fler1111+1@ukr.net");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

//        Thread.sleep(2000);

        By createPlaylistLocator = By.xpath("//*[@title=\'Create a new playlist\']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(createPlaylistLocator));
        WebElement createPlaylistButton = driver.findElement(createPlaylistLocator);
        createPlaylistButton.click();

//        Thread.sleep(2000);

        By newPlaylistLocator = By.xpath("//*[@data-testid=\"playlist-context-menu-create-simple\"]");
        WebElement newPlaylistButton = driver.findElement(newPlaylistLocator);
        newPlaylistButton.click();

//        Thread.sleep(1000);

        By playlistNameLocator = By.xpath("//*[@placeholder=\"↵ to save\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(playlistNameLocator));
        WebElement playlistNameField = driver.findElement(playlistNameLocator);

        playlistNameField.sendKeys("Champion");

//        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder=\"↵ to save\"]")).sendKeys(Keys.RETURN);

//        Thread.sleep(2000);

        By championPlaylistLocator = By.xpath("//*[@href=\'#!/playlist/30586\']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(championPlaylistLocator));
        WebElement championPlaylist = driver.findElement(championPlaylistLocator);

        Assert.assertTrue(championPlaylist.isDisplayed());


//        By createdIconLocator = By.xpath("class=\"success show\"");
//        WebElement createdIcon = driver.findElement(createdIconLocator);
//        Assert.assertTrue(createdIcon.isDisplayed());

//        driver.quit();

    }

}
