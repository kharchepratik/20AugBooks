package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	
	static	ExtentReports extent;

	public static ExtentReports extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"\\reports\\EcommerceReport.html";

		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);

		reporter.config().setTheme(Theme.DARK);

		reporter.config().setReportName("Amazon Test report");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Executed by", "Vimannagar Batch");

		extent.setSystemInfo("Browser used", "Chrome");

		extent.setSystemInfo("Environment", "SIT");

		return extent;


	}

}
