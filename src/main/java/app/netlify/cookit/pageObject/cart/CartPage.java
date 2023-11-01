package app.netlify.cookit.pageObject.cart;

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

//    User add reduce quantity item on cart page
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]")
    private WebElement reduceProductQty;

//    User place order item on cart page
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/img[1]")
    private WebElement gofoodDeliveryOptionBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/label[1]/p[1]")
    private WebElement paymentOptionBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/label[2]")
    private WebElement bankBcaBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]")
    private WebElement placeOrderBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
    private WebElement inputPasswordForm;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/label[2]")
    private WebElement confirmPassBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/h1[1]")
    private WebElement detailPurchasePage;

//    User received the order on my purchase page
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    private WebElement myPurchaseMenuBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/h1[1]")
    private WebElement myPurchasePage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/p[1]")
    private WebElement receiveTabBtn;

    @FindBy(xpath = "//p[text()='Ayam bakar goreng edit']")
    private WebElement productName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/button[1]")
    private WebElement orderReceiveBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/p[1]")
    private WebElement completeTab;

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

    public void addMoreQty() {
        addMoreItemBtn.click();
    }

    public boolean verifyQtyProduct() {
        return quantityProduct.isDisplayed();
    }

//    User add reduce quantity item on cart page
    public void clickReduceQtyBtn() {
        reduceProductQty.click();
    }

//    User place order item on cart page
    public void clickDelivOptionBtn() {
        gofoodDeliveryOptionBtn.click();
    }

    public void clickPaymentOptBtn() {
        paymentOptionBtn.click();
    }

    public void clickBankOptBtn() {
        bankBcaBtn.click();
    }

    public void inputPasswordConfirm(String inputPassword) {
        inputPasswordForm.sendKeys(inputPassword);
    }

    public void clickPlaceOrderBtn() {
        placeOrderBtn.click();
    }

    public void clickConfirmPassBtn() {
        confirmPassBtn.click();
    }

    public boolean verifyDetailPurchasePage() {
        return detailPurchasePage.isDisplayed();
    }

    //    User received the order on my purchase page

    public void clickPurchaseMenuBtn() {
        myPurchaseMenuBtn.click();
    }

    public boolean verifyMyPurchasePage() {
        return myPurchasePage.isDisplayed();
    }

    public void clickReceivedTabBtn() {
        receiveTabBtn.click();
    }

    public String verifyProductName() {
        return productName.getText();
    }

    public void clickOrderReceiveBtn() {
        orderReceiveBtn.click();
    }

    public void clickCompleteTabBtn() {
        completeTab.click();
    }

    public boolean verifyCompleteTabPage() {
        return completeTab.isDisplayed();
    }
}
