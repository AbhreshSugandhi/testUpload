package module10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		
		Screen s = new Screen();
		
		s.getScreen().click("D:\\Training\\Programs\\Sikuli\\cloud.JPG");
		
		Thread.sleep(3000);
		
		s.getScreen().click("D:\\Training\\Programs\\Sikuli\\edureka.JPG");
		
		
		
	}

}
