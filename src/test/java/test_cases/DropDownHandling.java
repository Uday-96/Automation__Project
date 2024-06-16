// Handling Dropdown List
package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

public static void main(String[] args) throws InterruptedException {
		 WebDriver Driver = new ChromeDriver();
		 Driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		 Thread.sleep(3000);
		 Driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
	/*	 WebElement City = Driver.findElement(By.xpath("//select[@id="city"]"));
		 
		 Select A = new Select(City);
		  A.selectByVisibleText("Choose City"); */

	}

}
