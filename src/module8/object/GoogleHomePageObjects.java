package module8.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {

	public GoogleHomePageObjects(WebDriver driver){
	//there is a PageFactory in selenium which will initialize all these elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name = "q")
	public WebElement txtSearch;
	
	@FindBy (name = "btnG")
	public WebElement btnSearch;
	
	@FindBy (linkText = "Selenium - Web Browser Automation")
	public WebElement clickSelenium;
	
	public void SearchGoogle(String searchText) {
		//passing parameters here
		txtSearch.sendKeys(searchText);
		btnSearch.submit();
		clickSelenium.click();
		
	}
	
}
