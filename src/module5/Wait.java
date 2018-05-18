package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args){
			//Browser Instantiating Or Open Browser
			System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		

			//Implicitly wait
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
						
			//Open AUT
			driver.get("http://newtours.demoaut.com/");

			//Enter UserID
			driver.findElement(By.name("userName")).sendKeys("tutorial");		
			
			//Enter Password
			driver.findElement(By.name("password")).sendKeys("tutorial");
			
			//Click on Sign in button
			driver.findElement(By.name("login")).click();
			
			//pageLoad Wait
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			
			//click Continue
			driver.findElement(By.name("findFlights")).click();
			
			//Click on Sign off
			driver.findElement(By.linkText("SIGN-OFF")).click();

	}

}
