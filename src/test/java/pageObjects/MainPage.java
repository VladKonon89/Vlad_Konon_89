package pageObjects;

import org.openqa.selenium.*;
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
        } catch (TimeoutException xx){
            return false;
        }
    }

    private WebElement getPlusBusButton(){
        By locator = By.className("fa-plus-circle");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }
    private WebElement getMenuItem(){
        return driver.findElement(By.xpath("//*[@data-testid='playlist-context-menu-create-simple']"));
    }

    private WebElement getNewPlaylist(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public void createPlaylist(String playlistName) {
        getPlusBusButton().click();
        getMenuItem().click();
        getNewPlaylist().sendKeys(playlistName);
        getNewPlaylist().sendKeys(Keys.ENTER);
    }
}
