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

    @FindBy(xpath = "//a[@href='/search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//div[@class='flex justify-between items-center']/button[1]")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//div[@class='indicator']")
    private WebElement cartBtn;

    @FindBy(xpath = "//input[@placeholder='Search Cookit']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p[@class='font-light text-neutral-500']")
    private WebElement timelineTitle;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p[@class='font-light text-neutral-500']")
    private WebElement recipeTabTitle;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement cartPageTitle;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p[@class='font-semibold text-primary hover:text-accent hover:cursor-pointer']")
    private WebElement recipeName;

    @FindBy(xpath = "//a[.='New Cooking']")
    private WebElement postNewCookingBtn;

    @FindBy(xpath = "//a[.='New Recipe']")
    private WebElement postNewRecipeBtn;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement recipeHeader;

    @FindBy(xpath = "//p[.='New Post']")
    private WebElement newPostBtn;

    @FindBy(xpath = "")
    private WebElement likeBtn;

    @FindBy(xpath = "")
    private WebElement commentBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div[4]/div[3]")
    private WebElement threeDotsBtn;

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

    public String getRecipeName() {
        return recipeName.getText();
    }

    public boolean getRecipeNameHeader() {
        return recipeHeader.isDisplayed();
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public boolean validateSearchBtn() {
        return searchField.isDisplayed();
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

    public void clickThreeDotsBtn() {
        threeDotsBtn.click();
    }
}
