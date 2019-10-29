import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Ranjana");
        sleep(1000);

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/02/1999");
        sleep(1000);

        driver.quit();
    }
}
