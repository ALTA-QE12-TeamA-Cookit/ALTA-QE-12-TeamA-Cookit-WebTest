package step_defs.LogOut;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import app.netlify.cookit.pageObject.logout.LogoutButton;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_defs.Hooks;

public class Logout {
    private final WebDriver driver = Hooks.driver;

    LogoutButton logoutButton = new LogoutButton(driver);

    @Given("User already on Cookit page")
    public void userAlreadyOnCookitLandingPage() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(logoutButton.verifyLandingPageTitle());
    }

    @When("User click on Sign In button")
    public void userClickSignInButton() {
        logoutButton.clickButtonLanding();
    }

    @And("User input {string} as username and {string} as password")
    public void userInputUsername(String username, String password) {
        logoutButton.setInputUsername(username);
        logoutButton.setInputPassword(password);
    }


    @And("User click login button")
    public void clickLogInButton() {
        logoutButton.clickButtonLogin();
    }



    @And("User click on profile menu")
    public void userClickOnProfileMenu() throws InterruptedException{
        Thread.sleep(5000);
        logoutButton.clickProfileMenu();
    }

    @When("User click logout")
    public void userClickLogout() {
        logoutButton.clikLogoutButton();
    }


    @And("Verify logout pop up is displayed")
    public void verifyLoginTextIsDisplayed() {
        Assert.assertTrue(logoutButton.verifyTextOutDisplayed());
    }


    @And("User click yes")
    public void userClickYes() {
        logoutButton.clickYesButton();
    }


    @Then("user back to login page")
    public void userBackToLoginPage() throws InterruptedException{
        Thread.sleep(4000);
        Assert.assertTrue(logoutButton.verifyLoginPage());
    }
}