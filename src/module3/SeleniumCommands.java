package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumCommands {

	public static void main(String[] args) {

		//Single Line comment
		/*
		 * Multi Line comment
		 */
		
		/*
		 * I am going to take you through the example of Facebook.com to explain you all the types of locators
		 * For this execution I am going to use Chrome browser
		 * You need to use all the types of locators
		 */

		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "D:\\Training\\Installation stuff\\Exe Files\\geckodriver.exe");
		WebDriver FF = new FirefoxDriver();
	
		System.setProperty("webdriver.ie.driver", "D:\\Training\\Installation stuff\\Exe Files\\IEDriverServer.exe");
		WebDriver IE = new InternetExplorerDriver();
		
		//Close & Quit
		driver.close(); // this will end the current session
		driver.quit(); // this will end all the session of this instance
		
		//print Statement
		System.out.println("Welcome to Selenium Training");
		System.out.println("");

		
		//Get Commands
		driver.get("URL"); // To open URL in the Browser
		driver.getCurrentUrl();
		driver.getClass();
		driver.getPageSource();
		driver.getTitle();
		driver.getWindowHandle();

		//Navigation Commands
		driver.navigate().to("URL");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		
		//Element handling		
		//Clear
		driver.findElement(By.id("")).clear();
		
		//Type
		driver.findElement(By.id("")).sendKeys("Abhresh");
		
		//Click
		driver.findElement(By.id("")).click();
		
		//Get Info
		driver.findElement(By.id("")).getText();
		
		
	}

}




















