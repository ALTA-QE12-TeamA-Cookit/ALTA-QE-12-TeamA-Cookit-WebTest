package org.example.pageObject.profile.edit_profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile {
    public static WebDriver webDriver;

    public EditProfile(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[@class='justify-self-start text-2xl']")
    private WebElement backToHome;

    @FindBy(xpath = "//input[@class='border-r border-l border-t border-b border-1 border-primary outline-none rounded-md px-2 py-1']")
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

    @FindBy(xpath = "//button[@class='w-24 lg:w-32 py-1 rounded-md place-self-center bg-secondary text-white']")
    private WebElement buttonRequest;

    @FindBy(id = "pict")
    private WebElement inputFileProfile;
}
