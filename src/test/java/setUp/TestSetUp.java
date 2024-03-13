package setUp;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterClass;

public class TestSetUp {

    @AfterClass
    public static void quitBrowser() {
        WebDriverRunner.getWebDriver().quit();
    }
}
