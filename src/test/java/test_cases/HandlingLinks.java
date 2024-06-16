// WAP to Handling the Links
package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

public static void main(String[] args) throws InterruptedException {      // 
		 WebDriver Driver=new ChromeDriver();
		 Driver.get("https://login.salesforce.com/?locale=in");
		 Driver.manage().window().maximize();
		 System.out.println(Driver.getTitle());
		 
		 Thread.sleep(3000);
		 
	/*	 Driver.findElement(By.linkText("Forgot Your Password?")).click();    //
		 Thread.sleep(3000);
		 Driver.navigate().back();
		 
		 Driver.findElement(By.partialLinkText("Use Custom")).click();        //
		 System.out.println(Driver.getTitle()); */
		
		 Driver.findElement(By.cssSelector("[type='submit']")).click();
		  
	}

}
