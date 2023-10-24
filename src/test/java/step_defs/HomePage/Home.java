package step_defs.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.home.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_defs.Hooks;

public class Home {

    private final WebDriver driver = Hooks.driver;

    HomePage homePage = new HomePage(driver);

//    Timeline Tab

    @When("User click on Timeline tab")
    public void userClickOnTimelineTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickTimelineBtn();
    }

    @Then("User already on Timeline tab")
    public void userAlreadyOnTimelineTab() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(homePage.validateTimelineTabTittle());
    }

//    Recipes tab
    @When("User click on Recipes tab")
    public void userClickOnRecipesTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickRecipeTabBtn();
    }

    @Then("User already on Recipes tab")
    public void userAlreadyOnRecipesTab() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(homePage.validaRecipeTabTitle());
    }
}
