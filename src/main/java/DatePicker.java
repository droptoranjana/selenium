import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/datepicker");

        WebElement dateCalender = driver.findElement(By.id("datepicker"));
        dateCalender.click();
       dateCalender.sendKeys("03/03/2019");
        Thread.sleep(2000);

        //driver.findElement(By.cssSelector(".active day")).click();
        //need to check how we can select one date from calender itself

        dateCalender.sendKeys(Keys.RETURN);
        Thread.sleep(2000);

        driver.quit();
    }
}
