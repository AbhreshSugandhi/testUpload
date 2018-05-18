package module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.in/2018/01/blog-post.html");
		
		driver.findElement(By.id("alert")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		
		String alertmsg = simpleAlert.getText();
		
		System.out.println(alertmsg);
		Thread.sleep(4000);

		simpleAlert.accept();
		Thread.sleep(4000);
		
		driver.close();
	}

}
