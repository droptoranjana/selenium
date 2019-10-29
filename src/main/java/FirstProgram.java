import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FirstProgram {


    public static void main(String[] arg){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement element =driver.findElement(By.name("q"));
        element.sendKeys("Friends");
        element.submit();
        List<WebElement> linkElements = new ArrayList<WebElement>();
        //driver.findElement(By.xpath("//a[@id='pnnext']/span[1]")).click();


        driver.findElement(By.xpath("//div/a[@href='https://en.wikipedia.org/wiki/Friends']")).click();
        //System.out.println(driver.getTitle());
        driver.close();
    }

}
