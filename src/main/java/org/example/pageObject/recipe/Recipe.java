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

    //CREATE

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

    @FindBy(xpath = "//input[@class='checkbox checkbox-primary rounded-full checkbox-sm']")
    private WebElement checkSellBahan;

    @FindBy(xpath = "//input[@id='price']")
    private WebElement inputPrice;

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

    public void clickCheckSellBahan() {
        checkSellBahan.click();
    }

    public void setInputPrice(String price) {
        inputPrice.sendKeys(price);
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();
    }

    //READ

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement textAreaComment;

    @FindBy(xpath = "//label[@class='btn btn-secondary  w-full sm:w-20 sm:btn-sm flex gap-2']/input[1]")
    private WebElement inputImageComment;

    @FindBy(xpath = "//button[@class='btn btn-primary sm:w-20 w-full sm:btn-sm']")
    private WebElement buttonSubmitComment;

    @FindBy(xpath = "//button[@class='btn btn-secondary w-40 justify-self-end']")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//div[@class='grid grid-cols-2 items-center font-bold']//button[@class='btn rounded-r-lg rounded-l-none text-primary text-2xl']")
    private WebElement buttonIncreaseServing;

    @FindBy(xpath = "//div[@class='grid grid-cols-2 items-center font-bold']//button[@class='btn rounded-l-lg rounded-r-none text-primary text-2xl']")
    private WebElement buttonDecreaseServing;

    @FindBy(xpath = "//div[@class='grid grid-cols-2 items-center font-bold']//button[@class='btn rounded-l-lg rounded-r-none text-primary text-2xl']")
    private WebElement textProfileRecipe;

    @FindBy(xpath = "//button[@class='btn btn-primary sm:w-20 w-full sm:btn-sm']")
    private WebElement textProfile;

    public void setInputTextAreaComment(String text) {
        textAreaComment.sendKeys(text);
    }

    public void setInputImageComment(String pathFile) {
        inputImageComment.sendKeys(pathFile);
    }

    public void clickButtonSubmitComment() {
        buttonSubmitComment.click();
    }

    public void clickButtonAddToCart(){
        buttonAddToCart.click();
    }

    public void clickButtonIncreaseServing(){
        buttonIncreaseServing.click();
    }

    public void clickButtonDecreaseServing(){
        buttonDecreaseServing.click();
    }

    public String getTextProfileRecipe() {
        return textProfileRecipe.getText();
    }

    public String getTextProfile() {
        return textProfile.getText();
    }
}
