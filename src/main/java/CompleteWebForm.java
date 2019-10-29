import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CompleteWebForm {

    public static void main(String[] args) {

           WebDriver driver = SeleniumUtilsRJ.getWebdriver();
           fillForm(driver);

            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
            String result = alert.getText();

            Assert.assertEquals(result,
                    "The form was successfully submitted!");
            driver.quit();
        }

        private static void fillForm(WebDriver driver){
            driver.get("http://formy-project.herokuapp.com/form");
            driver.findElement(By.id("first-name")).sendKeys("Ranjana");
            driver.findElement(By.id("last-name")).sendKeys("Semwal Baloni");
            driver.findElement(By.id("job-title")).sendKeys("SSE II");
            driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();
            driver.findElement(By.cssSelector("input[value='checkbox-2']")).click();
            //driver.findElement(By.id("select-menu")).click();
            driver.findElement(By.xpath("//div//select//option[@value='3']")).click();
            driver.findElement(By.id("datepicker")).sendKeys("10/30/2019");
            driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
            driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        }

}
