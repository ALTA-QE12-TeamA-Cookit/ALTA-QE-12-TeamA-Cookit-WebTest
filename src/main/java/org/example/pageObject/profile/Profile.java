package org.example.pageObject.profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {

    public static WebDriver webDriver;

    public Profile(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//h2[@id='swal2-title']")
    private WebElement SweetAlertTitle;

    @FindBy(xpath = "//button[@class='justify-self-start text-2xl']")
    private WebElement buttonBackToHome;

    //Following & Follower Object

    @FindBy(xpath = "//p[.='0 Followers']")
    private WebElement buttonFollower;

    @FindBy(xpath = "//p[.='1 Following']")
    private WebElement buttonFollowing;

    //General Object

    @FindBy(xpath = "//button[@class='flex items-center gap-1 hover:text-accent hover:cursor-pointer']")
    private  WebElement buttonComment;

    @FindBy(xpath = "//div[@class='flex justify-self-center']/button[.='0']")
    private WebElement buttonLike;

    @FindBy(xpath = "//label[@class='flex items-center gap-1 hover:text-accent hover:cursor-pointer']")
    private WebElement buttonMore;

    @FindBy(xpath = "//li[@class='text-error block']")
    private WebElement buttonDelete;

    @FindBy(xpath = "//li[@class='block']")
    private WebElement buttonRecook;

    @FindBy(xpath = "//p[@class='font-light text-neutral-500']")
    private WebElement textPostCategory;

    //Recipe Object

    @FindBy(xpath = "//div[@class='w-10/12']")
    private WebElement openRecipeElement;

    @FindBy(xpath = "//div[@class='flex justify-between items-center']/button[1]")
    private WebElement buttonAddToCart;

    //Another Profile

    @FindBy(xpath = "//button[@class=' btn-primary place-self-end mb-24 w-fit px-7 py-1 rounded-full']")
    private WebElement buttonFollow;

    @FindBy(xpath = "//h1[@class='font-bold col-span-2 text-xl md:text-xl flex']")
    private WebElement anotherUsername;
}
