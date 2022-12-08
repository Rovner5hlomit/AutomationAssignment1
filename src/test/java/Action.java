import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Action
{
    public static final String SCROLLTOELEMENT = "arguments[0].scrollIntoView();";

    WebDriver m_driver;
    WebDriverWait m_wait;
    JavascriptExecutor m_jse;

    public Action(WebDriver driver) {
        m_driver = driver;
        m_wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        m_jse = (JavascriptExecutor)driver;
    }

    public void clickByXPath(String xpath)
    {
        m_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
    }

    public void clickByID(String id) {
        m_wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id))).click();
    }

    public void acceptAlert()
    {
        m_driver.switchTo().alert().accept();
    }

    public void scrollToElementByXPath(String xpath) {
        m_jse.executeScript(SCROLLTOELEMENT,
                m_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
    }

    public String getTextByID(String id) {
        return m_wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id))).getText();
    }

}
