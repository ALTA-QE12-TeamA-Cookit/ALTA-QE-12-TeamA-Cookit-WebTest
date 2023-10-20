package org.example.pageObject.my_purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPurchase {
    public static WebDriver webDriver;

    public MyPurchase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    // My Purchase Object

    @FindBy(xpath = "//div[@class='w-10/12']")
    private WebElement buttonBackToHome;

    @FindBy(xpath = "//button[@class='w-44 col-start-2 bg-primary place-self-end py-1 rounded-md text-white']")
    private WebElement buttonPay;

    @FindBy(xpath = "//span[@class='cursor-pointer']")
    private WebElement buttonCopyVA;

    // My Purhcase Function

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
