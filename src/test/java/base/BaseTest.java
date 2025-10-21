package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Loginpage.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest {
	
	protected WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

      
    }
    public void login(String username, String password) throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(Login.USERNAME).sendKeys(username);
        driver.findElement(Login.PASSWORD).sendKeys(password);
        driver.findElement(Login.SUBMIT).click();
        Thread.sleep(3000); 
    }

	   
	    
	    
}
