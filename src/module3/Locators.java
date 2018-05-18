package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT - Facebook.com
		driver.get("https://www.facebook.com/");
		
		//usage of Locators
		/*driver.findElement(By.id("u_0_h")).sendKeys("Abhresh");
		
		driver.findElement(By.name("lastname")).sendKeys("Trainer");
				
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		
		driver.findElement(By.className("inputtext")).sendKeys("Trainer");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.findElement(By.partialLinkText("Why do I need")).click();
		
		driver.findElement(By.cssSelector("#u_0_m")).sendKeys("9876543210");
		*/
		
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("9876543210");
			
		
		
		
	}

}
