import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/dropdown");

        driver.findElement(By.id("dropdownMenuButton")).click();

        driver.findElement(By.id("autocomplete")).click();
        //how to select other values from lOVs where id is not available?

        Thread.sleep(3000);

        driver.quit();



    }
}
