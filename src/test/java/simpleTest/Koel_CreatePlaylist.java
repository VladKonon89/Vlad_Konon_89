package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Koel_CreatePlaylist {
    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
        System.setProperty("web.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("fler1111+1@ukr.net");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(2000);

        By createPlaylistLocator = By.xpath("//*[@title=\'Create a new playlist\']");
        WebElement createPlaylistButton = driver.findElement(createPlaylistLocator);
        createPlaylistButton.click();

        Thread.sleep(2000);

        By newPlaylistLocator = By.xpath("//*[@data-testid=\"playlist-context-menu-create-simple\"]");
        WebElement newPlaylistButton = driver.findElement(newPlaylistLocator);
        newPlaylistButton.click();

        Thread.sleep(1000);

        By playlistNameLocator = By.xpath("//*[@placeholder=\"↵ to save\"]");
        WebElement playlistNameField = driver.findElement(playlistNameLocator);

        playlistNameField.sendKeys("Champion");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder=\"↵ to save\"]")).sendKeys(Keys.RETURN);

        Thread.sleep(2000);

        driver.quit();

    }

}
