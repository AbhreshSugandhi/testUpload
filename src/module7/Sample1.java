package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {

	WebDriver driver;

	@BeforeTest
	public void OpenApp() {
		//Browser Instantiating Or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();		

		//Open AUT
		driver.get("http://newtours.demoaut.com/");	
	}

	@Test
	public void LogIn() throws InterruptedException {
		//Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");		
		
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		//Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		//click Continue
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(3000);
	}

	@AfterTest
	public void LogOut() throws InterruptedException {

		//Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		Thread.sleep(3000);
		
		//Close
		driver.close();
	}	
	
	
	}

