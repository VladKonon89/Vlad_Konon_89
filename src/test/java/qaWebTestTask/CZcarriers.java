package qaWebTestTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CZcarriers {
    private WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void start(){
        System.setProperty("web.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10,200);
        driver.get("https://cz.careers.veeam.com/vacancies ");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void run() throws InterruptedException {

        By allDepsLocator = By.xpath("(//*[text()='All departments'])[1]");
        WebElement allDepsfield = driver.findElement(allDepsLocator);
        allDepsfield.click();
        By resAnDevLocator = By.xpath("(//*[text()='Research & Development'])[1]");
        WebElement resAndDevField = driver.findElement(resAnDevLocator);
        resAndDevField.click();

        WebElement allLangField = driver.findElement(By.xpath("//*[text()='All languages']"));
        allLangField.click();
        Thread.sleep(1000);
        WebElement englishLangField = driver.findElement(By.xpath("(//*[@class='custom-control-input'])[1]"));
        englishLangField.click();
        allLangField.click();


        List<WebElement> actualJobsNumber = driver.findElements(By.xpath("//*[text()='Research & Development']/parent::*[@class=\"card-header pb-2\"]"));
        System.out.println(actualJobsNumber.size());


        WebElement expectedJobsNumber = driver.findElement(By.xpath("//*[text()='34']"));
        System.out.println(expectedJobsNumber.getText());


        Assert.assertNotEquals(expectedJobsNumber,actualJobsNumber);

    }
}
