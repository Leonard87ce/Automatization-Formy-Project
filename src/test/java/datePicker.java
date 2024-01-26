import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class datePicker {

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "Documents\\InstallationProject\\Automatization test\\AutomationEx\\src\\test\\resources\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        driver.manage().window().maximize();

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("01/26/2024");
        dateField.sendKeys(Keys.RETURN);
    }
}
