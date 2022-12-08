import org.openqa.selenium.WebDriver;

public class Htc extends Action
{
    WebDriver m_driver;

    public Htc(WebDriver driver)
    {
        super(driver);
        m_driver = driver;
    }

    public static final String ADDTOCARTBTNXPATH = "//*[@id=\"tbodyid\"]/div[2]/div/a";
    public static final String CARTBTNID = "cartur";

    public void addToCart()
    {
        clickByXPath(ADDTOCARTBTNXPATH);
    }

    public void goToCart()
    {
        clickByID(CARTBTNID);
    }
}
