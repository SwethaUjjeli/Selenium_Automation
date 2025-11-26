package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        
        //Enter EmployeeID
        WebElement empID = driver.findElement(infopage.EmpID);
        Keyboardactions.clearText(empID);
        empID.sendKeys("11650");
        Thread.sleep(5000);
        
      //Enter otherID
        WebElement otherID = driver.findElement(infopage.OtherID);
        Keyboardactions.clearText(otherID);
        Thread.sleep(5000);
     
       //Enter DOB
        WebElement dateOfBirth = driver.findElement(infopage.DOB);
        Keyboardactions.clearText(dateOfBirth);
        dateOfBirth.sendKeys("1999-04-14");
        Thread.sleep(5000);
        
        //Select Gender
        WebElement gender = driver.findElement(infopage.Gender);
        gender.click();
        Thread.sleep(5000);
      //Select Nationality
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='listbox']")));
        WebElement indianOpt = driver.findElement(By.xpath("//div[@role='option' and normalize-space(.)='Indian']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", indianOpt);
        indianOpt.click();
        Thread.sleep(5000);
        //Save the Info
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement saveButton = wait1.until(ExpectedConditions.elementToBeClickable(infopage.Save));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", saveButton);
        saveButton.click();
        Thread.sleep(10000);
       
}
}
