package net.bookcart.app.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Unit test for simple App.
 */
@CucumberOptions(
        features = {"src/test/resources/features/login.feature"},
        dryRun = false,
        monochrome = true,
        glue = {"net.bookcart.app.stepDef","net.bookcart.app.pageObject","net.bookcart.app.hooks"},
//        plugin = {"pretty",
//                    "html:target/CucumberReports/CucumberReport.html",
//                    "json:reports/result.json",
//                    "junit:reports/result.xml"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginTestRunner  extends AbstractTestNGCucumberTests
{


}
