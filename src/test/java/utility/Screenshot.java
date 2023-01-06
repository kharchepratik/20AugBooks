package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static String takescreenshot(WebDriver driver,String name) throws IOException {
		   
		TakesScreenshot src = (TakesScreenshot)driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		//String path = System.getProperty("user.dir")+name+".png";
		String path = "C:\\Users\\prati\\Pictures\\"+name+".png";
	    File destination = new File(path); 
	    FileHandler.copy(source, destination);
		return path;
		
		
	}

}
