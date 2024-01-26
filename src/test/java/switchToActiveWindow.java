import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class switchToActiveWindow {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Documents\\InstallationProject\\Automatization test\\AutomationEx\\src\\test\\resources\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        driver.manage().window().maximize();

        WebElement newWindowButton = driver.findElement(By.id("new-tab-button"));
        newWindowButton.click();

        String originalHandle = driver.getWindowHandle();

        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(originalHandle);
        driver.quit();
    }
}
