package pageObjectTests_VK;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTest extends BaseTest {
    @Test
    public void createPlaylist(){
        Faker faker = new Faker();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp("fler1111+1@ukr.net","te$t$tudent");

//        String playlistName = RandomStringUtils.randomAlphabetic(10);  //10 длинна строки
        String playlistName = faker.job().title();
        System.out.println(playlistName);
        int playlistId = mainPage.createPlaylist(playlistName);
//        System.out.println(playlistId);
        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }

    // HomeTask
    @Test
    public void renamePlaylist(){
        Faker faker = new Faker();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp("fler1111+1@ukr.net","te$t$tudent");
        String playlistName = faker.job().title();
        int playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));

    }
}
