package org.example.pageObject.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {
    public static WebDriver webDriver;

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath ="//h1[@class='text-2xl 2xl:text-3xl font-bold text-orange-500']")
    private WebElement titleLandingPage;

    @FindBy(xpath = "//button[@class='lg:w-32 px-4 py-2 lg:py-3 text-orange-500 bg-white border2 md:font-bold 2xl:font-bold 2xl:text-xl rounded-md text-center']")
    private WebElement signInButton;

    @FindBy(xpath = "//h1[@class='font-bold text-3xl']")
    private WebElement loginPage;

    @FindBy(xpath = "//span[@class='font-semibold cursor-pointer']")
    private  WebElement signUpButton;

    @FindBy(xpath = "//form[@class='sm:w-72 lg:px-10 md:w-2/3 lg:w-72 px-5 pb-8 text-center flex flex-col items-center  ']//div[1]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement usernameField;

    @FindBy(xpath = "//form[@class='sm:w-72 lg:px-10 md:w-2/3 lg:w-72 px-5 pb-8 text-center flex flex-col items-center  ']//div[2]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement emailField;

    @FindBy(xpath = "//form[@class='sm:w-72 lg:px-10 md:w-2/3 lg:w-72 px-5 pb-8 text-center flex flex-col items-center  ']//div[3]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@class='w-full md:w-96 lg:w-full h-8 my-5 rounded-lg text-white font-semibold bg-orange-500']")
    private WebElement signUpButtonOnSignUpPage;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement successSignUp;

    @FindBy(xpath = "//div[@class='block alert alert-error shadow-lg']//span[.='Please input your email, username and password..']")
    private WebElement registeredEmailSignUp;

    @FindBy(xpath = "//p[contains(.,'At least 8 characters with no space')]")
    private WebElement requirement1PasswordGreenSignUp;

    @FindBy(css = "div.px-2 > p:nth-of-type(1)")
    private WebElement requirement1PasswordBlackSignUp;


    public boolean verifyLandingPageDisplayed(){
        return titleLandingPage.isDisplayed();
    }

    public void clickSignInButton(){
        signInButton.click();
    }

    public boolean verifyLoginPageDisplayed(){
        return loginPage.isDisplayed();
    }

    public void clickSignUpButton(){
        signUpButton.click();
    }

    public void inputUsername( String username){
        usernameField.sendKeys(username);
    }
    public void inputEmail( String email){
        emailField.sendKeys(email);
    }

    public void inputPassword( String password){
        passwordField.sendKeys(password);
    }

    public void clickButtonSignUpOnSignUpPage(){
        signUpButtonOnSignUpPage.click();
    }

    public boolean verifyPopUpSignUpPage(){
        return successSignUp.isDisplayed();
    }

    public String errorRegisteredSignUp(){
        return registeredEmailSignUp.getText();
    }

    public String verifyRequirement1blackSignUp(){
        return requirement1PasswordGreenSignUp.getText();}

    public String verifyRequirement1greenSignUp(){return requirement1PasswordBlackSignUp.getText();}


}