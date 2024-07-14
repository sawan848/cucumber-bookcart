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
// * 1/9/2024
// * 12:14 PM
// */
//public class AddToCartSteps extends DriverInit {
//
//
//
//
//
//    @Given("user login into the application with username as {string} and password as {string}")
//    public void userLoginIntoTheApplicationWithUsernameAsAndPasswordAs(String username, String password) {
//        driver.findElement(By.xpath("//span[text()='Login']")).click();
//        driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys(username);
//        driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys(password);
//        driver.findElement(By.cssSelector("button[color='primary']")).click();
//
//
//    }
//    @Given("user search for a book {string}")
//    public void userSearchForABook(String bookname) {
//        driver.findElement(By.cssSelector("input[type='search']")).sendKeys(bookname);
//        WebElement element = driver.findElement(By.cssSelector("mat-option[role='option'] span"));
//        WebElement option = wait.until(ExpectedConditions.visibilityOf(element));
//        option.click();
//
//
//    }
//    @When("user add the book to the cart")
//    public void userAddTheBookToTheCart() {
//        WebElement element = driver.findElement(By.cssSelector("button[color='primary']"));
//        wait.until(ExpectedConditions.visibilityOf(element)).click();
//
//    }
//    @Then("the cart badge should get updated")
//    public void theCartBadgeShouldGetUpdated() {
//        WebElement snackBar = driver.findElement(By.tagName("snack-bar-container"));
//        WebElement element = driver.findElement(By.cssSelector("#mat-badge-content-0"));
////        wait.until(ExpectedConditions.visibilityOf(snackBar));
////        wait.until(ExpectedConditions.invisibilityOf(snackBar));
//        System.out.println("element = " + element);
//        System.out.println("snackBar = " + snackBar.isDisplayed());
//
//
//
//    }
//
//}
