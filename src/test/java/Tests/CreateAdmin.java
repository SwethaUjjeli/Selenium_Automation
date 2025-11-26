package Tests;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Loginpage.Adminpage;
import base.BaseTest;
import utils.Keyboardactions;

public class CreateAdmin extends BaseTest {

	@Test
    public void createAdminRole() throws InterruptedException {
		
        // Login using BaseTest 
        login("Admin", "admin123");
        new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.elementToBeClickable(Adminpage.ADMIN_TAB))
        .click();
        
        //Add admin role
        driver.findElement(Adminpage.ADD_ROLE_BUTTON).click();
        Thread.sleep(2000);
        WebElement dropdownElement = driver.findElement(Adminpage.USER_DROPDOWN);
        Keyboardactions.pressDownArrowAndEnter(driver, dropdownElement);
		Thread.sleep(5000);
		
		//employee name
        WebElement inputField = driver.findElement(Adminpage.EMP_NAME);
        inputField.sendKeys("test"); // Enter value
        Thread.sleep(5000);
        inputField.sendKeys(Keys.ARROW_DOWN);    // Press Down Arrow
        inputField.sendKeys(Keys.ENTER);         // Press Enter again
        
       
        //Select status
        dropdownElement = driver.findElement(Adminpage.STATUS_DROPDOWN);
        Thread.sleep(2000);
        Keyboardactions.pressDownArrowAndEnter(driver, dropdownElement);
        Thread.sleep(2000);
        
        //Username and password
        driver.findElement(Adminpage.ADMIN_USERNAME).sendKeys("Tony Stark");
        Thread.sleep(2000);
        driver.findElement(Adminpage.ADMIN_PASSWORD).sendKeys("Tony@12399");
        driver.findElement(Adminpage.ADMIN_CNF_PASSWORD).sendKeys("Tony@12399");
        Thread.sleep(2000);
        driver.findElement(Adminpage.ADMIN_SAVE).click();
        
        
    }
     
	}
	
