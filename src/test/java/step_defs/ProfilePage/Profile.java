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
        WebElement tmp =driver.findElement(By.xpath("//div[@class='hidden dropdown dropdown-bottom sm:block ']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', 'visibility:visible'); arguments[0].click();", tmp);
        tmp.click();
    }

    @And("User click on Profile list menu")
    public void userClickOnProfileListMenu() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ul = driver.findElement(By.xpath("//ul[@class='dropdown-content md:text-sm menu p-2 text-black shadow-lg bg-base-100 rounded-box w-52']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', 'visibility:visible'); arguments[0].click();", ul);
        ul.click();

        Thread.sleep(1000);
        WebElement li = driver.findElement(By.cssSelector(".text-black > li:nth-of-type(1)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', 'visibility:visible'); arguments[0].click();", li);
        li.click();
    }

    @When("User click first button more on new cooking post")
    public void userClickFirstButtonMoreOnNewCookingPost() {
        profilePage.clickButtonMore();
    }

    @And("User click Delete Post")
    public void userClickDeletePost() {
        profilePage.clickButtonDelete();
        profilePage.clickButtonConfirmDelete();
    }

    @Then("pop-up message should return {string}")
    public void popUpMessageShouldReturn(String expected) {
        Assert.assertEquals(profilePage.getTitleAlert(), expected);
    }
}
