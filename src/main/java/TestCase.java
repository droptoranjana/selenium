import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {
@Test
public void TestSample(){
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://wwww.google.com");
        System.out.println(driver.getTitle());
        //Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();
    }

}
