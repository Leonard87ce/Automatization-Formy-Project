import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class fileUpload {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Documents\\InstallationProject\\Automatization test\\AutomationEx\\src\\test\\resources\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        driver.manage().window().maximize();

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        //Sleep added to confirm that the pop up closes as expected
        Thread.sleep(1000);
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);

        driver.quit();
    }
}
