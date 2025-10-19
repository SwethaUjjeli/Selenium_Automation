package Tests;
import org.testng.annotations.Test;
import base.BaseTest;

public class CreateAdmin extends BaseTest {

	@Test
    public void createAdminRole() throws InterruptedException {
		
        // Login using BaseTest 
        login("Admin", "admin123");

     
	}
	}
