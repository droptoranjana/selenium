import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripExecuter {

    public static <JavaScriptExecuter> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/modal");

        WebElement buttonModal = driver.findElement(By.id("modal-button"));
        buttonModal.click();

        Thread.sleep(2000);

        WebElement buttonClose = driver.findElement(By.id("close-button"));
        WebElement buttonOK = driver.findElement(By.id("ok-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", buttonOK);

        Thread.sleep(2000);

        driver.quit();


    }
}
