package simpleTest;

import okhttp3.Credentials;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class KoelLogin_VK {
    private WebDriver driver;
    WebDriverWait wait;
    FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("web.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 200);
        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

//        Thread.sleep(2000);

        By homeLocator = By.className("home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeLocator));
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
        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("fler1111+1@ukr.net");
        passwordField.sendKeys("WrongPassword");
        loginButton.click();

//        Thread.sleep(300);

        By errorLocator = By.className("error");

        //        fluentWait.until(x->x.findElement(errorLocator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorLocator));

        WebElement errorFrame = driver.findElement(errorLocator);

        // After that is validation// Then

        Assert.assertTrue(errorFrame.isDisplayed());

//        driver.quit();
    }

    @Test
    public void customWait() throws InterruptedException {

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("fler1111+1@ukr.net");
        passwordField.sendKeys("WrongPassword");
        loginButton.click();

        By errorLocator = By.className("error");

        for(int i=0;i<50;i++) {
            System.out.println(i);
            try {
                driver.findElement(errorLocator);
                break;
            } catch (NoSuchElementException err) {
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException ex) {
//                }
            }
        }

        WebElement errorFrame = driver.findElement(errorLocator);

        // After that is validation// Then

        Assert.assertTrue(errorFrame.isDisplayed());

//        driver.quit();
    }


    @Test
    public void sum() {

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
        System.out.println("it = " + innerText);

        String value = blueButton.getAttribute("type");
        System.out.println(value);

        String bg = blueButton.getCssValue("background");
        System.out.println(bg);

    }

}

