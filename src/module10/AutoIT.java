package module10;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {


		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.in/2017/10/functionisogramigoogleanalyticsobjectri.html");

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("photo")).click();
		
		Runtime.getRuntime().exec("D:\\Training\\Programs\\AutoIT\\Upload_Profilepic.exe");
		
		Thread.sleep(5000);
	
		//driver.close();
		
		
	}

}
