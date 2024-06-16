// Handling Radio Buttons
package test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    
		    List<WebElement> Radio= driver.findElements(By.xpath("//input[@name='radioButton']"));
		    for(int i=0; i<=Radio.size(); i++) {
		    	Radio.get(i).click();
		    	Thread.sleep(3000);
		    }
           
	}

}
