package OTR;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public  class Base_class  {
WebDriver driver;
	@BeforeSuite
	public  void beforesuite()
	{
		System.out.println("connection");
	}
@BeforeMethod
	public  void beforemethod()
	{
	driver.get("http://172.16.15.42:8002/candidate/otr");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	
		
	}
@AfterMethod

	public  void aftermethod()
	
	{
	
	App_Locators l1 = new App_Locators(driver);
	l1.candidate_name.sendKeys("shanu");
	  l1.changed_name_dropdown();
	  l1.selection();
	  l1.change_name("anand");
	 
		
	}
@AfterSuite

	public  void aftersuite()
	{
		System.out.println("connection close");
	}

	
}
