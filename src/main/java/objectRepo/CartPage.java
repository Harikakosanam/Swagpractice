package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	 @FindBy(name="checkout")
	 private WebElement checkout;
	
	 

	public WebElement getCheckout() {
		return checkout;
	}
	
//	@FindBy(className="title")
//	private WebElement Result;
//	
//	
//   public WebElement getResult() {
//		return Result;
//	}


	public void cartpage()
	{
		checkout.click();
		
	}
	 public  CartPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	
	 
}
