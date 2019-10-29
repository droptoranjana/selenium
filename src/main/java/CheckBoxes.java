import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/checkbox");

        driver.findElement(By.id("checkbox-1")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='checkbox-2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='checkbox-3']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
