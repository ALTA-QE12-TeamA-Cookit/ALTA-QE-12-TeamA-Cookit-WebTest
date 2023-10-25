package org.example.pageObject.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver webDriver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

//    user checkout item
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/figure/input")
    private WebElement checkboxCartPage;

    @FindBy(xpath = "//p[@class='text-orange-500 md:text-2xl lg:text-xl lg:font-semibold lg:mt-[20%]']")
    private WebElement itemPrice;

    @FindBy(xpath = "//span[@class='text-Primary']")
    private WebElement totalPrice;

    @FindBy(xpath = "//button[.='Checkout']")
    private WebElement checkoutBtn;

    @FindBy(xpath = "//h1[.='Payment']")
    private WebElement paymenntPageTitle;

//    User remove item on cart page

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/button[1]/*[name()='svg'][1]")
    private WebElement clickAddToCartItemBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/*[name()='svg'][1]")
    private WebElement removeItemBtn;

//    User add more quantity item on cart page
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[3]")
    private WebElement addMoreItemBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='path'][2]")
    private WebElement quantityProduct;

//    ============================================================================================

    //    user checkout item
    public void clickCheckBox() {
        checkboxCartPage.click();
    }

    public String getItemPrice() {
        return itemPrice.getText();
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }

    public void clickCheckOutBtn() {
        checkoutBtn.click();
    }

    public boolean validatePaymentPage() {
        return paymenntPageTitle.isDisplayed();
    }

    @FindBy(xpath = "//h2[@id='swal2-title']")
    private WebElement popUpAlertTitleCart;

//    User remove item on cart page

    public void clickAddToCartItem() {
        clickAddToCartItemBtn.click();
    }

    public void clickRemoveBtn() {
        removeItemBtn.click();
    }

    public String getPopUpTitleAlert() {
        return popUpAlertTitleCart.getText();
    }

//    User add more quantity item on cart page

//    public void click

    public void addMoreQty() {
        addMoreItemBtn.click();
    }

    public boolean verifyQtyProduct() {
        return quantityProduct.isDisplayed();
    }
}
