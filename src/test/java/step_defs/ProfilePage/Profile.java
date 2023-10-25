package step_defs.ProfilePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.profile.ProfilePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_defs.Hooks;
import org.openqa.selenium.JavascriptExecutor;

public class Profile {

    private final WebDriver driver = Hooks.driver;

    ProfilePage profilePage = new ProfilePage(driver);

    @And("User click on Profile menu")
    public void userClickOnProfileMenu() throws InterruptedException {
        Thread.sleep(3000);
        profilePage.clickProfileSidebar();
    }

    @And("User click on Profile list menu")
    public void userClickOnProfileListMenu() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickLinkProfile();
    }

    @When("User click first button more on new cooking post")
    public void userClickFirstButtonMoreOnNewCookingPost() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickButtonMore();
    }

    @And("User click Delete Post")
    public void userClickDeletePost() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickButtonDelete();
        Thread.sleep(2000);
        profilePage.clickButtonConfirmDelete();
    }

    @Then("pop-up message should return {string}")
    public void popUpMessageShouldReturn(String expected) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(profilePage.getTitleAlert(), expected);
    }

    @And("User click like icon on profile page")
    public void userClickLikeIconOnProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickButtonLike();
    }

    @Then("Verify like value is {string}")
    public void verifyLikeValueIs(String like) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(profilePage.getLikeCountOnProfilePage(), like);
        Thread.sleep(2000);
    }

    @And("User click comment on profile page")
    public void userClickCommentOnProfilePage() throws InterruptedException {
        Thread.sleep(3000);
        profilePage.clickButtonComment();
    }

    @Then("Verify user already on cooking page")
    public void verifyUserAlreadyOnCookingPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(profilePage.getTextPostCategory(), "Recipe");
    }

    @And("User click more button on profile page")
    public void userClickMoreButtonOnProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickButtonMore();
    }

    @And("User click recook icon on profile page")
    public void userClickRecookIconOnProfilePage() throws InterruptedException {
        profilePage.clickButtonRecook();
        Thread.sleep(2000);
    }

    @When("User click submit button on recook page")
    public void userClickSubmitButtonOnRecookPage() {
        profilePage.clickButtonSubmitOnRecookPage();
    }

    @When("User click on profile from recooked")
    public void userClickOnProfileFromRecooked() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickImgProfileOnProfilePage();
    }

    @Then("Verify between username on recooked and on username profile")
    public void verifyBetweenUsernameOnRecookedAndOnUsernameProfile() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(profilePage.getTextUsernameOnProfilePage(), "test5");
    }

    @When("User click add to cart on profile page")
    public void userClickAddToCartOnProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickButtonAddToCart();
    }

    @And("User click first profile on timeline")
    public void userClickFirstProfileOnTimeline() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickImgFirstProfileOnTimeline();
    }

    @And("User click follow button on that profile")
    public void userClickFollowButtonOnThatProfile() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickButtonFollow();
    }

    @Then("pop-up swal body should return message with {string}")
    public void popUpSwalBodyShouldReturnMessageWith(String text) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(profilePage.getSweetAlertBodyText(), text);
    }

    @And("User click following tab")
    public void userClickFollowingTab() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickTabFollowing();
    }

    @And("User click unfollow button")
    public void userClickUnfollowButton() throws InterruptedException {
        Thread.sleep(2000);
        profilePage.clickButtonUnfollow();
    }

    @And("Verify button name is Unfollow")
    public void verifyButtonNameIsUnfollow() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(profilePage.getTextButtonFollow(), "Unfollow");
    }
}
