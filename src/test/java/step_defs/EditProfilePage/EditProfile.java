package step_defs.EditProfilePage;

import io.cucumber.java.en.And;
import org.cookit.pageObject.profile.edit_profile.EditProfilePage;
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
    public void userClickSaveButton() throws InterruptedException {
        Thread.sleep(1000);
        editProfilePage.clickButtonSave();
    }

    @And("User input bio with {string}")
    public void userInputBioWith(String text) {
        editProfilePage.setInputBio(text);
    }

    @And("User input current_password field with {string}")
    public void userInputCurrent_passwordFieldWith(String current) throws InterruptedException {
        Thread.sleep(2000);
        editProfilePage.setInputCurrentPw(current);
    }

    @And("User input new_password field with {string}")
    public void userInputNew_passwordFieldWith(String newPassword) {
        editProfilePage.setInputNewPw(newPassword);
    }

    @And("User input confirm_password field with {string}")
    public void userInputConfirm_passwordFieldWith(String confirmPassword) {
        editProfilePage.setInputConfirmPw(confirmPassword);
    }

    @And("User click on request button")
    public void userClickOnRequestButton() throws InterruptedException {
        Thread.sleep(1000);
        editProfilePage.clickButtonRequest();
    }

    @And("User update profile image from edit profile page {string}")
    public void userUpdateProfileImageFromEditProfilePage(String pathFile) {
        editProfilePage.clickInputFileEditProfile(pathFile);
    }
}
