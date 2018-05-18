package module6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkRaidioBtn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Programs\\SeleniumTutorial\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Open URL
		driver.get("https://seleniumautomationpractice.blogspot.in/2017/10/automation-testing-sample.html");
		
		//driver.findElement(By.cssSelector("#post-body-2883905488592509488 > form > div > input[type=\'checkbox\']:nth-child(2)")).click();
		
		// Get the count of all available checkboxes.
		List<WebElement> list = driver.findElements(By.tagName("input"));

		// Below code will select all of the check boxes and radio buttons.
		for (int i = 0; i < list.size(); i++) {
			// Checking the check box
			if (list.get(i).getAttribute("type").trim()
					.equalsIgnoreCase("checkbox")) {

				// Show the Checkbox count with value.
				System.out.println("CheckBox = " + i + " "
						+ list.get(i).getAttribute("value").trim());

				// Select the check box if not already selected.
				if (!(list.get(i).isSelected())) {
					list.get(i).click();
				} else {
					// De-select the check boxes.
					list.get(i).click();
				}
			} 
			
			// Checking the Radio buttons.
			else if (list.get(i).getAttribute("type").trim()
					.equalsIgnoreCase("radio")) {

				// Show the size of radio buttons.
				System.out.println("Radio  = " + i + " "
						+ list.get(i).getAttribute("value").trim());

				// Select the radio button if not already selected.
				if (!(list.get(i).isSelected())) {
					list.get(i).click();
				}
			}

			// Pause so that you can see the results.
			Thread.sleep(5000);
		}

		// close the Chrome browser instance.
		driver.close();
		
	}
}