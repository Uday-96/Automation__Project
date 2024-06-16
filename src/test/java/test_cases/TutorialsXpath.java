// Locate Web Element of Tutorials Point
package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsXpath {

public static void main(String[] args) throws InterruptedException {
		 WebDriver A= new ChromeDriver();
		 A.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		 A.manage().window().maximize();
		 Thread.sleep(3000);
		// A.close();
	   
		 WebElement N= A.findElement(By.xpath("//input[@name='name']"));
	     N.click();
	   
	     Thread.sleep(3000);
	     N.sendKeys("Uday");
	   
	     Thread.sleep(3000);
	     A.manage().window().minimize();
	   
	     Thread.sleep(3000);
	     
	     //System.out.println(Name.isDisplayed());
	     
	     System.out.println(N.getAttribute("name"));

	}

}
