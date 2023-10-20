package org.example.pageObject.cooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cooking {
    public static WebDriver webDriver;

    public Cooking(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "[Automation Web Testing] [My Purchase Page] Create page object & function")
    private WebElement inputTextPost;

    @FindBy(xpath = "//label[@class='btn btn-secondary  w-full sm:w-20 sm:btn-sm flex gap-2']/input[1]")
    private WebElement inputFileImg;

    @FindBy(xpath = "//button[@class='btn btn-primary sm:w-20 w-full sm:btn-sm']")
    private WebElement buttonSubmit;
}
