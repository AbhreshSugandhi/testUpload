package module9.DDT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTest {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrow;
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.in/2017/10/automation-testing-sample_28.html");
	}

	@Test(dataProvider = "TestData")
	public void TestChrome(String Fname, String Lname, String Address) throws InterruptedException {
		
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys(Fname);
		
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys(Lname);
		
		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys(Address);
		Thread.sleep(4000);
	}
	
	@DataProvider(name = "TestData")
	public Object[][]TestDataFeed() throws BiffException, IOException{
		
		wb = Workbook.getWorkbook(new File("D:\\Training\\Programs\\Edureka_Eve_WD\\src\\module9\\TestDataFiles\\TestData.xls"));
		
		// Load the sheet in our case its the 2nd sheet in the workbook
		sh = wb.getSheet(1);
		
		//get the no of rows so that we can run that in the loop
		numrow = sh.getRows();
		
		//Create 2D array and pass row and column
		Object[][]formdata=new Object[numrow][sh.getColumns()];
		
		//This will run a loop and each iteration it will fetch a new row
		for(int i=0; i<numrow; i++) {
			//Fetch data for Fname
			formdata[i][0]=sh.getCell(0,i).getContents();
			//Fetch data for Lname
			formdata[i][1]=sh.getCell(1,i).getContents();
			//Fetch data for Address
			formdata[i][2]=sh.getCell(2,i).getContents();
		}
		return formdata;
	}
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
	
}