package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Loginpage.infopage;
import base.BaseTest;
import Loginpage.infopage;
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
        
        //Enter EmployeeID
        WebElement empID = driver.findElement(infopage.EmpID);
        Keyboardactions.clearText(empID);
        empID.sendKeys("090912");
        Thread.sleep(5000);
        
      //Enter otherID
        WebElement otherID = driver.findElement(infopage.OtherID);
        Keyboardactions.clearText(otherID);
        Thread.sleep(5000);
     
       //Enter DOB
        WebElement dateOfBirth = driver.findElement(infopage.DOB);
        Keyboardactions.clearText(dateOfBirth);
        dateOfBirth.sendKeys("1999-08-04");
        Thread.sleep(5000);
        
        //Select Gender
        WebElement gender = driver.findElement(infopage.Gender);
        gender.click();
        Thread.sleep(5000);
        
       
}
}
