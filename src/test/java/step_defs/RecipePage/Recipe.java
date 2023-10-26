package step_defs.RecipePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.recipe.RecipePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_defs.Hooks;

import java.util.TreeMap;

public class Recipe {

    private final WebDriver driver = Hooks.driver;

    RecipePage recipePage = new RecipePage(driver);

    @When("User click new recipe button")
    public void userClickNewRecipeButton() throws InterruptedException {
        Thread.sleep(2000);
        recipePage.clickButtonNewPost();
        Thread.sleep(2000);
        recipePage.clickButtonNewRecipe();
    }


    @And("user input recipe title with {string}")
    public void userInputRecipeTitleWith(String title) throws InterruptedException {
        Thread.sleep(2000);
        recipePage.setInputTitle(title);
    }

    @And("user input description with {string}")
    public void userInputDescriptionWith(String description) {
        recipePage.setInputDesc(description);
    }

    @And("user input image with {string}")
    public void userInputImageWith(String pathFile) {
        recipePage.setInputFileImg(pathFile);
    }

    @And("user input ingridient name with {string}")
    public void userInputIngridientNameAWith(String ingredientA) {
        recipePage.setInputBahan(ingredientA);
    }

    @And("user input quantity with {string}")
    public void userInputQuantityAWith(String quantity) {   //////////CobaCOACOAIBFDCAIOSSBHDF
        recipePage.setInputQuantity(quantity);
    }

    @And("user input unit with {string}")
    public void userInputUnitAWith(String unit) {
        recipePage.setInputUnit(unit);
    }

    @And("user click add button on ingridient section")
    public void userClickAddButtonOnIngridientSection() {
        recipePage.clickButtonAddBahan();
    }

    @And("user click remove button on ingridient section")
    public void userClickRemoveButtonXOnIngridientSection() {
        recipePage.clickButtonRemoveBahan();
    }

    @And("user input on step field with {string}")
    public void userInputOnStepAFieldWith(String step) {
        recipePage.setInputStep(step);
    }

    @And("user click add button on direction section")
    public void userClickAddButtonOnDirectionSection() {
        recipePage.clickButtonAddStep();
    }

    @And("user click remove button on direction section")
    public void userClickRemoveButtonXOnDirectionSection() {
        recipePage.clickButtonRemoveStep();
    }

    @And("user click checklist sell ingredient")
    public void userClickChecklistSellIngredient() {
        recipePage.clickCheckSellBahan();
    }

    @And("user input on field price with {string}")
    public void userInputOnFieldPriceWith(String price) throws InterruptedException {
        recipePage.setInputPrice(price);
    }

    @And("user click submit")
    public void userClickSubmit() {
        recipePage.clickButtonSubmit();
    }

    @Then("validate title recipe is {string}")
    public void validateTitleRecipeIsDisplayed(String title) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(recipePage.getRecipeTitle(), title);
    }

    @And("validate {string} button is displayed")
    public void validateButtonIsDisplayed(String cartButton) {
        Assert.assertEquals(recipePage.getTextButtonAddToCart(), cartButton);
    }

    @And("User click on recipe title on profile page")
    public void userClickOnRecipeTitleOnProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        recipePage.clickTextRecipeTitleOnProfilePage();
    }

    @And("User click on more button inside recipe page")
    public void userClickOnMoreButtonInsideRecipePage() throws InterruptedException {
        Thread.sleep(2000);
        recipePage.clickButtonMoreRecipePage();
    }

    @And("User click edit post on recipe page")
    public void userClickEditPostOnRecipePage() throws InterruptedException {
        recipePage.clickButtonEditPostOnRecipePage();
        Thread.sleep(2000);
    }

    @When("User adjust the ingredient for how much portion")
    public void userAdjustTheIngredientForHowMuchPortion() throws InterruptedException {
        Thread.sleep(2000);
        recipePage.clickButtonIncreaseServing();
        recipePage.clickButtonIncreaseServing();
        recipePage.clickButtonDecreaseServing();
    }

    @When("User click add to cart button")
    public void userClickAddToCartButton() {
        recipePage.clickButtonAddToCart();
    }

    @Then("User like on someone cooking recipe")
    public void userLikeOnSomeoneCookingRecipe() throws InterruptedException {
        Thread.sleep(2000);
        recipePage.clickButtonLikeRecipePage();
    }

    @When("User input comment on text area as {string}")
    public void userInputCommentOnTextAreaAs(String text) throws InterruptedException {
        Thread.sleep(2000);
        recipePage.setInputTextAreaComment(text);
        Thread.sleep(2000);
    }

    @When("User click on first profile page from recipe page")
    public void userClickOnFirstProfilePageFromRecipePage() throws InterruptedException {
        Thread.sleep(2000);
        recipePage.clickImgProfileCommentFromRecipe();
    }

    @Then("Username must be same with {string}")
    public void usernameMustBeSameWith(String username) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(recipePage.getTextProfileUserOnProfilePage(), username);
    }

    @And("user click submit on recipe page")
    public void userClickSubmitOnRecipePage() throws InterruptedException {
        Thread.sleep(5000);
        recipePage.clickButtonSubmit();
    }
}
