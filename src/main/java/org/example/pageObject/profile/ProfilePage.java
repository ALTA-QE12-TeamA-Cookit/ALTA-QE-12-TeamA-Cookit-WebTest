package org.example.pageObject.profile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public static WebDriver webDriver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//h2[@id='swal2-title']")
    private WebElement sweetAlertTitle;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement sweetAlertBody;

    @FindBy(xpath = "//button[@class='justify-self-start text-2xl']")
    private WebElement buttonBackToHome;

    //SIDEBAR ACCESS

    @FindBy(xpath = "//div[@id='root']/div/div/div[12]/div/div/label/p")
    private WebElement sidebarProfile;

    @FindBy(xpath = "//div[@id='root']/div/div/div[12]/div/div/ul/li/a")
    private WebElement linkProfile;

    //Following & Follower Object

    @FindBy(css = ".grid-cols-2 > p:nth-of-type(1)")
    private WebElement tabFollower;

    @FindBy(css = ".grid-cols-2 > p:nth-of-type(2)")
    private WebElement tabFollowing;

    //General Object

    @FindBy(css = ".max-w-xl > div:nth-of-type(3) .justify-self-start > .flex")
    private  WebElement buttonComment;

    @FindBy(xpath = "//div[@class='flex justify-self-center']/button[.='0']")
    private WebElement buttonLike;

    @FindBy(xpath = "//button[.='1']")
    private WebElement buttonLikeAfter;

    @FindBy(xpath = "//label[@class='flex items-center gap-1 hover:text-accent hover:cursor-pointer']")
    private WebElement buttonMore;

    @FindBy(xpath = "//li[@class='text-error block']")
    private WebElement buttonDelete;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement buttonConfirmDelete;

    @FindBy(css = ".max-w-xl > div:nth-of-type(3) label")
    private WebElement buttonMoreOnAnotherProfile;

    @FindBy(xpath = "//li[@class='block']")
    private WebElement buttonRecook;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement textPostCategory;

    //Recipe Object

    @FindBy(xpath = "//div[@class='w-10/12']")
    private WebElement openRecipeElement;

    @FindBy(css = ".max-w-xl > div:nth-of-type(3) > div > .flex > button")
    private WebElement buttonAddToCart;

    //Another Profile Object

    @FindBy(xpath = "//button[@class=' btn-primary place-self-end mb-24 w-fit px-7 py-1 rounded-full']")
    private WebElement buttonFollow;

    @FindBy(xpath = "//h1[@class='font-bold col-span-2 text-xl md:text-xl flex']")
    private WebElement anotherUsername;



    @FindBy(xpath = "//button[@class='btn btn-primary w-1/2 self-end mt-2']")
    private WebElement buttonSubmitOnRecookPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div[2]/div/div[1]/div[1]")
    private WebElement imgProfileOnProfilePage;

    @FindBy(xpath = "//h1[@class='font-bold col-span-2 text-xl md:text-xl flex']")
    private WebElement textUsernameOnProfilePage;

    @FindBy(css = ".max-w-xl > div:nth-of-type(2) .h-0")
    private WebElement imgFirstProfileOnTimeline;

    @FindBy(css = ".px-2 > div:nth-of-type(1) > .place-self-end")
    private WebElement buttonUnfollow;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement textHeaderOnRecipePage;

    //Function

    public boolean getTextHeaderOnRecipePage(){
        return textHeaderOnRecipePage.isDisplayed();
    }

    public void clickButtonMoreOnProfile() {
        buttonMoreOnAnotherProfile.click();
    }

    public String getTextButtonFollow(){
        return buttonFollow.getText();
    }

    public void clickButtonUnfollow(){
        buttonUnfollow.click();
    }

    public String getSweetAlertBodyText(){
        return sweetAlertBody.getText();
    }

    public void clickImgFirstProfileOnTimeline(){
        imgFirstProfileOnTimeline.click();
    }

    public String getTextUsernameOnProfilePage(){
        return textUsernameOnProfilePage.getText();
    }

    public void clickImgProfileOnProfilePage(){
        imgProfileOnProfilePage.click();
    }

    public void clickButtonSubmitOnRecookPage(){
        buttonSubmitOnRecookPage.click();
    }

    public String getTitleAlert() {
        return sweetAlertTitle.getText();
    }

    public void clickButtonBackToHome() {
        buttonBackToHome.click();
    }

    //SIDEBAR ACCESS

    public void clickProfileSidebar() {
        sidebarProfile.click();
    }

    public void clickLinkProfile() {
        linkProfile.click();
    }

    //Following & Follower Function

    public void clickTabFollower() {
        tabFollower.click();
    }

    public void clickTabFollowing() {
        tabFollowing.click();
    }

    //General Function

    public void clickButtonComment() {
        buttonComment.click();
    }

    public void clickButtonLike() {
        buttonLike.click();
    }

    public void clickButtonMore() {
        buttonMore.click();
    }

    public void clickButtonDelete() {
        buttonDelete.click();
    }

    public void clickButtonConfirmDelete() {
        buttonConfirmDelete.click();
    }

    public void clickButtonRecook() {
        buttonRecook.click();
    }

    public String getTextPostCategory(){
        return textPostCategory.getText();
    }

    public String getLikeCountOnProfilePage(){
        return buttonLikeAfter.getText();
    }

    //Recipe Function

    public void clickOpenRecipeElement() {
        openRecipeElement.click();
    }

    public void clickButtonAddToCart () {
        buttonAddToCart.click();
    }

    //Another Profile Function

    public void clickButtonFollow() {
        buttonFollow.click();
    }

    public String getAnotherUsername() {
        return anotherUsername.getText();
    }
}
