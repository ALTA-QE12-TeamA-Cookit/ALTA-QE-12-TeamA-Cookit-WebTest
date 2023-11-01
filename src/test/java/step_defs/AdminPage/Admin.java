package step_defs.AdminPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import app.netlify.cookit.pageObject.admin.AdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_defs.Hooks;

public class Admin {

    private final WebDriver driver = Hooks.driver;

    AdminPage adminPage = new AdminPage(driver);


    @Then("Admin already on Home Page")
    public void adminAlreadyOnHomePage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(adminPage.validateHomepageAdmin());
    }

    @When("Admin click on Profile menu")
    public void adminClickOnProfileMenu() throws InterruptedException {
        Thread.sleep(2000);
        adminPage.clickIconProfileBtn();
    }

    @And("Admin click on verify users menu")
    public void adminClickOnVerifyUsersMenu() throws InterruptedException {
        Thread.sleep(2000);
        adminPage.clickDropDownMenuBtn();
    }

    @And("Admin already on Verify Users page")
    public void adminAlreadyOnVerifyUsersPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(adminPage.validateVerifyUserPage());
    }

    @Then("Admin click checklist button on selected user")
    public void adminClickChecklistButtonOnSelectedUser() throws InterruptedException {
        Thread.sleep(2000);
        adminPage.clickChecklistVerifyUserBtn();
        Thread.sleep(1500);
    }
}
