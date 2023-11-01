package org.cookit.pageObject.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    public static WebDriver webDriver;

    public AdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[contains(.,'Recipes')]")
    private WebElement homepageAdmin;

    @FindBy(xpath = "(//p[contains(.,'Profile')])[2]")
    private WebElement iconProfileBtn;

    @FindBy(xpath = "(//a[contains(.,'verify users')])[2]")
    private WebElement dropdownVerifyUserBtn;

    @FindBy(xpath = "(//button[contains(@class,'font-semibold')])[1]")
    private WebElement verifyUserPage;

    @FindBy(xpath = "(//button[contains(@class,'btn btn-secondary btn-sm btn-circle')])[1]")
    private WebElement checklistVerifyUserBtn;

// ===============================================================================================================

    public boolean validateHomepageAdmin() {
        return homepageAdmin.isDisplayed();
    }
    public void clickIconProfileBtn() {
        iconProfileBtn.click();
    }

    public void clickDropDownMenuBtn() {
        dropdownVerifyUserBtn.click();
    }

    public boolean validateVerifyUserPage() {
        return verifyUserPage.isDisplayed();
    }

    public void clickChecklistVerifyUserBtn() {
        checklistVerifyUserBtn.click();
    }
}
