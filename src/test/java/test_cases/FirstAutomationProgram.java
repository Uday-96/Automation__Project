// First Automation Program
package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class FirstAutomationProgram {

public static void main(String[] args) throws InterruptedException {
	
 WebDriver driver =new ChromeDriver();
 
 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");              

 Thread.sleep(3000);
      
    
   Dimension D= new Dimension(100,200);
   
   driver.manage().window().setSize(D);
   
   driver.manage().window().maximize();
   
   
      WebElement  X= driver.findElement(By.id("mobile"));
 
       X.click();
       
       X.sendKeys("8446064532");
 
       Thread.sleep(3000);
 
       System.out.println(driver.getCurrentUrl());
       driver.close();    
                 
	

	}

}
