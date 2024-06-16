// Lecture 7--Handling Frame
package test_cases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame {

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	List<WebElement> Radio= driver.findElements(By.xpath("//input[@name='radioButton']"));
	
	
	WebElement frame= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	frame.click();
	


	}

}
