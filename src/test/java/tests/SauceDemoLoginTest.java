package tests;

import org.testng.annotations.Test;

import pages.SauceDemoLoginPage;
import utilities.Driver;
import utilities.PropertiesReader;

import org.testng.annotations.BeforeMethod;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class SauceDemoLoginTest {
	SauceDemoLoginPage page;
	
  @Test
  public void sauceDemoTestcase1() {
	  /*
	   * Go to https://saucedemo.com
	   * log in with username = standard_user and password = secret_sauce
	   * Find all the results and get them in a list, and print the size of the list
	   * 
	   */
	  page = new SauceDemoLoginPage();
	  
	  Driver.getDriver().get(PropertiesReader.getProperty("sauceURL"));
	  page.userName.sendKeys(PropertiesReader.getProperty("userName"));
	  page.password.sendKeys(PropertiesReader.getProperty("password"));
	  page.login.click();
	  
	 System.out.println(page.items.size());
  }
  
  @Test
  public void sauceDemoTestcase2 () {
	  /*
	   * Go to https://saucedemo.com
	   * log in with username = standard_user and password = secret_sauce
	   * Find all the results.
	   * Print the price of each result
	   * Hint: loop through the list, get index and then get the text
	   */
	  
	  page = new SauceDemoLoginPage();
	  Driver.getDriver().get(PropertiesReader.getProperty("sauceURL"));
	  page.userName.sendKeys(PropertiesReader.getProperty("userName"));
	  page.password.sendKeys(PropertiesReader.getProperty("password"));
	  page.login.click();
	  
	  for (WebElement itemPrices:page.price) {
		  System.out.println(itemPrices.getText().trim());
	  }
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  Driver.quitDriver();
  }

}
