package module7;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {

		WebDriver driver;
		String url = "http://newtours.demoaut.com/";
	
	@Test(priority = 12)
	public void OpenApp() {
		//Browser Instantiating Or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();		
	
		//Open AUT
		driver.get(url);	
	}
	
	@Test (priority = 22, dependsOnMethods = "LogIn")
	public void LogOut() throws InterruptedException {
	
		//Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		Thread.sleep(3000);
		
		//Close
		//driver.close();
	}	
	
	@Test (priority = 21, dependsOnMethods = "OpenApp")
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
	
	@Test(priority = 25)
	public void TakeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("D:\\Training\\Programs\\Edureka_Mar_E_WE\\Screenshot\\screenshot.png"));
		FileUtils.copyFile(scrFile, new File("D:\\Training\\Programs\\Edureka_Mar_E_WE\\Screenshot\\"+System.currentTimeMillis()+".png"));


	}
	}
