package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BooksAmillion {
	private	WebDriver driver;

	private	By signinbutton = By.xpath("//*[text()='Account Sign In']");
		
	private	By interemail = By.xpath("(//*[@name='email_address'])[1]");

	private	By password = By.xpath("(//*[@name='password'])[1]");

	private	By signin = By.xpath("(//*[@id='signInButton'])[1]");
	
	private By home  = By.xpath("//*[text()='Home']");

	private	By hovarelement = By.xpath("(//*[@class='arrow'])[1]");

	private	By photoname = By.xpath("(//*[text()='Digital Photography'])[1]");
	
	private	By newyorkbook = By.xpath("(//*[@class='title'])[1]");
	
	private	By addtocart = By.xpath("(//*[@class='buy button productPurchase'])[1]");
	
	private	By chekoutbutton = By.xpath("(//*[@class='button navigation'])[1]");
	
	//private	By chekout = By.xpath("(//*[@class='atcCheckoutBTN'])");
	
	public BooksAmillion(WebDriver driver)
	{
		this.driver = driver;
	}
	public void crateaccount()
	{
		driver.findElement(signinbutton).click();
		driver.findElement(interemail).sendKeys("pratikpkharche25@gmail.com");
		driver.findElement(password).sendKeys("Vrushali@16");
	   
	}
	public void interemail()
	{
		driver.findElement(signin).click();
		//driver.findElement(home).click();
		WebElement hovar = driver.findElement(hovarelement);
		Actions act = new Actions(driver);
		act.moveToElement(hovar).perform();
		driver.findElement(photoname).click();
		
		driver.findElement(newyorkbook).click();
		
	}
	public void orderbook()
	{
		///driver.findElement(bookoffairy).click();
		driver.findElement(addtocart).click();
		driver.findElement(chekoutbutton).click();
	
	}	

}
