package step_defs.SearchPage;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.search.SearchPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_defs.Hooks;

public class Search {
    private final WebDriver driver = Hooks.driver;

    SearchPage searchPage = new SearchPage(driver);

    @And("User input {string} on search box")
    public void userInputOnSearchBox(String recipeName) throws InterruptedException {
        searchPage.searchInputRecipesName(recipeName);
        Thread.sleep(2000);
    }

    @Then("Recipes contains word {string} has shown")
    public void recipesContainsWordHasShown(String recipeName) throws InterruptedException {
        Assert.assertTrue(searchPage.verifyRecipeName().contains(recipeName));
        Thread.sleep(2000);
    }

    @And("User click on search people tab")
    public void userClickOnSearchPeopleTab() throws InterruptedException {
        Thread.sleep(1000);
        searchPage.clickSearchPeopleTab();
        Thread.sleep(500);
    }

    @And("User input {string} on people search box")
    public void userInputOnPeopleSearchBox(String peopleName) throws InterruptedException {
        Thread.sleep(1000);
        searchPage.searchInputUserName(peopleName);
        Thread.sleep(500);
    }

    @Then("People contains word {string} has shown")
    public void peopleContainsWordHasShown(String peopleName) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(searchPage.verifyUserName().contains(peopleName));
    }

    @Then("Recipes contains word kerupuk not shown")
    public void recipesContainsWordNotShown() throws InterruptedException {
        Assert.assertTrue(searchPage.notAvailableSearchResult());
        Thread.sleep(2000);
    }

    @Then("People contains word jamal not shown")
    public void peopleContainsWordJamalNotShown() throws InterruptedException {
        Assert.assertTrue(searchPage.notAvailableSearchResult());
        Thread.sleep(2000);
    }
}
