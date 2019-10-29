import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KBandMouseInput {
    public static void main(String[] args){
      System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("http://formy-project.herokuapp.com/keypress");

      WebElement name = driver.findElement(By.id("name"));
      name.click();
      name.sendKeys("Meghan");

      WebElement button = driver.findElement(By.id("button"));
      button.click();
      driver.quit();
    }
}
