package stepDefs;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.homePage;
import page.resultsPage;

public class Stepdefs extends Base
{
	public String getOsName()
	{
		return System.getProperty("os.name");
		
	}
	
	@Given("Customer is on the Bunning Web site")
	public void customer_is_on_the_bunning_web_site() {
		if(getOsName().startsWith("Windows"))
		{
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver.exe");
		}
		else
		{
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver");	
		}
		driver= new ChromeDriver();
		driver.navigate().to("http://www.Bunnings.com.au");
		home= new homePage(driver);
	}

	@When("Customer enter {string} to the search input")
	public void customer_enter_to_the_search_input(String searchInput) {
			
		home.searchInput(searchInput);
	
	}

	@When("click Search")
	public void click_search() {
		home.clickSearchButton();
		
	  

	}

	@Then("results page should load")
	public void results_page_should_load() {
	results= new resultsPage(driver);
	

	}

	@Then("results page should display {string}")
	public void results_page_should_display(String heading) {
	
		assertEquals(results.h1().getText(),heading);
	}

	@Then("{string} Tab should display with results")
	public void tab_should_display_with_products(String tabName) {
	   
		org.junit.Assert.assertTrue(results.ActiveLink(tabName));

	}

	@Then("{string} Tab heading should display {string}")
	public void tab_heading_should_display(String tabname, String count) {
	  
		assertEquals(tabname + results.getTab(tabname), count);
	   
	}
	
	@Then("close the Browser")
	public void close_the_browser() {
	    driver.close();
	}


	@When("select {string} from the drop down")
	public void select_from_the_drop_down(String tabName) {
		    home.clickListItem(tabName);
	}


		



}
