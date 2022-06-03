package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SauceDemoLoginPage {
	
	public SauceDemoLoginPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "user-name")
	public WebElement userName;
	
	@FindBy (id = "password")
	public WebElement password;
	/*You can also directly put the Id as a webElement method name without putting it at the annotation
	 * Remember that this approach only works with ID locator. Like:
	 *@FindBy
	 *public WebElement password;
	 */
	
	@FindBy (css = ".submit-button.btn_action")
	public WebElement login;
	
	@FindBy (css = ".inventory_item")
	public List<WebElement> items; // it is a list, so we have to put it in a list
	
	@FindBy (css = ".inventory_item_price")
	public List<WebElement> price;

}
