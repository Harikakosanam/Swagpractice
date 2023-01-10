package swaglabs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {

	WebDriver driver;
	WebElement element;

	public  WebDriverUtil(WebDriver driver) {
		this.driver = driver;

	}

	public void maximizeWindow() {
		driver.manage().window().maximize();

	}

	public void minimizeWindow() {
		driver.manage().window().minimize();

	}

	public void waitDriver() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public void dropdownHandling(WebElement element, String value)

	{
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public void dropdownHandling(WebElement element, int index)

	{
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public void dropdownHandling(String visbiletext, WebElement element)

	{
		Select s = new Select(element);
		s.selectByVisibleText(visbiletext);
	}

	public void frameHandling(int num) {
		driver.switchTo().frame(num);
	}

	public void switchToWindow(String windowId) {
		driver.switchTo().window(windowId);
	}
}
