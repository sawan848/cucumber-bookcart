package net.bookcart.app.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * 1/9/2024
 * 10:58 AM
 */

public enum DriverType {


    CHROME{
        @Override
        public WebDriver initDriver(){
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
            getDriver().manage().deleteAllCookies();
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            return getDriver();
        }
    },FIREFOX{
        @Override
        public WebDriver initDriver(){
            tlDriver.set(new FirefoxDriver());

            getDriver().manage().deleteAllCookies();
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            return getDriver();
        }
    },EDGE{
        @Override
        public WebDriver initDriver(){
            tlDriver.set(new EdgeDriver());
            getDriver().manage().deleteAllCookies();
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            return getDriver();
        }

    };


    private static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();


    public abstract  WebDriver initDriver();
}
