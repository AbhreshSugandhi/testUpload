package module6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
	
		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String handle = driver.getWindowHandle();
		System.out.println("Main Window - " + handle);
		
		System.out.println("----------------------------------------------------------------------");
				
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("#content > div:nth-child(2) > div:nth-child(2) > div > div.wpb_raw_code.wpb_content_element.wpb_raw_html > div > p:nth-child(5) > button")).click();
		
		Set allWindow = driver.getWindowHandles();
		
		System.out.println("All window Names - "+ allWindow);
		
		System.out.println("----------------------------------------------------------------------");

		for(String newHandle : driver.getWindowHandles()) {
			System.out.println(newHandle);
			
			Thread.sleep(4000);
			
			driver.switchTo().window(handle);
			Thread.sleep(4000);
			
			driver.switchTo().window(newHandle);
			Thread.sleep(4000);
			
		}
		
		driver.close();
		
		driver.quit();
		
		
		
		
	}

}
