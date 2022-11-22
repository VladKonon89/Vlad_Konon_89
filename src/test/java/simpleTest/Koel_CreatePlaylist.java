package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Koel_CreatePlaylist {
    private WebDriver driver;

    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
        System.setProperty("web.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");

        By emaiFielLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emaiFielLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("fler1111+1@ukr.net");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(2000);

        By createPlaylist = By.className("title=\"Create a new playlist\"");
        WebElement createPlaylistButton = driver.findElement(createPlaylist);
        createPlaylistButton.click();

        driver.quit();

    }

}
