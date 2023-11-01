package app.netlify.cookit.pageObject.search;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public static WebDriver webDriver;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@placeholder='Search Cookit']")
    private WebElement searchFormMenu;

    @FindBy(xpath = "//button[.='People']")
    private WebElement peopleTabSearchPage;

    @FindBy(xpath = "//p[text()='ayam bakar madu']")
    private WebElement availRecipeName;
    @FindBy(xpath = "//p[text()='kamui123']")
    private WebElement availUserName;

    @FindBy(xpath = "//button[text()='Load More']")
    private WebElement notAvailRecipeNameAndUserName;

//    function action

    public void clickSearchPeopleTab() {
        peopleTabSearchPage.click();
    }

    public void searchInputUserName(String userName) {
        searchFormMenu.sendKeys(userName);
        searchFormMenu.sendKeys(Keys.ENTER);
    }

    public void searchInputRecipesName(String recipesName) {
        searchFormMenu.sendKeys(recipesName);
        searchFormMenu.sendKeys(Keys.ENTER);
    }

    public String verifyRecipeName() {
        return availRecipeName.getText();
    }

    public String verifyUserName() {
        return availUserName.getText();
    }

    public boolean notAvailableSearchResult() {
        return notAvailRecipeNameAndUserName.isDisplayed();
    }

}
