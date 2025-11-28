package base;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.MediaEntityBuilder;

import Loginpage.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Reportmanager;
import utils.Screenshott;
public class BaseTest {
	
	protected WebDriver driver;


	 @BeforeSuite
	    public void beforeSuite() {
	        Reportmanager.initReports();
	    }

	    @BeforeMethod
	    public void setUp(Method method) {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        Reportmanager.createTest(method.getName()); // Start a new test
	    }

	    @AfterMethod
	    public void tearDown(ITestResult result) {
	        if (result.getStatus() == ITestResult.FAILURE) {
	            String screenshotPath = Screenshott.captureScreenshot(driver, result.getName());
	            Reportmanager.getTest().fail("Test failed: " + result.getThrowable(),
	                    MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	        } else if (result.getStatus() == ITestResult.SUCCESS) {
	            Reportmanager.getTest().pass("Test passed");
	        } else if (result.getStatus() == ITestResult.SKIP) {
	            Reportmanager.getTest().skip("Test skipped");
	        }

	        if (driver != null) {
	            driver.quit();
	        }

	        Reportmanager.flushReports();
	    }

	    public void login(String username, String password) throws InterruptedException {
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.findElement(Login.USERNAME).sendKeys(username);
	        driver.findElement(Login.PASSWORD).sendKeys(password);
	        driver.findElement(Login.SUBMIT).click();
	        Thread.sleep(3000); 
	    }
	   
	    
	    
}
