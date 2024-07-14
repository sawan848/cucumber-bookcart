package net.bookcart.app.pageObject;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 1/10/2024
 * 11:48 AM
 */
public class HomePage  {
    private PageContext pageContext;

    public HomePage(PageContext pageContext) {
        this.pageContext = pageContext;
    }


    @When("user add the book to the cart")
    public void userAddTheBookToTheCart() {
        WebElement element = pageContext.getDriver().findElement(By.cssSelector("button[color='primary']"));
        pageContext.getWait().until(ExpectedConditions.visibilityOf(element)).click();

    }

}
