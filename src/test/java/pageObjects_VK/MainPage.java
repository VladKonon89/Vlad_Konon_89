package pageObjects_VK;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import simpleTest.Koel_CreatePlaylist;

import java.lang.ref.SoftReference;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
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

    public WebElement getPlusButton() {
        By locator = By.className("fa-plus-circle");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }

    private WebElement getMenuItem(){
        return driver.findElement(By.xpath("//*[@data-testid=playlist-context-menu-create-simple]"));
    }

    private WebElement getNewPlaylist(){
        return driver.findElement(By.xpath("//*[@class=\'create\']/input"));
    }

    public int createPlaylist(String playlistName) {
        getPlusButton().click();
        getMenuItem().click();
        getNewPlaylist().sendKeys(playlistName);
        getNewPlaylist().sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));  //By.xpath("//*[@class='success show']")
//        String url = driver.getCurrentUrl();
//        String[] parts = url.split("/");
//        System.out.println(parts[5]);
//        System.out.println(url);
        return Integer.parseInt(driver.getCurrentUrl().split("/")[5]);
    }

    private WebElement getPlaylist(int playlistId){
        By locator = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }
    public boolean playlistExist(int playlistId, String playlistName){
        WebElement playlist;
        try {
            playlist = getPlaylist(playlistId);
            return playlist.isDisplayed() && playlist.getText().equals(playlistName);
        }catch (TimeoutException err){
            return false;
        }
    }

    // HomeTask

    private WebElement getEditField(){
//        return driver.findElement(By.xpath("//*[@data-testid='inline-playlist-name-input']"));
        By locator = By.xpath("//*[@id='playlists']/ul/li/input");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }
    public void renamePlaylist(int playlistId, String playlistName){
        // Get Playlist
        WebElement playlist = getPlaylist(playlistId);

        // Scroll to element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].scrollIntoView();", playlist);

        // Double click
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();

        // Cmd+A
        getEditField().sendKeys(Keys.CONTROL+"A");

        // Send playlist name
        getEditField().sendKeys(playlistName);

        // Wait for the 2nd green banner - optional
        By secondGreen = By.xpath("//*[@class='success show' and contains(text(),'Updated')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondGreen));
    }

}
