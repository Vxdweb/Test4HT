import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
public class HTaskFinalTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void hTaskFinal() {
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().setSize(new Dimension(1265, 824));
        driver.findElement(By.xpath("//div[2]/ul/li/a")).click();
        driver.findElement(By.xpath("//img[@alt=\'Picture for category Desktops\']")).click();
        driver.findElement(By.xpath("(//a[contains(@href, \'/digital-storm-vanquish-3-custom-performance-pc\')])[4]")).click();
        driver.findElement(By.xpath("//form[@id=\'product-details-form\']/div[2]/div/div[2]/div[7]")).click();
    }
}
