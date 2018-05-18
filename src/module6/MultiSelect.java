package module6;
import java.util.List;
import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		// 1 - Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		// 2 - Open Browser
		driver.get("https://seleniumautomationpractice.blogspot.in/2017/10/functionisogramigoogleanalyticsobjectri.html");		
		//3 - Move the driver concentration to Continents Element
		Select oSelect = new Select(driver.findElement(By.id("selenium_commands")));
		//4 - Browser Command - Index
		oSelect.selectByIndex(0);
		Thread.sleep(3000);
		//5 - Navigation Commands - Visible text
		oSelect.selectByVisibleText("Navigation Commands");
		Thread.sleep(3000);	
		//6 - Print All the Options and then using for loop select all the option where we will actually do MultiSelection
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		for(int i = 0; i < iListSize; i++) {
			String sValue = oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			oSelect.selectByIndex(i);
			Thread.sleep(4000);
			//oSelect.deselectByIndex(i);
			//Thread.sleep(3000);
	}
		oSelect.deselectAll();
	}
}