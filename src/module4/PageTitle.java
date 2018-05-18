package module4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) {

		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		
		driver.get("http://www.flipkart.com/");
		
		/*String PageTitle = driver.getTitle();
		
		System.out.println(PageTitle);
		
		System.out.println("The Page title is - "+ PageTitle);
		*/

	}

}
