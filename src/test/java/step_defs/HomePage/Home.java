package step_defs.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.home.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    @And("User click on profile menu button")
    public void userClickOnProfileMenuButton() throws InterruptedException {
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
    public void popUpWithMessageIsShown(String message) {
        WebDriverWait w = new WebDriverWait(driver, 3);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@id='swal2-title']")));
        Assert.assertEquals(homePage.getPopUpTitleAlert(), message);
    }

    @And("User click on Cart icon")
    public void userClickOnCartIcon() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickCartMenu();
    }

    @Then("User already on Cart page")
    public void userAlreadyOnCartPage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateCartPage();
    }

    @When("User click on Timeline photo")
    public void userClickOnTimelinePhoto() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickPostBtnTimelineTab();
    }

    @Then("User already on Timeline page")
    public void userAlreadyOnTimelinePage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.verifyPostPageTimelineTab();
    }

    @And("User click on new post button")
    public void userClickOnNewPostButton() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickNewPostBtn();
    }

    @When("User click on new cooking button")
    public void userClickOnNewCookingButton() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickNewCookingMenuBtn();
    }

    @Then("User already on new cooking page")
    public void userAlreadyOnNewCookingPage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateNewCookingPage();
    }

    @When("User click on new recipe button")
    public void userClickOnNewRecipeButton() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickNewRecipesMenuBtn();
    }

    @Then("User already on new recipe page")
    public void userAlreadyOnNewRecipePage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateNewRecipesPage();
    }

    @And("User click like icon")
    public void userClickLikeIcon() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickLikePostTimelineTab();
    }

    @Then("The number of likes changes")
    public void theNumberOfLikesChanges() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateShowLike();
    }

    @And("User click comment icon")
    public void userClickCommentIcon() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickCommentBtnTimelineTab();
    }

    @Then("User redirected to make comments page")
    public void userRedirectedToMakeCommentsPage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validataNewCommentPage();
    }

    @And("User click three dots icon")
    public void userClickThreeDotsIcon() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickThreeDotsBtnTimelineTab();
    }

    @And("User click reply icon")
    public void userClickReplyIcon() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickReplyBtnTimelineTab();
    }

    @Then("User redirected to make reply page")
    public void userRedirectedToMakeReplyPage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateReplyPageTimelineTab();
    }

    @And("User click like icon recipes tab")
    public void userClickLikeIconRecipesTab() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickLikeRecipeRecipeTab();
    }

    @Then("The number of likes changes recipes tab")
    public void theNumberOfLikesChangesRecipesTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateShowLikeRecipeRecipeTab();
    }

    @And("User click comment icon recipes tab")
    public void userClickCommentIconRecipesTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickCommentRecipeTab();
    }

    @Then("User redirected to make comments page recipes tab")
    public void userRedirectedToMakeCommentsPageRecipesTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateCommentRecipePage();
    }

    @And("User click three dots icon recipe tab")
    public void userClickThreeDotsIconRecipeTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickThreeDotsRecipeTab();
    }

    @And("User click reply icon recipe page")
    public void userClickReplyIconRecipePage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickReplyRecipeTabBtn();
    }

    @Then("User redirected to make reply recipe page")
    public void userRedirectedToMakeReplyRecipePage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateReplyPageRecipeTab();
    }

    @And("User click recook icon recipe tab")
    public void userClickRecookIconRecipeTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickRecookRecipeTabBtn();
    }

    @Then("User redirected to make recook page recipe tab")
    public void userRedirectedToMakeRecookPageRecipeTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validateRecookPageRecipeTab();
    }
}
