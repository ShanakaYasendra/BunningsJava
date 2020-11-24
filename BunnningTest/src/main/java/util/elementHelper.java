package util;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementHelper {
	
	public WebDriver driver;
	
	
	public elementHelper(WebDriver driver)
	{
		this.driver= driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public WebElement getElementByID(String element)
    {
        try
        {
            return driver.findElement(By.id(element));
        }
        catch(NoSuchElementException e)
        {
            return null; 
        }

    }
	
	public WebElement getElementByClassName(String element)
    {
        try
        {
            return driver.findElement(By.className(element));
        }
        catch(NoSuchElementException e)
        {
            return null; 
        }

    }
	public WebElement getElementByCSS(String element)
    {
        try
        {
            return driver.findElement(By.cssSelector(element));
        }
        catch(NoSuchElementException e)
        {
            return null; 
        }

    }
	public WebElement getElementByName(String element)
    {
        try
        {
            return driver.findElement(By.name(element));
        }
        catch(NoSuchElementException e)
        {
            return null; 
        }

    }
	public WebElement getElementByTag(String element)
    {
        try
        {
            return driver.findElement(By.tagName(element));
        }
        catch(NoSuchElementException e)
        {
            return null; 
        }

    }
	public WebElement getElementByLinkText(String element)
    {
        try
        {
            return driver.findElement(By.linkText(element));
        }
        catch(NoSuchElementException e)
        {
            return null; 
        }

    }
	public WebElement getElementByXpath(String element)
    {
        try
        {
            return driver.findElement(By.xpath(element));
        }
        catch(NoSuchElementException e)
        {
            return null; 
        }

    }
}
