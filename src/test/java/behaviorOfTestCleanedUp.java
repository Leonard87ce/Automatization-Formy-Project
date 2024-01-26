import Pages.ConfirmationPage;
import Pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;




import static org.junit.Assert.assertEquals;

public class behaviorOfTestCleanedUp {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Documents\\InstallationProject\\Automatization test\\AutomationEx\\src\\test\\resources\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }
}

