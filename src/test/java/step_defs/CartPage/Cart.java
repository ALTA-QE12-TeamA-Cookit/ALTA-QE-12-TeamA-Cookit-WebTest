package step_defs.CartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.cart.CartPage;
import org.example.pageObject.home.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_defs.Hooks;

public class Cart {
    private final WebDriver driver = Hooks.driver;

    CartPage cartPage = new CartPage(driver);

//    user checkout item
    @And("User click checkbox on selected item")
    public void userClickCheckboxOnSelectedItem() throws InterruptedException {
        Thread.sleep(2000);
        cartPage.clickCheckBox();
    }

    @And("User verify total price")
    public void userVerifyTotalPrice() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(cartPage.getTotalPrice(),cartPage.getItemPrice());
    }

    @And("User click checkout button")
    public void userClickCheckoutButton() throws InterruptedException {
        Thread.sleep(2000);
        cartPage.clickCheckOutBtn();
    }

    @Then("User already on payment page")
    public void userAlreadyOnPaymentPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(cartPage.validatePaymentPage());
    }

    //    User remove item on cart page
    @And("User click on add to cart icon")
    public void userClickOnAddToCartIcon() throws InterruptedException {
        Thread.sleep(2000);
        cartPage.clickAddToCartItem();
    }

    @And("User click remove item icon")
    public void userClickRemoveItemIcon() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickRemoveBtn();
    }

    @Then("pop up with message {string} has shown")
    public void popUpWithMessageHasShown(String message) {
        WebDriverWait w = new WebDriverWait(driver, 3);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@id='swal2-title']")));
        Assert.assertEquals(cartPage.getPopUpTitleAlert(), message);
    }


    @And("User click plus icon for adding more quantity product")
    public void userClickPlusIconForAddingMoreQuantityProduct() {
        cartPage.addMoreQty();
    }

    @Then("quantity product change value")
    public void quantityProductChangeValue() {
        Assert.assertTrue(cartPage.verifyQtyProduct());
    }
}
