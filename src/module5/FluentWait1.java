package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.base.Function;

import org.openqa.selenium.support.ui.FluentWait;
	
public class FluentWait1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Programs\\SeleniumTutorial\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumautomationpractice.blogspot.in/2017/10/5-clearintervaltimer2-counter1-counter1.html");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.MINUTES);
		wait.ignoring(NoSuchElementException.class); // We need to ignore this
														// exception.

		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver arg0) {
				System.out.println("Checking for the object!!");
				WebElement element = arg0.findElement(By.linkText("dynamicText6"));
				if (element != null) {
					System.out.println("A new dynamic object is found.");
				}
				return element;
			}
		};

		wait.until(function);
		
		driver.close();
	}
}
