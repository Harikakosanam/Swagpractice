package swagproducts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import objectRepo.AddProduct;
import objectRepo.Address;
import objectRepo.CartPage;
import objectRepo.Homepage;
import objectRepo.Logout;
import swaglabs.BaseClass;
import swaglabs.TestDataCreation;

public class SwagLabPurchaseTest extends BaseClass {
	
	@Test(groups={"smoke"})
	public void swagPurchase() throws Exception
	{
		Homepage hp=new Homepage(driver);
		hp.boltTshirt();
		AddProduct ap=new AddProduct(driver);
		ap.addProduct();
		ap.addCart();
		CartPage cp=new CartPage(driver);
		cp.cartpage();
		Address ad=new Address(driver);
		
		TestDataCreation td=new TestDataCreation();
		
	String firstname=td.getFristName();
	String lastname=td.getLastname();
	String pincode=td.getPincode();
		
		ad.addAddress(firstname, lastname, pincode);
//		String actual="CHECKOUT: COMPLETE!";
//		String expected=lo.getResult().getText();
//		//Assert.assertEquals(expected, actual);
//		
//		System.out.println(expected);
		Logout lo=new Logout(driver);
		String actual="CHECKOUT: COMPLETE!";
		String expected=driver.findElement(By.xpath("//span[@class='title']")).getText();
		//Assert.assertEquals(expected, actual);
		
		System.out.println(expected);
//lo.getLogout();
		
	}
	@Test(groups= {"regression"})
	public void printElements()
	{
		List<WebElement>l=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		for(WebElement ele:l)
		{
			System.out.println(ele.getText());
		}
		
	}

}
