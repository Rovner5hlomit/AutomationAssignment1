import org.openqa.selenium.WebDriver;

public class Cart extends Action
{

    WebDriver m_driver;

    public Cart(WebDriver driver)
    {
        super(driver);
        m_driver = driver;
    }

    public static final String TOTALPRICEID = "totalp";
    public static final String DELETEGALAXYXPATH = "//*[@id=\"tbodyid\"]/tr[2]/td[4]/a";
    public static final String DELETEHTCXPATH = "//*[@id=\"tbodyid\"]/tr[1]/td[4]/a";

    public void printTotalPrice()
    {
        System.out.println(getTextByID(TOTALPRICEID));
    }

    public void deleteGalaxy()
    {
        clickByXPath(DELETEGALAXYXPATH);
    }

    public void deleteHTC()
    {
        clickByXPath(DELETEHTCXPATH);
    }

}
