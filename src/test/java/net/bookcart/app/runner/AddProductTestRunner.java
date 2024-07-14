package net.bookcart.app.runner;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.sl.In;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.Status;
import io.cucumber.plugin.event.TestStepFinished;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import java.io.File;

/**
 * Unit test for simple App.
 */
@CucumberOptions(
        features = {"src/test/resources/features/addToCart.feature"},
        dryRun = false,
        monochrome = true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        glue = {"net.bookcart.app.stepDef","net.bookcart.app.pageObject","net.bookcart.app.hooks"},
//        plugin = {"pretty",
//                    "html:target/CucumberReports/CucumberReport.html",
//                    "json:reports/result.json",
//                    "junit:reports/result.xml"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddProductTestRunner extends AbstractTestNGCucumberTests {
    int k=Integer.MAX_VALUE;



}

