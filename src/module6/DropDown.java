package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		// 1 - Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		// 2
		driver.get("https://seleniumautomationpractice.blogspot.in/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		
		//3 - Move the driver concentration to Continents Element
		Select oSelect = new Select(driver.findElement(By.id("continents")));

		//4 - select option Europe by using SelectByVisibleText
		oSelect.selectByVisibleText("Europe");
		Thread.sleep(4000);
		
		//5 - Select Australia by using SelectByIndex
		oSelect.selectByIndex(3);
		Thread.sleep(4000);
		
		//6 - Select North America by using SelectByValue
		oSelect.selectByValue("f");
		Thread.sleep(4000);
		
		driver.close();
		
	}

}








