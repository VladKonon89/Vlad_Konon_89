package simpleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void run(){
        System.setProperty("web.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException xx){}

        driver.quit();

    }
}
