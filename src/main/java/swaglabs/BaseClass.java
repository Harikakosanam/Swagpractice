package swaglabs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import objectRepo.LoginPage;
import objectRepo.Logout;








public class BaseClass {
	public ReadData_propfile rd = new ReadData_propfile();
	public WebDriver driver;
	public WebDriverUtil driverutil;
	@BeforeClass(groups= {"smoke","regression"})
	public void browserLaunch()
	 {
			driver = new ChromeDriver();
		    driver.get("https://www.saucedemo.com");
		    driverutil = new WebDriverUtil(driver);
			driverutil.maximizeWindow();
			driverutil.waitDriver();
			
		}
	@BeforeMethod(groups= {"smoke","regression"})
	public void login() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		String username = rd.readdatafrompropfile("username");
		String password = rd.readdatafrompropfile("password");
		lp.login(username, password);

	}
	@AfterMethod(groups= {"smoke","regression"})
	public void logout() {
	Logout hp = new Logout(driver);

      hp.logout();

	}

	@AfterClass(groups= {"smoke","regression"})
	public void closeBrowser() {
//		driver.close();
	}


	


}
