package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Petert on 4/6/19.
 */
public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //Wait wrapper
    public void waitForVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click method
    public void click(By elementBy) {
        waitForVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write text
    public void writeText(By elementBy, String text) {
        waitForVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read text
    public String readText(By elementBy) {
        waitForVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
    public void assertTextMatches(By elementBy, String assertedText) {
        waitForVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), assertedText);
    }

    public void assertElementIsDisplayed (By elementBy) {
        //waitForVisibility(elementBy);
        Assert.assertTrue(driver.findElement(elementBy).isDisplayed());
    }
}
