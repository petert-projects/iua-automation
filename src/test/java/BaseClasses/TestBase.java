package BaseClasses;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Petert on 4/5/19.
 */
public class TestBase {
    protected static WebDriver driver;

    @Before
    public void beforeTest() throws MalformedURLException {
        ChromeOptions chromeOptions =  new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://5bf6b9ad.ngrok.io/wd/hub"),chromeOptions);
    }

    @After
    public void shutDown() {
        driver.quit();
    }
}
