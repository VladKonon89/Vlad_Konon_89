package pageObjectTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected String url;
    protected String username;
    protected String password;

    @BeforeMethod
    public void startUp() {
        System.setProperty("web.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        url="https://bbb.testpro.io";
        username="sim@email.com";
        password = "te$t$tudent";
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
