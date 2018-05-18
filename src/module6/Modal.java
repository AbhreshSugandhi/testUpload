package module6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		
		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.seleniumeasy.com/test/bootstrap-modal-demo.html");

		driver.findElement(By.xpath("//a[@href=\"#myModal0\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='btn']")).click();
	}
	
	
}
