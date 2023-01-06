package pages;

import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirCanda  {
	
	private WebDriver driver;
	
	@FindBy(xpath = "(//*[@class='abc-tab-button abc-button-wrapper'])[1]")
	private WebElement plan;
	
	@FindBy(xpath = "(//*[@type='radio'])[2]")
	private WebElement radiobutton;
	
	@FindBy(xpath = "(//*[@aria-label='Destination'])[1]")
	private WebElement inputbox;
	
	@FindBy(xpath = "(//*[@class='aamIframeLoaded'])[1]")
	private WebElement ifranme;
	
	@FindBy(xpath = "(//*[@class='abc-typeahead-results-panel']//li)[6]")
	private WebElement delhi;
	
//	@FindBy(xpath = "(//*[@class='abc-tab-button abc-button-wrapper'])[1]")
	//private WebElement plan;

	public AirCanda(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void bookflight()
	{
		//plan.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		radiobutton.click();
		
		
		inputbox.sendKeys("del");
		Set<String> allwin = driver.getWindowHandles();

		for(String id :allwin)
		{
			if(!(id.equals(parent)))
			{
				driver.switchTo().window(id);
			}
		}
		delhi.click();
		
	}
}
