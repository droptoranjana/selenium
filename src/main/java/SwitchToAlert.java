import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert{

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/switch-window");

        WebElement button = driver.findElement(By.id("alert-button"));
        button.click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        driver.quit();
    }
}
