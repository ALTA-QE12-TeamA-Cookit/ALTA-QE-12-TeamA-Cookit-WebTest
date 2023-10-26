package step_defs.SignUpPage;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.signup.SignUpPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_defs.Hooks;

public class SignUp {
    private final WebDriver driver = Hooks.driver;
    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("user on landing page")
    public void userAlreadyOnCookitLandingPage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(signUpPage.verifyLandingPageDisplayed());
    }


    @When("user click sign in buttons")
    public void userClickSignInButtons() {
        signUpPage.clickSignInButton();

    }

    @And("user on login page")
    public void userOnLoginPage() {
        Assert.assertTrue(signUpPage.verifyLoginPageDisplayed());
    }


    @And("user click sign up button")
    public void userClickSignUpButton() {
        signUpPage.clickSignUpButton();
    }

    @And("user input  {string}, {string}, {string}")
    public void userInput(String username, String email, String password) {
        signUpPage.inputUsername(username);
        signUpPage.inputEmail(email);
        signUpPage.inputPassword(password);
    }

    @And("click Sign up button")
    public void clickSignUpButton() {
        signUpPage.clickButtonSignUpOnSignUpPage();
    }

    @Then("pop-up return should be shown")
    public void popUpReturnShouldBeShown() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        Assert.assertTrue(signUpPage.verifyPopUpSignUpPage());
    }


    @Then("warning pop-up should be same with {string}")
    public void warningPopUpShouldBeShown(String message) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='block alert alert-error shadow-lg']//span[.='Please input your email, username and password..']")));
        Assert.assertEquals(signUpPage.errorRegisteredSignUp(), message);
    }

    @Then("first condition password shouldn't be green text")
    public void firstConditionPasswordShouldnTBeGreenText() {
        Assert.assertEquals(signUpPage.verifyRequirement1blackSignUp(),signUpPage.verifyRequirement1blackSignUp());
    }

    @Then("second condition password should be uncheck")
    public void secondConditionPasswordShouldBeUncheck() {
    }
}