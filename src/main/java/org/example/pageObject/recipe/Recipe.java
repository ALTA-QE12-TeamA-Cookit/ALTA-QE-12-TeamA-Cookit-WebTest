package org.example.pageObject.recipe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recipe {
    public static WebDriver webDriver;

    public Recipe (WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[@class='justify-self-start text-2xl']")
    private WebElement buttonBackToHome;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputTitle;

    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement inputDesc;

    @FindBy(xpath = "//input[@id='imageInput']")
    private WebElement inputFileImg;

    @FindBy(xpath = "//div[4]//button[@class='btn btn-circle btn-sm btn-ghost text-2xl text-primary']")
    private WebElement buttonAddBahan;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-circle btn-ghost col-span-1 ']")
    private WebElement buttonRemoveBahan;

    @FindBy(xpath = "//input[@class='input py-2 input-primary col-span-5']")
    private WebElement inputBahan;

    @FindBy(xpath = "//input[@value='0']")
    private WebElement inputQuantity;

    @FindBy(xpath = "//input[3]")
    private WebElement inputSatuan;

    @FindBy(xpath = "//div[5]//button[@class='btn btn-circle btn-sm btn-ghost text-2xl text-primary']")
    private WebElement buttonAddStep;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-circle btn-ghost col-span-1 ']")
    private WebElement buttonRemoveStep;

    @FindBy(xpath = "//textarea[@class='input h-20 py-2 input-primary col-span-11']")
    private WebElement inputStep;

    @FindBy(xpath = "//button[@class='btn btn-primary w-1/2 self-end mt-2']")
    private WebElement buttonSubmit;

    public void clickButtonToHome() {
        buttonBackToHome.click();
    }

    public void setInputTitle(String title) {
        inputTitle.sendKeys(title);
    }

    public void setInputDesc(String desc) {
        inputDesc.sendKeys(desc);
    }

    public void setInputFileImg(String pathFile) {
        inputFileImg.sendKeys(pathFile);
    }

    public void clickButtonAddBahan() {
        buttonAddBahan.click();
    }

    public void clickButtonRemoveBahan() {
        buttonRemoveBahan.click();
    }

    public void setInputBahan(String bahan) {
        inputBahan.sendKeys(bahan);
    }

    public void setInputQuantity(String quantity) {
        inputQuantity.sendKeys(quantity);
    }

    public void setInputSatuan(String satuan) {
        inputSatuan.sendKeys(satuan);
    }

    public void clickButtonAddStep() {
        buttonAddStep.click();
    }

    public void clickButtonRemoveStep() {
        buttonRemoveStep.click();
    }

    public void setInputStep(String step) {
        inputStep.sendKeys(step);
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();
    }

}
