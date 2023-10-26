package step_defs.MyPurchasePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.my_purchase.MyPurchasePage;
import org.openqa.selenium.WebDriver;
import step_defs.Hooks;

public class MyPurchase {

    private final WebDriver driver = Hooks.driver;

    MyPurchasePage myPurchasePage = new MyPurchasePage(driver);

    @And("User click my purchase")
    public void userClickMyPurchase() throws InterruptedException {
        Thread.sleep(1000);
        myPurchasePage.clickButtonMyPurchase();
    }

    @And("User click pay on my purchase page")
    public void userClickPayOnMyPurchasePage() throws InterruptedException {
        Thread.sleep(2000);
        myPurchasePage.clickButtonPay();
    }

    @Then("User click copy icon on detail purchase")
    public void userClickCopyIconOnDetailPurchase() throws InterruptedException {
        Thread.sleep(500);
        myPurchasePage.clickButtonCopyVA();
    }
}
