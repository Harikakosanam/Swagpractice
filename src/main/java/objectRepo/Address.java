package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	@FindBy(name="firstName")
	private WebElement firstname;
	@FindBy(name="lastName")
	private WebElement lastname;
	@FindBy(xpath="//input[@placeholder='Zip/Postal Code']")
	private WebElement pincode;
	@FindBy(id="continue")
	private WebElement continu;
	@FindBy(id="finish")
	private WebElement finish;
	@FindBy(xpath="//button[.='Back Home']")
	private WebElement backhome;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public void addAddress(String fname,String lname,String pin)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		pincode.sendKeys(pin);
		continu.click();
		finish.click();
		backhome.click();
	}
	public WebElement getContinu()
	{
		return continu;
	}
	public Address(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getFinish() {
		return finish;
	}
	public WebElement getBackhome() {
		return backhome;
	}
//	@FindBy(className="title")
//	private WebElement Result;
//	
//	
//   public WebElement getResult() {
//		return Result;
//	}

}
