package net.bookcart.app.hooks;


import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.cucumber.java.*;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import net.bookcart.app.pageObject.PageContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.EventListener;

/**
*Jun 9, 20237:11:45 PM 
*
*/
public class MyHooks  {

	private PageContext pageContext;

	public MyHooks(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	@Before()
	public  void beforeScenario(Scenario scenario){
		RemoteWebDriver driver=new EdgeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		pageContext.setDriver(driver);
		pageContext.setWait(wait);
		driver.get("https://bookcart.azurewebsites.net/");
		WebDriver.Options manage = pageContext.getDriver().manage();
		manage.timeouts().implicitlyWait(Duration.ofSeconds(10));
		manage.window().maximize();
		System.out.println("Title "+pageContext.getDriver().getTitle());
		System.out.println("scenario name = " + scenario.getName());

	}
	@After
	public  void afterScenario(Scenario scenario){
//		scenario.log("Log generated using scenario instance");
//		ExtentCucumberAdapter.addTestStepLog("Log generated using add test step log");
		ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,"Info added using adapter ");

		System.out.println("is scenario failed = " + scenario.isFailed());
		if (scenario.isFailed()){
			byte[] screenshotAs = pageContext.getDriver().getScreenshotAs(OutputType.BYTES);
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot()).build());
//			scenario.attach(screenshotAs,"image/png","screenshot_"+new SimpleDateFormat().format(new Date()));
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MarkupHelper.createLabel(scenario.getStatus().name(), ExtentColor.RED));
		}
		pageContext.getDriver().quit();

	}

	private String getBase64Screenshot() {
		String screenshotAs = pageContext.getDriver().getScreenshotAs(OutputType.BASE64);

		return screenshotAs;
	}

	@BeforeStep
	public  void beforeStep(Scenario scenario){

	}
	@AfterStep
	public  void afterStep(Scenario scenario){

	}


}


