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
}
