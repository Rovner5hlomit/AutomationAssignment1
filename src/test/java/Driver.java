import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver
{

    public static final String CHROMEKEY = "webdriver.chrome.driver";
    public static final String CHROMEPATH = "res\\chromedriver.exe";


    public static WebDriver setupDriver()
    {
        System.setProperty(CHROMEKEY, CHROMEPATH);
        return new ChromeDriver();
    }

}
