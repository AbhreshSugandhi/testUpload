package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	//Browser Instantiating Or Open Browser
	System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();		

	//Open AUT
	driver.get("https://seleniumautomationpractice.blogspot.in/2017/10/5-clearintervaltimer2-counter1-counter1.html");
	
	WebDriverWait wait = new WebDriverWait(driver, 5);

	WebElement submitbtn;
	submitbtn = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("dynamicText2")));
	submitbtn.click();
	
	/*WebElement submitbtn1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmitResetRequest")));
	submitbtn1.click();
*/
	
	}

}
