import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/fileupload");

        WebElement fileUplaodfield = driver.findElement(By.id("file-upload-field"));
        Thread.sleep(3000);
        fileUplaodfield.sendKeys("C:\\Users\\rsemwal\\Desktop\\bugzilla_login.png");

        Thread.sleep(3000);
        driver.quit();
    }}

