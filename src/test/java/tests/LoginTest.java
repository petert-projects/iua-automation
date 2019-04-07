package Tests;

import BaseClasses.TestBase;
import PageObjects.ErrorPage;
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

    @Test
    public void loginWithIncorrectDomain() {
        MainPage mainPage = new MainPage(driver);
        ErrorPage errorPage = new ErrorPage(driver);

        mainPage.goToMainPage().selectDropdownlistItemByText("ua.fm").loginToMailbox("automationiua","automation-iua");
        errorPage.assertErrorMessageIsCorrect("Неверный логин или пароль");
    }
}
