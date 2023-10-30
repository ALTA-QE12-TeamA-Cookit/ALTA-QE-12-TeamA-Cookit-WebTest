package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
    public static WebDriver webDriver;

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }



    @FindBy(xpath = "//h2[@id='swal2-title']")
    private WebElement sweetAlertTitle;

    @FindBy(xpath = "//h1[@class='text-2xl 2xl:text-3xl font-bold text-orange-500']")
    private WebElement landingPageTitle;

    @FindBy(xpath = "//button[@class='lg:w-32 px-4 py-2 lg:py-3 text-orange-500 bg-white border2 md:font-bold 2xl:font-bold 2xl:text-xl rounded-md text-center']")
    private WebElement buttonLanding;

    @FindBy(xpath = "//form[@class='sm:w-72 md:w-2/3 lg:px-10 lg:w-72 px-5 pb-8 text-center flex flex-col items-center border-b-2 border-gray-300  ']//div[1]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private  WebElement inputUsername;

    @FindBy(xpath = "//form[@class='sm:w-72 md:w-2/3 lg:px-10 lg:w-72 px-5 pb-8 text-center flex flex-col items-center border-b-2 border-gray-300  ']//div[2]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@class='w-full md:w-96 lg:w-full h-8 my-5 rounded-lg text-white font-semibold bg-orange-500']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//div[@class='block alert alert-error shadow-lg']")
    private WebElement alertInvalidInput;

    public boolean verifyLandingPageTitle() {
        return landingPageTitle.isDisplayed();
    }

    public String getSweetAlert() {
        return sweetAlertTitle.getText();
    }

    public void clickButtonLanding() {
        buttonLanding.click();
    }

    public void setInputUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }

    public boolean alertDisplayed(){
        return alertInvalidInput.isDisplayed();
    }


}
