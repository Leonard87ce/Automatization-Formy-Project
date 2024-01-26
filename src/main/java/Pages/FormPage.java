package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//Method to submit the form, can eb found on test folder on behaviorOfTestCleanedUp
public class FormPage {

    public static void submitForm (WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys("David J");
        driver.findElement(By.id("last-name")).sendKeys("Conboy Wong");
        driver.findElement(By.id("job-title")).sendKeys("Chief officer of Innovation");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='3']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("01/29/2024");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
