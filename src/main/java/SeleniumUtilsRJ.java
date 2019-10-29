import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtilsRJ {
    public static WebDriver getWebdriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rsemwal\\Desktop\\WorkSpace\\Selenium\\chromedriver_win32_77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;

    }
}


