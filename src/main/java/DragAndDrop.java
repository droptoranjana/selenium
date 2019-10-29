import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.PublicKey;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        Actions action = new Actions(driver);
        action.dragAndDrop(image,box).build().perform();

        Thread.sleep(2000);

        driver.quit();

    }
}
