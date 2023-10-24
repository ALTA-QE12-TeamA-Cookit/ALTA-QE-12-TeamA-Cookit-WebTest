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
}
