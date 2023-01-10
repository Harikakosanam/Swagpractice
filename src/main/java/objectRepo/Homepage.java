package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//img[@alt='Sauce Labs Bolt T-Shirt']")
	private WebElement bolttshirt;

	public WebElement getBolttshirt() {
		return bolttshirt;
	}
	  public void boltTshirt()
	  {
		  bolttshirt.click();
	  }
	  public  Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

}
