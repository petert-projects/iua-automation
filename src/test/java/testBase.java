import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Petert on 4/5/19.
 */
public class TestBase {
    protected static WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @After
    public void shutDown() {
        driver.close();
    }
}
