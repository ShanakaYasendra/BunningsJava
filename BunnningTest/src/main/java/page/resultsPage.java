package page;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.elementHelper;

public class resultsPage {
	
	public WebDriver driver;
	public elementHelper helper;
	
	public resultsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  this.driver= driver;
		  helper= new elementHelper(driver);
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 
	}
	public WebElement h1() {
		
		return helper.getElementByClassName("responsive-search-title");
	}
	 public String getTab(String tab)
     {
         WebElement parent = helper.getElementByXpath("//span[@class='responsive-search-tabs_list-item-title'][contains(.,'"+tab+"')]/following-sibling::span[3]");
         return parent.getText();
 
      }
	 
	 public Boolean ActiveLink(String tab)
     {
         WebElement parent = helper.getElementByXpath("//li[@class='responsive-search-tabs_list-item is-active ']/child::*[position()=1]");
         if(parent.getText().contains(tab))
         {
             return true;
         }
         else
         {
             return false;
         }
     }

}

