package step_defs.SignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.SignInPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_defs.Hooks;


public class SignIn {

    private final WebDriver driver = Hooks.driver;

    SignInPage signInPage = new SignInPage(driver);

    @Given("User already on Cookit landing page")
    public void userAlreadyOnCookitLandingPage() {
        Assert.assertTrue(signInPage.verifyLandingPageTitle());
    }

    @When("user click sign in button")
    public void userClickSignInButton() {
        signInPage.clickButtonLanding();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        signInPage.setInputUsername(username);
    }

    @And("input password {string}")
    public void inputPassword(String password) {
        signInPage.setInputPassword(password);
    }

    @And("click Log in button")
    public void clickLogInButton() {
        signInPage.clickButtonLogin();
    }

    @Then("pop-up should return message with {string}")
    public void popUpShouldReturnMessageWith(String message) {
        WebDriverWait w = new WebDriverWait(driver, 3);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='block alert alert-error shadow-lg']//span[.='Please input your email, username and password..']")));
        Assert.assertEquals(signInPage.getSweetAlert(), message);
    }

}
