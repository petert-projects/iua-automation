package Tests;

import BaseClasses.TestBase;
import PageObjects.MailboxPage;
import PageObjects.MainPage;
import org.junit.Test;

/**
 * Created by Petert on 4/5/19.
 */
public class LoginTest extends TestBase {

    @Test
    public void successfulLogin() {
        MainPage mainPage = new MainPage(driver);
        MailboxPage mailboxPage = new MailboxPage(driver);

        mainPage.goToMainPage().loginToMailbox("automationiua","automation-iua");
        mailboxPage.assertMailIconIsDisplayed();
    }
}
