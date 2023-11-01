package app.netlify.cookit.pageObject.my_purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPurchasePage {
    public static WebDriver webDriver;

    public MyPurchasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    // My Purchase Object

    @FindBy(xpath = "//div[@class='w-10/12']")
    private WebElement buttonBackToHome;

    @FindBy(css = ".dropdown.hidden li:nth-of-type(2)")
    private WebElement buttonMyPurchase;

    @FindBy(xpath = "//button[@class='w-44 col-start-2 bg-primary place-self-end py-1 rounded-md text-white']")
    private WebElement buttonPay;

    @FindBy(xpath = "//span[@class='cursor-pointer']")
    private WebElement buttonCopyVA;

    // My Purhcase Function

    public void clickButtonMyPurchase(){
        buttonMyPurchase.click();
    }

    public void clickButtonHome() {
        buttonBackToHome.click();
    }

    public void clickButtonPay() {
        buttonPay.click();
    }

    public void clickButtonCopyVA() {
        buttonCopyVA.click();
    }
}
