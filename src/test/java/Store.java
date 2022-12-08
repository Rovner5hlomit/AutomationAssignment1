import org.openqa.selenium.WebDriver;

public class Store extends Action
{
    WebDriver m_driver;

    public Store(WebDriver driver)
    {
        super(driver);
        m_driver = driver;
    }

    public static final String STOREURL = "https://www.demoblaze.com/";
    public static final String GALAXYXPATH = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4";
    public static final String HTC = "//*[@id=\"tbodyid\"]/div[7]/div/div/h4/a";


    public void goToStoreURL()
    {
        m_driver.get(STOREURL);
    }

    public void selectGalaxy()
    {
        clickByXPath(GALAXYXPATH);
    }

    public void scrollToHTC()
    {
        scrollToElementByXPath(HTC);
    }

    public void selectHTC()
    {
        clickByXPath(HTC);
    }

}
