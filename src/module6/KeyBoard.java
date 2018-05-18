package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

	public static void main(String[] args) throws InterruptedException {

		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.inviul.com");
		   
		   driver.manage().window().maximize();
		   
		   WebElement dbl = driver.findElement(By.xpath("//*[@id='s']"));
		   Thread.sleep(3000);
		   
		   //Instance of Actions class
		   Actions act = new Actions(driver);
		   
		   //Keyboard events operations
		   act.sendKeys(dbl, Keys.SHIFT, "selenium").build().perform();
		   
		   Thread.sleep(3000);
		   
		   driver.close();
		   
		   driver.quit();
			
	}

}
