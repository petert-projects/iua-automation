package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Petert on 4/7/19.
 */
public class MailboxPage extends BasePage{

    public MailboxPage(WebDriver driver) {
        super(driver);
    }

    //***WebElements***
    By mailIcon = new By.ByCssSelector(".ho_mail");

    //***Page methods***
    public MailboxPage assertMailIconIsDisplayed() {
        assertElementIsDisplayed(mailIcon);
        return this;
    }


}
