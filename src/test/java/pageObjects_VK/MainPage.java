package pageObjects_VK;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    WebDriverWait wait;
    public MainPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver,10,200);
    }

    public boolean isOpen() {
        By homeLocator = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeLocator));
            return true;
        } catch (TimeoutException ignored){
            return false;
        }
    }

    public void createPlaylist(String playlistName) {
    }
}
