package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Loginpage.infopage;
import base.BaseTest;
import utils.Keyboardactions;

public class Myinfo extends BaseTest {

@Test	
public void updateInfo() throws InterruptedException{
		
        // Login using BaseTest 
        login("Admin", "admin123");
      
    
        //Open MyInfo Page
       driver.findElement(infopage.InfoTab).click();
       Thread.sleep(5000);
     //Enter FirstName
       WebElement firstName = driver.findElement(infopage.Fname);
       Keyboardactions.clearText(firstName);
        firstName.sendKeys("Swetha");
        Thread.sleep(5000);
        
      //Enter MiddleName
        WebElement middleName = driver.findElement(infopage.Mname);
        Keyboardactions.clearText(middleName);
        Thread.sleep(5000);
        
      //Enter LastName
        WebElement lastName = driver.findElement(infopage.Lname);
        Keyboardactions.clearText(lastName);
        lastName.sendKeys("Ujjeli");
        Thread.sleep(5000);
        
       
}
}
