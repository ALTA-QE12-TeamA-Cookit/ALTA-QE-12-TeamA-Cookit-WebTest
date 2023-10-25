package step_defs.EditProfilePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.pageObject.profile.edit_profile.EditProfilePage;
import org.openqa.selenium.WebDriver;
import step_defs.Hooks;

public class EditProfile {

    private final WebDriver driver = Hooks.driver;

    EditProfilePage editProfilePage = new EditProfilePage(driver);

    @And("User click on Edit profile icon")
    public void userClickOnEditProfileIcon() throws InterruptedException {
        Thread.sleep(1000);
        editProfilePage.clickEditProfileButton();
    }

    @And("User input username with {string}")
    public void userInputUsernameWithEmptyField(String username) throws InterruptedException {
        Thread.sleep(1000);
        editProfilePage.setInputUsername(username);
    }

    @And("User click save button")
    public void userClickSaveButton() {
        editProfilePage.clickButtonSave();
    }

    @And("User input bio with {string}")
    public void userInputBioWith(String text) {
        editProfilePage.setInputBio(text);
    }
}
