package simpleTest;

import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void run(){
        System.setProperty("web.chrome.driver","chromedriver.exe");

    }
}
