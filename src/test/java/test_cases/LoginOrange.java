//OrangeHrm Automation
package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrange {

public static void main(String[] args) throws InterruptedException {
		 
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	Driver.close();

	}

}
