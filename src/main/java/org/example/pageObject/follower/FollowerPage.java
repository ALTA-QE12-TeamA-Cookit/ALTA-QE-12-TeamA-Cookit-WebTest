package org.example.pageObject.follower;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowerPage {

    public static WebDriver webDriver;

    public FollowerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

//    Page object

//    followers

    @FindBy(xpath = "(//a[contains(.,'Profile')])[2]")
    private WebElement dropdownProfileMenuBtn;
    @FindBy(xpath = "//p[.='1 Followers']")
    private WebElement followerBtnProfilePage;

    @FindBy(xpath = "//p[contains(.,'Followers')]")
    private WebElement FollowersTabBtnFollowesPage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    private WebElement followBtn;

    @FindBy(xpath = "//button[contains(.,'Friend')]")
    private WebElement friendText;

//    ===================================================================================

//    Function action

//    followes

    public void clickDropdownProfileMenuBtn() {
        dropdownProfileMenuBtn.click();
    }

    public void clickFollowerBtnProfilePage() {
        followerBtnProfilePage.click();
    }

    public void  clickTabFollowerBtnFollowerPage() {

    }

    public void clickFollowBtn() {
        followBtn.click();
        followBtn.sendKeys(Keys.F5);
    }

    public String verifyTextFriend() {
        return friendText.getText();
    }

}
