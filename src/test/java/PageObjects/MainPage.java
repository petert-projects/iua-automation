package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Petert on 4/6/19.
 */
public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    //***Page variables***
    String baseUrl = "https://www.i.ua/";

    //***Web elements***
    By loginInput = By.cssSelector("[name='login']");
    By passwordInput = By.cssSelector("[name='pass']");
    By enterButton = By.cssSelector("[value='Войти']");

    //Page methods
    public MainPage goToMainPage() {
        driver.get(baseUrl);
        return this;
    }


    public MainPage loginToMailbox(String email, String password) {
        //fill in email
        writeText(loginInput, email);
        //fill in password
        writeText(passwordInput, password);
        //click on Login button
        click(enterButton);
        return this;
    }




}
