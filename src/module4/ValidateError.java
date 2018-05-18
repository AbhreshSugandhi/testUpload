package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateError {

	public static void main(String[] args) {
	
		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.naukri.com/nLogin/Login.php");
		
		driver.findElement(By.id("emailTxt")).sendKeys("a");
		
		driver.findElement(By.id("pwd1")).click();
		
		String errmsg = driver.findElement(By.id("emailTxt_err")).getText();
		
		boolean Result = errmsg.equals("Please enter a valid Email ID");
		
		System.out.println("Validation of Error Message"+ Result);
		
	}

}
