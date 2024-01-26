import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class mouseAndInput {

    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "Documents\\InstallationProject\\Automatization test\\AutomationEx\\src\\test\\resources\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Leonardo Lopez");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        // driver.quit();
    }
}
