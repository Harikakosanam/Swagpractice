package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private WebElement product;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addcart;
	

	public WebElement getProduct() {
		return product;
	}
	public void addProduct()
	{
		product.click();
		
	}
	public void addCart()
	{
		addcart.click();
	}

	 public  AddProduct(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	public WebElement getAddcart() {
		return addcart;
	}
	

}
