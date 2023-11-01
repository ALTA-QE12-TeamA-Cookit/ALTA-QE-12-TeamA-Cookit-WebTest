package step_defs.CartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import app.netlify.cookit.pageObject.cart.CartPage;
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

    //  add more quantity
    @And("User click plus icon for adding more quantity product")
    public void userClickPlusIconForAddingMoreQuantityProduct() {
        cartPage.addMoreQty();
    }

    @Then("quantity product change value")
    public void quantityProductChangeValue() {
        Assert.assertTrue(cartPage.verifyQtyProduct());
    }

    //  reduce quantity
    @And("User click minus icon for adding more quantity product")
    public void userClickMinusIconForAddingMoreQuantityProduct() {
        cartPage.clickReduceQtyBtn();
    }

    //    User place order item on cart page
    @And("User click delivery option GO FOOD")
    public void userClickDeliveryOptionGOFOOD() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickDelivOptionBtn();
    }

    @And("User click payment option")
    public void userClickPaymentOption() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickPaymentOptBtn();
    }

    @And("User click Bank BCA")
    public void userClickBankBCA() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickBankOptBtn();
    }

    @And("User click Place Order button")
    public void userClickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickPlaceOrderBtn();
    }

    @And("User input {string} as password")
    public void userInputAsPassword(String inputConfirmPass) throws InterruptedException {
        Thread.sleep(3000);
        cartPage.inputPasswordConfirm(inputConfirmPass);
    }

    @And("User click confirm button")
    public void userClickConfirmButton() throws InterruptedException {
        Thread.sleep(3000);
        cartPage.clickConfirmPassBtn();
    }

    @Then("Pop up with message {string} is shown")
    public void popUpWithMessageIsShown(String message) throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait w = new WebDriverWait(driver, 5);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@id='swal2-title']")));
        Assert.assertEquals(cartPage.getPopUpTitleAlert(), message);
    }

    @And("User redirect to detail purchase page")
    public void userRedirectToDetailPurchasePage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(cartPage.verifyDetailPurchasePage());
    }

//    User received the order on my purchase page

    @And("User click my purchase menu")
    public void userClickMyPurchaseMenu() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickPurchaseMenuBtn();
    }

    @When("User already on my purchase page")
    public void userAlreadyOnMyPurchasePage() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertTrue(cartPage.verifyMyPurchasePage());
    }

    @And("User click on recieved tab")
    public void userClickOnRecievedTab() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickReceivedTabBtn();
    }

    @And("User click Order Recieved button on selected product")
    public void userClickOrderRecievedButtonOnSelectedProduct() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickOrderReceiveBtn();
    }

    @And("User click complete tab")
    public void userClickCompleteTab() throws InterruptedException {
        Thread.sleep(1500);
        cartPage.clickCompleteTabBtn();
    }

    @Then("Recieved product has shown on complete tab")
    public void recievedProductHasShownOnCompleteTab() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertTrue(cartPage.verifyCompleteTabPage());
    }
}
