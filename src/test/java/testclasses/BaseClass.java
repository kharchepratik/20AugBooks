package testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.AirCanda;
import pages.BooksAmillion;



public class BaseClass {
	public static WebDriver driver;
	
	public BooksAmillion book;
	
	public AirCanda canda;
	@BeforeSuite
	public void openbrowser()
	{
		
		driver = new ChromeDriver();
		
	 	driver.get("https://www.aircanada.com/us/en/aco/home.html");
	 	//driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
	 	
	}
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.quit();
//	}
//	
	
	@BeforeClass
	public void perfromaction()
	{
		book = new BooksAmillion(driver);
		 canda = new AirCanda(driver);
	}
	
	

}
