package simpleTest;

import okhttp3.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class KoelLogin_VK {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("web.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }


    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
        // Given// Preconditions//
//        System.setProperty("web.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io");

        // When// Testing
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

        By homeLocator = By.className("home");
        WebElement homeIcon = driver.findElement(homeLocator);

        // After that is validation// Then

        Assert.assertTrue(homeIcon.isDisplayed());

    }

    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {
        // Given// Preconditions//
//        System.setProperty("web.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io");

        // When// Testing
        By emaiFielLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emaiFielLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("fler1111+1@ukr.net");
        passwordField.sendKeys("WrongPassword");
        loginButton.click();

        Thread.sleep(300);

        By errorLocator = By.className("error");
        WebElement errorFrame = driver.findElement(errorLocator);

        // After that is validation// Then

        Assert.assertTrue(errorFrame.isDisplayed());

//        driver.quit();
    }

    @Test
    public void selenium(){

//        WebElement blueButton = driver.findElement(By.tagName("button"));
        List<WebElement> elements = driver.findElements(By.tagName("button1"));

        System.out.println(elements.size());
        driver.navigate().refresh();

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String title = driver.getTitle();
        System.out.println(title);

//        blueButton.isDisplayed();
//        blueButton.isEnabled();
//        blueButton.isSelected();

        WebElement blueButton = driver.findElement(By.tagName("button"));
        String innerText = blueButton.getText();
        System.out.println("it = "+innerText);

        String value = blueButton.getAttribute("type");
        System.out.println(value);

        String bg = blueButton.getCssValue("background");
        System.out.println(bg);

    }

}

