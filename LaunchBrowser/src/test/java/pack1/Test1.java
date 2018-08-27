package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {

	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narasimha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
     WebDriver driver=new ChromeDriver();

		  
		  
		 
		  driver.get("file:///C:/Users/Narasimha/Desktop/link.html");
		

		  driver.findElement(By.id("a1")).click();
		  
		  driver.navigate().back();
		  driver.findElement(By.name("n2")).click();
		  driver.navigate().back();
		  driver.findElement(By.id("a3")).click();
		  driver.navigate().back();
		  driver.findElement(By.partialLinkText("ista")).click();
		  
		  	driver.close();
	}
	}
	

