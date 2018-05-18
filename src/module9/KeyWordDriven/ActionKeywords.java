package module9.KeyWordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;
	
	public static void openbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public static void navigate() 
	{
		driver.navigate().to("https://www.google.com/");
	}
	
	public static void click_Gmail()
	{
		driver.findElement(By.linkText("Gmail")).click();
	}
	
}
