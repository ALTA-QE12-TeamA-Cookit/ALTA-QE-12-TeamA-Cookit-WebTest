package org.example.pageObject.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public static WebDriver webDriver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

//    Web Element
    @FindBy(xpath = "//button[.='Timeline']")
    private WebElement timeLineTabBtn;

    @FindBy(xpath = "//button[.='Recipes']")
    private WebElement recipeTabBtn;

    @FindBy(xpath = "//p[.='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/button")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[12]/div/a[3]/p")
    private WebElement cartBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[1]/div/form/input")
    private WebElement searchPage;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p[@class='font-light text-neutral-500']")
    private WebElement timelineTitle;

    @FindBy(xpath = "//button[@class='border-b-4 py-2 border-secondary font-semibold']")
    private WebElement recipeTabTitle;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement cartPageTitle;

    @FindBy(xpath = "//p[.='Ayam bakar goreng']")
    private WebElement recipeName;

    @FindBy(xpath = "//a[.='New Cooking']")
    private WebElement postNewCookingBtn;

    @FindBy(xpath = "//a[.='New Recipe']")
    private WebElement postNewRecipeBtn;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement recipeHeader;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[12]/div/button[2]/p")
    private WebElement newPostBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[12]/div[3]/a[1]")
    private WebElement newCookingBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/button[2]")
    private WebElement newCookingPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[12]/div[3]/a[2]")
    private WebElement newRecipesBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/button[2]")
    private WebElement newRecipesPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[2]/button")
    private WebElement likeBtnTimelineTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[2]")
    private WebElement showLikeTimelineTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[1]/button")
    private WebElement commentBtnTimelineTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/h3")
    private WebElement showNewCommentPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[12]/div/div/label/div/div/div/img")
    private WebElement profileBtn;

    @FindBy(xpath = "//ul[@class='dropdown-content md:text-sm menu p-2 text-black shadow-lg bg-base-100 rounded-box w-52']//a[.='Profile']")
    private WebElement profileMenuBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/button[2]")
    private WebElement profilePage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[3]/label")
    private WebElement threeDotsBtn;

    @FindBy(xpath = "//p[.='Reply']")
    private WebElement replyMenuBtnTimelineTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/button[2]")
    private WebElement replyPageTimelineTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/button[2]")
    private WebElement likeRecipeBtnRecipeTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/button[2]")
    private WebElement likeRecipeShownRecipeTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[1]/button")
    private WebElement commentRecipe;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/button[2]")
    private WebElement commentRecipesPage;

//    Function Action

    public void clickTimelineBtn() {
        timeLineTabBtn.click();
    }

    public void clickRecipeTabBtn() {
        recipeTabBtn.click();
    }

    public boolean validateTimelineTabTittle() {
        return timelineTitle.isDisplayed();
    }

    public void clickRecipeName() {
        recipeName.click();
    }

    public boolean validaRecipeTabTitle() {
        return recipeTabTitle.isDisplayed();
    }

    public boolean getRecipeNameHeader() {
        return recipeHeader.isDisplayed();
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public boolean validateSearchPage() {
        return searchPage.isDisplayed();
    }

    public void addToCartBtn() {
        addToCartBtn.click();
    }

    public void clickCartMenu() {
        cartBtn.click();
    }

    public boolean validateCartPage() {
        return cartPageTitle.isDisplayed();
    }

    public void clickNewPostBtn() {
        newPostBtn.click();
    }

    public void clickThreeDotsBtnTimelineTab() {
        threeDotsBtn.click();
    }

    public void clickReplyBtnTimelineTab() {
        replyMenuBtnTimelineTab.click();
    }

    public boolean validateReplyPageTimelineTab() {
        return replyPageTimelineTab.isDisplayed();
    }

    public void clickProfileBtn() {
        profileBtn.click();
    }

    public void clickProfileMenuBtn() {
        profileMenuBtn.click();
    }

    public boolean validateProfilePage() {
        return profilePage.isDisplayed();
    }

    public void clickNewCookingMenuBtn() {
        newCookingBtn.click();
    }

    public  boolean validateNewCookingPage() {
        return newCookingPage.isDisplayed();
    }

    public void clickNewRecipesMenuBtn() {
        newRecipesBtn.click();
    }

    public  boolean validateNewRecipesPage() {
        return newRecipesPage.isDisplayed();
    }

    public void clickLikePostTimelineTab() {
        likeBtnTimelineTab.click();
    }

    public  boolean validateShowLike() {
        return showLikeTimelineTab.isDisplayed();
    }

    public void clickCommentBtnTimelineTab() {
        commentBtnTimelineTab.click();
    }

    public boolean validataNewCommentPage() {
        return showNewCommentPage.isDisplayed();
    }

    public void clickLikeRecipeRecipeTab() {
        likeBtnTimelineTab.click();
    }

    public boolean validateShowLikeRecipeRecipeTab() {
        return showLikeTimelineTab.isDisplayed();
    }

    public void clickCommentRecipeTab() {
        commentRecipe.click();
    }

    public boolean validateCommentRecipePage() {
        return commentRecipesPage.isDisplayed();
    }
}
