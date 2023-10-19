package step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser () {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        String url = "https://cookit-immersive.netlify.app/";

        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
