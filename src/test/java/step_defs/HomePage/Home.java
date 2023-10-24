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

    @When("User click on Recipes name")
    public void userClickOnRecipesName() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickRecipeName();
        Thread.sleep(2000);
    }

    @Then("User already on Recipes page")
    public void userAlreadyOnRecipesPage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.getRecipeNameHeader();
        Thread.sleep(2000);
    }

    @And("User click on Search icon")
    public void userClickOnSearchIcon() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickSearchBtn();
        Thread.sleep(1000);
    }

    @Then("User already on Search page")
    public void userAlreadyOnSearchPage() throws InterruptedException {
        Thread.sleep(1000);
        homePage.validateSearchPage();
    }

    @And("User click on profile icon")
    public void userClickOnProfileIcon() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickProfileBtn();
        Thread.sleep(2000);
    }

    @And("User click on prifile menu button")
    public void userClickOnPrifileMenuButton() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickProfileMenuBtn();
        Thread.sleep(2000);
    }

    @Then("User already on profile page")
    public void userAlreadyOnProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateProfilePage();
        Thread.sleep(2000);
    }

    @And("User click add to cart icon button on home page")
    public void userClickAddToCartIconButtonOnHomePage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.addToCartBtn();
        Thread.sleep(2000);
    }

    @Then("pop up with message {string} is shown")
    public void popUpWithMessageIsShown(String arg0) {
    }
}
