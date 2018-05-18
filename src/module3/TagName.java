package module3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		
		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List <WebElement> taglist = driver.findElements(By.tagName("a"));
		
		System.out.println(taglist.size());
		
		for (int i=0; i<taglist.size(); i++) {
			System.out.println(taglist.get(i).getText());
		}
	}

}
