import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.util.concurrent.TimeUnit;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        //Thread.sleep(1000);

        //use implicit wait
        /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        Thread.sleep(3000);*/

        //use explicit wait
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        autocompleteResult.click();

        driver.quit();
    }
}
