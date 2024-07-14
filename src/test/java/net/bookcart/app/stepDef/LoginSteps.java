//package net.bookcart.app.stepDef;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.bookcart.app.factory.DriverInit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
///**
// * 1/6/2024
// * 9:28 PM
// */
//public class LoginSteps extends DriverInit {
//
//
//
//
//    @Given("User clicks on the login link")
//    public void userClicksOnTheLoginButton() {
//             driver.findElement(By.xpath("//span[text()='Login']")).click();
//    }
//
//    @Given("User enter the username as {string}")
//    public void userEnterTheUsernameAs(String username) {
//        driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys(username);
//    }
//    @Given("User enter the password as {string}")
//    public void userEnterThePasswordAs(String password) {
//        driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys(password);
//
//    }
//
//    @When("User click on the login button")
//    public void userClickOnTheLoginButton() {
//        driver.findElement(By.cssSelector("button[color='primary']")).click();
//
//    }
//    @Then("Login should be success")
//    public void loginShouldBeSuccess() {
//        WebElement element = driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]/span[1]"));
//        wait.until(ExpectedConditions.visibilityOf(element));
//
//
//    }
//
//    @Then("Login should fail")
//    public void loginShouldFail() {
//        boolean displayed = driver.findElement(By.cssSelector("mat-error[role='alert']")).isDisplayed();
//        System.out.println("displayed = " + displayed);
//
//    }
//}
