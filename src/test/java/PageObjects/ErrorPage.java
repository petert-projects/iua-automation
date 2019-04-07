package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Petert on 4/7/19.
 */
public class ErrorPage extends BasePage {

    public ErrorPage(WebDriver driver) {
        super(driver);
    }

    //***Web elements***
    By errorMessage = new By.ByCssSelector(".block_alert");

    //***Page methods***
    public ErrorPage assertErrorMessageIsCorrect(String message) {
        assertTextMatches(errorMessage, message);
        return this;
    }
}
