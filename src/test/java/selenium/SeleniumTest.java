package selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;

public class SeleniumTest {

    @Test
    public void test001() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.br/");

        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
        myDynamicElement.sendKeys("Thiago Garcia Alves");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnG")));
        element.click();
    }

}
