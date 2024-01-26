import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollElement {

    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "Documents\\InstallationProject\\Automatization test\\AutomationEx\\src\\test\\resources\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Leonardo Jose Medina");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("21/01/2024");

        driver.quit();
    }
}
