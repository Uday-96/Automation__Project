// WAP to Take a Scrrenshot 
package test_cases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver Driver = new ChromeDriver();
		 Driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		 Thread.sleep(3000);
		 Driver.manage().window().maximize();
		 
         File Source =((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
         File Dest =new File("C:\\Testing Lectures\\Tutorials pointUI.png");
         FileHandler.copy(Source, Dest);            // Io Exception
         Thread.sleep(3000);
         Driver.close();
     
	}

}
