package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

  	
	 @FindBy(xpath="//button[.='Open Menu']")
	 private WebElement menu;
	 @FindBy(xpath="//a[.='Logout']")
	 private WebElement logout;
	public WebElement getMenu() {
		return menu;
	}
	public WebElement getLogout() {
		return logout;
	}
	 public void logout()
	 {
		 menu.click();
		 logout.click();
	 }
	 public Logout(WebDriver driver)
	 {
			PageFactory.initElements(driver,this);

	 }
}
