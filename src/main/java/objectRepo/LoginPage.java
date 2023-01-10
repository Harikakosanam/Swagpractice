package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	 @FindBy(name="user-name")
	 private WebElement username;
	 @FindBy(name="password")
	 private WebElement password;
	 @FindBy(name="login-button")
	 private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	 
	public void login(String user,String pwd)
    {
  	username.sendKeys(user);
  	password.sendKeys(pwd);
  	login.click();
  	
    }
    public LoginPage(WebDriver driver)
    {
  	  PageFactory.initElements(driver,this);
    }
}
