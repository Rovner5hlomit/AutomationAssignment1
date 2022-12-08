import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class BaseTest
{
    WebDriver driver = Driver.setupDriver();
    Store store = new Store(driver);
    Galaxy galaxy = new Galaxy(driver);
    Htc htc = new Htc(driver);
    Cart cart = new Cart(driver);

    @AfterClass
    public void quitDriver()
    {
        driver.quit();
    }
}
