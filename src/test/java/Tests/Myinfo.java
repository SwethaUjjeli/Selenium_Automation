package Tests;

import org.testng.annotations.Test;

import Loginpage.infopage;
import base.BaseTest;

public class Myinfo extends BaseTest {

@Test	
public void updateInfo() throws InterruptedException{
		
        // Login using BaseTest 
        login("Admin", "admin123");
    
        //Open MyInfo Page
       driver.findElement(infopage.InfoTab).click();
       Thread.sleep(5000);
       
}
}
