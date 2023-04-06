package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionBasic {
    public static WebDriver driver;

    @BeforeMethod
    public void SetupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void invalidCredentials() {
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("abracadabra");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        loginBtn.click();
        WebElement error=driver.findElement(By.id("spanMessage"));
        String errorMessage=error.getText();
        String expectedError="Invalid credentials";
        /*if (errorMessage.equalsIgnoreCase(expectedError)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test faild");
        }*/
        Assert.assertEquals(expectedError,errorMessage);

        password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("abracadabra");
        boolean passDisplayed = password.isDisplayed();
        Assert.assertTrue(passDisplayed);

    }
}
