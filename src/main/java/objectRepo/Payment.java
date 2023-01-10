package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	@FindBy(name="finish")
	private WebElement finish;

	public WebElement getFinish() {
		return finish;
	}
	public void payment()
	{
		finish.click();
		
	}
  public Payment(WebDriver driver)
  {
		PageFactory.initElements(driver,this);

  }
}
