package module6;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DialogBoxPopUp {

	public static void main(String[] args) throws Exception {
	
	//Open Browser
	System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    
	//open webpage
    driver.get("http://chercher.tech/hidden-division-popup");
    
    driver.findElement(By.xpath("/html/body/a")).click();
    
    //send text to Name field on overlay
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hidden Division Text");
    
    driver.findElement(By.xpath("/html/body/div/div/ul[1]/li[2]/button")).click();
    
    Alert a = driver.switchTo().alert();
    a.accept(); 
}}