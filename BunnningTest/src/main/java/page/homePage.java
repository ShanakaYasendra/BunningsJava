package page;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class homePage {
	
	public WebDriver driver;
	public elementHelper helper;
	  public homePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  this.driver= driver;
		  helper= new elementHelper(driver);
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 
	}
	  public void searchInput(String input)
	  {
		  helper.getElementByXpath("//input[contains(@data-page,'/search')]").clear();
		  helper.getElementByXpath("//input[contains(@data-page,'/search')]").sendKeys(input);
	  }
	  
	  
	  public void clickSearchButton()
	  {
		  helper.getElementByXpath("//button[contains(@class,'btn-submit')]").click();
	  }
	  public String getPlaceholder()
	  {
		  return helper.getElementByXpath("//input[contains(@data-page,'/search')]").getAttribute("placeholder");
	  }
	     public void clickListItem(String TabName)
	        {
	            
	            helper.getElementByXpath("(//input[@type='text'])[2]").click();
	            helper.getElementByXpath("(//span[@class='ui-menu-item_category'][contains(.,'"+TabName+"')])[1]").click();


	        }

}

