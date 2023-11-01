package app.netlify.cookit.pageObject.edit_profile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage {
    public static WebDriver webDriver;

    public EditProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[@class=' text-primary place-self-end mb-24 text-2xl rounded-full']")
    private WebElement buttonEditProfile;

    @FindBy(xpath = "//button[@class='justify-self-start text-2xl']")
    private WebElement buttonbackToHome;

    @FindBy(css = "[type='text']")
    private WebElement inputUsername;

    @FindBy(xpath = "//textarea[@class='border-r border-l border-t border-b border-1 border-primary outline-none rounded-md px-2 py-1']")
    private WebElement inputBio;

    @FindBy(xpath = "//form[@class='flex flex-col']//div[1]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement inputCurrentPw;

    @FindBy(xpath = "//form[@class='flex flex-col']//div[2]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement inputNewPw;

    @FindBy(xpath = "//form[@class='flex flex-col']//div[3]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement inputConfirmPw;

    @FindBy(xpath = "//button[@class='w-24 lg:w-32 py-1 rounded-md place-self-center bg-secondary text-white']")
    private WebElement buttonSave;

    @FindBy(xpath = "//*[@id=\"skills \"]/div/div/div/button")
    private WebElement buttonRequest;

    @FindBy(xpath = "//input[@id='pict']")
    private WebElement inputFileEditProfile;

    @FindBy(id = "pict")
    private WebElement inputFileProfile;

    public void clickInputFileEditProfile(String pathFile){
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].setAttribute('style', 'visibility:visible'); arguments[0].setAttribute('style', 'display:block');arguments[0].classList.remove(hidden);", inputFileProfile);
        inputFileProfile.sendKeys(pathFile);
    }

    public void clickEditProfileButton(){
        buttonEditProfile.click();
    }

    public void clickButtonBackToHome() {
        buttonbackToHome.click();
    }

    public void setInputUsername(String username) {
        inputUsername.clear();
        inputUsername.sendKeys(username);
    }

    public void setInputBio(String bio) {
        inputBio.clear();
        inputBio.sendKeys(bio);
    }

    public void setInputCurrentPw(String currentPw) {
        inputCurrentPw.clear();
        inputCurrentPw.sendKeys(currentPw);
    }

    public void setInputNewPw(String newPw) {
        inputNewPw.clear();
        inputNewPw.sendKeys(newPw);
    }

    public void setInputConfirmPw(String confirmPw) {
        inputConfirmPw.clear();
        inputConfirmPw.sendKeys(confirmPw);
    }

    public void clickButtonSave() {
        buttonSave.click();
    }

    public void clickButtonRequest() {
        buttonRequest.click();
    }

    public void setInputFileProfile(String pathFile) {
        inputFileProfile.sendKeys(pathFile);
    }
}
