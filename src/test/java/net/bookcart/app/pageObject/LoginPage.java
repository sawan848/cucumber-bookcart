package net.bookcart.app.pageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 7/11/2023
 * 11:20 AM
 */
public class LoginPage  {
    private PageContext pageContext;

    public LoginPage(PageContext pageContext) {
        this.pageContext = pageContext;
    }

    @Given("User enter the username as {string}")
    public LoginPage userEnterTheUsernameAs(String username) {
        pageContext.getDriver().findElement(By.cssSelector("input[formcontrolname='username']")).
                sendKeys(username);
        return this;
    }
    @Given("User enter the password as {string}")
    public LoginPage userEnterThePasswordAs(String password) {
        pageContext.getDriver().findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys(password);
        return this;

    }

    @Then("Login should be success")
    public HomePage loginShouldBeSuccess() {
        WebElement element = pageContext.getDriver().findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]/span[1]"));
        pageContext.getWait().until(ExpectedConditions.visibilityOf(element));
        return new HomePage(pageContext);


    }

    @When("User click on the login button")
    public HomePage userClickOnTheLoginButton() {
        pageContext.getDriver().findElement(By.cssSelector("button[color='primary']")).click();
        return new HomePage(pageContext);
    }
    @Then("Login should fail")
    public HomePage loginShouldFail() {
        boolean displayed = pageContext.getDriver().findElement(By.cssSelector("mat-error[role='alert']")).isDisplayed();
        System.out.println("displayed = " + displayed);
        return new HomePage(pageContext);
    }

    @Given("user login into the application with username as {string} and password as {string}")
    public void userLoginIntoTheApplicationWithUsernameAsAndPasswordAs(String username, String password) {
        new HeaderPage(pageContext).userClicksOnTheLoginButton();

        this.userEnterTheUsernameAs(username).
                userEnterThePasswordAs(password).
                userClickOnTheLoginButton();
        this.loginShouldBeSuccess();
//        this.userEnterTheUsernameAs(username);
//        this.userEnterThePasswordAs(password);
//        this.userClickOnTheLoginButton();
    }

}
