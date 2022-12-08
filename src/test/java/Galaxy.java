import org.openqa.selenium.WebDriver;

public class Galaxy extends Action
{
    WebDriver m_driver;

    public Galaxy(WebDriver driver)
    {
        super(driver);
        m_driver = driver;
    }

    public static final String ADDTOCARTBTNXPATH = "//*[@id=\"tbodyid\"]/div[2]/div/a";

    public void addToCart()
    {
        clickByXPath(ADDTOCARTBTNXPATH);
    }

}
