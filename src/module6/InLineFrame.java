package module6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InLineFrame {

	public static void main(String[] args) {
		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.yahoo.com/");
		driver.get("http://jqueryui.com/droppable/");

		List<WebElement> iFrame = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total iFrames are - " + iFrame.size());
	}
}
