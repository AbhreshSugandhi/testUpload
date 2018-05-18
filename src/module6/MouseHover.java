package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
	
		//Browser Instantiating Or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		//Open AUT
		driver.get("https://www.edureka.co/");
		
		Thread.sleep(2000);
	
		//Mouse Hover
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("dLabel")))
		.build().perform();
		
		Thread.sleep(5000);
	
	}

}
