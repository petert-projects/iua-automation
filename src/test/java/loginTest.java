import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Petert on 4/5/19.
 */
public class loginTest {
    @Test
    public void checkPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.i.ua/");
    }
}
