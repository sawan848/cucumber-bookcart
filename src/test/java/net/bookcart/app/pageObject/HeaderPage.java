package net.bookcart.app.pageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 1/10/2024
 * 9:59 AM
 */
public class HeaderPage  {

    private PageContext pageContext;

    public HeaderPage(PageContext pageContext) {
        this.pageContext = pageContext;
    }


    @Given("User clicks on the login link")
    public void userClicksOnTheLoginButton() {
        pageContext.getDriver().findElement(By.xpath("//span[text()='Login']")).click();
    }

    @Given("user search for a book {string}")
    public void userSearchForABook(String bookname) {
        WebElement searchBox = pageContext.getDriver().findElement(By.cssSelector("input[type='search']"));
        pageContext.getWait().until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(bookname);
        WebElement element = pageContext.getDriver().findElement(By.cssSelector("mat-option[role='option'] span"));
        WebElement option = pageContext.getWait().until(ExpectedConditions.visibilityOf(element));
        option.click();


    }

    @Then("the cart badge should get updated")
    public void theCartBadgeShouldGetUpdated() {
        WebElement snackBar = pageContext.getDriver().findElement(By.tagName("snack-bar-container"));
        WebElement element = pageContext.getDriver().findElement(By.cssSelector("#mat-badge-content-0"));
//        wait.until(ExpectedConditions.visibilityOf(snackBar));
//        wait.until(ExpectedConditions.invisibilityOf(snackBar));
        System.out.println("element = " + element);
        System.out.println("snackBar = " + snackBar.isDisplayed());



    }
}
