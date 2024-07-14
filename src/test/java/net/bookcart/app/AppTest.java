package net.bookcart.app;

import net.bookcart.app.factory.DriverType;
import net.bookcart.app.factory.DriverFactory;
import net.bookcart.app.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

/**
 * 1/9/2024
 * 11:09 AM
 */
public class AppTest {

    public String getReportConfigPath(){
        String reportConfig = new ConfigReader().init_properties().getProperty("reportConfig");
        if (reportConfig!=null) return reportConfig;
        else throw new RuntimeException("Report Config  Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
    @Test
    public void  test_login() throws InterruptedException {
        WebDriver webDriver = DriverFactory.init_driver("chrome");
        WebDriver driver = DriverFactory.getDriver();
//        WebDriver driver = DriverType.CHROME.initDriver();
        webDriver.get("https://bookcart.azurewebsites.net/");
        sleep(2000);





    }
}
