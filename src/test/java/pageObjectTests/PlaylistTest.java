package pageObjectTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTest {
    private WebDriver driver;
    private String url;

    @BeforeMethod
    public void startUp() {
        System.setProperty("web.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        url="https://bbb.testpro.io";
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void createPlaylist(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp("sim@email.com","te$t$tudent");

        String playlistName = RandomStringUtils.randomAlphabetic(10);
        System.out.println(playlistName);
        mainPage.createPlaylist(playlistName);
    }
}
