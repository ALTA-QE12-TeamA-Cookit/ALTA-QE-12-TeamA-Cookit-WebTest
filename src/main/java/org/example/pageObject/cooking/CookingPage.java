package org.example.pageObject.cooking;

import org.example.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CookingPage {
    public static WebDriver webDriver;

    public CookingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    //CREATE

    @FindBy(xpath = "//h2[@id='swal2-title']")
    private WebElement sweetAlertText;

    @FindBy(css = ".input")
    private WebElement inputTextPost;

    @FindBy(xpath = "//label[@class='btn btn-secondary  w-full sm:w-20 sm:btn-sm flex gap-2']/input[1]")
    private WebElement inputFileImg;

    @FindBy(xpath = "//button[@class='btn btn-primary sm:w-20 w-full sm:btn-sm']")
    private WebElement buttonCreateSubmit;

    @FindBy(xpath = "//button[.='New Post']")
    private WebElement buttonNewPost;

    @FindBy(xpath = "//a[.='New Cooking']")
    private WebElement buttonNewCooking;

    @FindBy(xpath = "//button[.='Timeline']")
    private WebElement tabTimeline;

    public void setInputTextPost(String text) {
        inputTextPost.sendKeys(text);
    }

    public void setInputFileImg(String pathFile) {
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].setAttribute('style', 'visibility:visible'); arguments[0].setAttribute('style', 'display:block');", inputFileImg);
        inputFileImg.sendKeys(pathFile);
    }

    public void clickTabTimeline() {
        tabTimeline.click();
    }

    public void clickButtonCreateSubmit() {
        buttonCreateSubmit.click();
    }

    public void clickButtonNewPost() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(buttonNewPost)).click();
        buttonNewCooking.click();
    }

    // READ

    @FindBy(xpath = "//button[@class='flex items-center gap-1 hover:text-accent hover:cursor-pointer']")
    private WebElement buttonComment;

    @FindBy(xpath = "//div[@class='flex justify-self-center']/button[.='0']")
    private WebElement buttonLike;

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement inputComment;

    @FindBy(xpath = "//label[@class='btn btn-secondary  w-full sm:w-20 sm:btn-sm flex gap-2']/input[1]")
    private WebElement inputImgComment;

    @FindBy(xpath = "//button[@class='btn btn-primary sm:w-20 w-full sm:btn-sm']")
    private WebElement buttonSubmitComment;

    @FindBy(xpath = "//h1[@class='font-semibold flex']")
    private WebElement resultUsername;

    public void clickButtonLike() {
        buttonLike.click();
    }

    public void setInputComment(String text){
        inputComment.sendKeys(text);
    }

    public void setInputImgComment(String pathFile){
        inputImgComment.sendKeys(pathFile);
    }

    public void clickButtonSubmitComment(){
        buttonSubmitComment.click();
    }

    public void clickButtonComment() {
        buttonComment.click();
    }

    public String getResultUsername(){
        return resultUsername.getText();
    }
}