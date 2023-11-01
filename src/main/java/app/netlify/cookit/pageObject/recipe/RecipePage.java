package app.netlify.cookit.pageObject.recipe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipePage {
    public static WebDriver webDriver;

    public RecipePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    //CREATE
    @FindBy(xpath = "//button[@class='justify-self-start text-2xl']")
    private WebElement buttonBackToHome;

    @FindBy(xpath = "//button[.='New Post']")
    private WebElement buttonNewPost;

    @FindBy(xpath = "//a[.='New Recipe']")
    private WebElement buttonNewRecipe;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputTitle;

    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement inputDesc;

    @FindBy(xpath = "//input[@id='imageInput']")
    private WebElement inputFileImg;

    @FindBy(xpath = "//div[4]//button[@class='btn btn-circle btn-sm btn-ghost text-2xl text-primary']")
    private WebElement buttonAddBahan;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-circle btn-ghost col-span-1 ']")
    private WebElement buttonRemoveBahan;

    @FindBy(xpath = "//input[@class='input py-2 input-primary col-span-5']")
    private WebElement inputBahan;

    @FindBy(css = "[placeholder='Quantity']")
    private WebElement inputQuantity;

    @FindBy(xpath = "//input[3]")
    private WebElement inputSatuan;

    @FindBy(xpath = "//div[5]//button[@class='btn btn-circle btn-sm btn-ghost text-2xl text-primary']")
    private WebElement buttonAddStep;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-circle btn-ghost col-span-1 ']")
    private WebElement buttonRemoveStep;

    @FindBy(xpath = "//textarea[@class='input h-20 py-2 input-primary col-span-11']")
    private WebElement inputStep;

    @FindBy(xpath = "//input[@class='checkbox checkbox-primary rounded-full checkbox-sm']")
    private WebElement checkSellBahan;

    @FindBy(xpath = "//input[@id='price']")
    private WebElement inputPrice;

    @FindBy(xpath = "//button[@class='btn btn-primary w-1/2 self-end mt-2']")
    private WebElement buttonSubmit;

    @FindBy(xpath = "//p[@class='flex']")
    private WebElement textRecipeTitle;

    @FindBy(xpath = "//p[@class='font-semibold text-primary hover:text-accent hover:cursor-pointer']")
    private WebElement textRecipeTitleOnProfilePage;

    @FindBy(xpath = "//label[@class='flex items-center gap-1 hover:text-accent hover:cursor-pointer']")
    private WebElement buttonMoreOnRecipePage;

    @FindBy(xpath = "//a[.='Edit']")
    private  WebElement buttonEditPostOnRecipePage;

    public void clickButtonEditPostOnRecipePage() {
        buttonEditPostOnRecipePage.click();
    }

    public void clickButtonMoreRecipePage() {
        buttonMoreOnRecipePage.click();
    }

    public void clickTextRecipeTitleOnProfilePage() {
        textRecipeTitleOnProfilePage.click();
    }
    public void clickButtonToHome() {
        buttonBackToHome.click();
    }

    public void clickButtonNewPost() {
        buttonNewPost.click();
    }

    public void clickButtonNewRecipe() {
        buttonNewRecipe.click();
    }

    public void setInputTitle(String title) {
        inputTitle.clear();
        inputTitle.sendKeys(title);
    }

    public void setInputDesc(String desc) {
        inputDesc.clear();
        inputDesc.sendKeys(desc);
    }

    public void setInputFileImg(String pathFile) {
        inputFileImg.sendKeys(pathFile);
    }

    public void clickButtonAddBahan() {
        buttonAddBahan.click();
    }

    public void clickButtonRemoveBahan() {
        buttonRemoveBahan.click();
    }

    public void setInputBahan(String bahan) {
        inputBahan.clear();
        inputBahan.sendKeys(bahan);
    }

    public void setInputQuantity(String quantity) {
        inputQuantity.clear();
        inputQuantity.sendKeys(quantity);
    }

    public void setInputUnit(String satuan) {
        inputSatuan.clear();
        inputSatuan.sendKeys(satuan);
    }

    public void clickButtonAddStep() {
        buttonAddStep.click();
    }

    public void clickButtonRemoveStep() {
        buttonRemoveStep.click();
    }

    public void setInputStep(String step) {
        inputStep.clear();
        inputStep.sendKeys(step);
    }

    public void clickCheckSellBahan() {
        checkSellBahan.click();
    }

    public void setInputPrice(String price) {
        inputPrice.clear();
        inputPrice.sendKeys(price);
    }

    public String getRecipeTitle(){
        return textRecipeTitle.getText();
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();
    }

    //READ

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement textAreaComment;

    @FindBy(xpath = "//button[@class='btn btn-secondary w-40 justify-self-end']")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//div[@class='grid grid-cols-2 items-center font-bold']//button[@class='btn rounded-r-lg rounded-l-none text-primary text-2xl']")
    private WebElement buttonIncreaseServing;

    @FindBy(xpath = "//div[@class='grid grid-cols-2 items-center font-bold']//button[@class='btn rounded-l-lg rounded-r-none text-primary text-2xl']")
    private WebElement buttonDecreaseServing;

    @FindBy(xpath = "//div[@class='flex gap-1']/button[.='0']")
    private WebElement buttonLikeRecipePage;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[4]//h1[@class='font-semibold flex']")
    private WebElement textFirstUserOnComment;

    @FindBy(xpath = "//h1[@class='font-bold col-span-2 text-xl md:text-xl flex']")
    private WebElement textProfileUserOnProfilePage;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[4]/div[@class='w-2/12']")
    private WebElement imgProfileCommentFromRecipe;

    public void clickImgProfileCommentFromRecipe() {
        imgProfileCommentFromRecipe.click();
    }

    public String getTextFirstUserOnComment() {
        return textFirstUserOnComment.getText();
    }

    public String getTextProfileUserOnProfilePage(){
        return textProfileUserOnProfilePage.getText();
    }

    public void clickButtonLikeRecipePage() {
        buttonLikeRecipePage.click();
    }

    public String getTextButtonAddToCart(){
        return buttonAddToCart.getText();
    }

    public void setInputTextAreaComment(String text) {
        textAreaComment.clear();
        textAreaComment.sendKeys(text);
    }

    public void clickButtonAddToCart(){
        buttonAddToCart.click();
    }

    public void clickButtonIncreaseServing(){
        buttonIncreaseServing.click();
    }

    public void clickButtonDecreaseServing(){
        buttonDecreaseServing.click();
    }
}
