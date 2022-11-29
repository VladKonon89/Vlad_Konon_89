package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
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

    public int createPlaylist(String playlistName) {
        getPlusBusButton().click();
        getMenuItem().click();
        getNewPlaylist().sendKeys(playlistName);
        getNewPlaylist().sendKeys(Keys.ENTER);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));

        return Integer.parseInt(driver.getCurrentUrl().split("/")[5]);
    }

    private WebElement getPlaylist(int playlistId){
        By locator = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }
    public boolean playlistExist(int playlistId, String playlistName) {
        WebElement playlist;
        try {
             playlist = getPlaylist(playlistId);
             return playlist.isDisplayed() && playlist.getText().equals(playlistName);
        } catch (TimeoutException err){
            return false;
        }
    }

    private WebElement getEditField(){
        By locator = By.xpath("//input[@name='name']");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }

    public void renamePlaylist(int playlistId, String playlistName) {
        // Get Playlist
        WebElement playlist = getPlaylist(playlistId);

        // Scroll to element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", playlist);

        // Double click
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();

        // Ctrl+A
        getEditField().sendKeys(Keys.CONTROL+"A");

        // Send name
        getEditField().sendKeys(playlistName);
        getEditField().sendKeys(Keys.ENTER);

        By secondGreen = By.xpath("//*[@class='success show' and contains(text(),'Updated')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondGreen));
    }
}
