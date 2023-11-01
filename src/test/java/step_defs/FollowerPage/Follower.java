package step_defs.FollowerPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cookit.pageObject.follower.FollowerPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_defs.Hooks;

public class Follower {
    private final WebDriver driver = Hooks.driver;

    FollowerPage followerPage = new FollowerPage(driver);

//    follow another users
    @And("User click on profile menu buttons")
    public void userClickOnProfileMenuButtons() throws InterruptedException {
        Thread.sleep(2000);
        followerPage.clickDropdownProfileMenuBtn();
    }

    @And("User click on followers button in profile page")
    public void userClickOnFollowersButtonInProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        followerPage.clickFollowerBtnProfilePage();
    }
    @When("User click on Followers tab")
    public void userClickOnFollowersTab() throws InterruptedException {
        Thread.sleep(2000);
        followerPage.clickTabFollowerBtnFollowerPage();
    }

    @When("User click on Follow Back button and refresh page")
    public void userClickOnFollowBackButtonAndRefreshPage() throws InterruptedException {
        Thread.sleep(2000);
        followerPage.clickFollowBtn();
    }

    @Then("Follow Back button text should change to {string}")
    public void followBackButtonTextShouldChangeToFriend(String friendText) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(followerPage.verifyTextFriend(), friendText);
        Thread.sleep(1500);
    }

//    unfollow users
    @When("User click on Following tab")
    public void userClickOnFollowingTab() throws InterruptedException {
        Thread.sleep(2000);
        followerPage.clickFollowingTabBtn();
    }

    @Then("User click on Unfollow Back button and refresh page")
    public void userClickOnUnfollowBackButtonAndRefreshPage() throws InterruptedException {
        Thread.sleep(2000);
        followerPage.clickUnfollowUsersBtn();
    }
}
