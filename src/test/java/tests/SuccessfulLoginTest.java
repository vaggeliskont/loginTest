package tests;

import com.codeborne.selenide.WebDriverRunner;
import gui.pages.HomePage;
import gui.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import setUp.TestSetUp;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.Wait;


public class SuccessfulLoginTest extends TestSetUp {

    private final static String URL = "https://my.xm.com/member/login";

    private final static String URLH = "https://my.xm.com/member/";
    private final static String USERNAME = "ekontoulis+ldstestpara2@xm.com";
    private final static String PASSWORD = "Testing123!";

    @Test
    public void successfulLogin()  {
        new LoginPage()
                .openWebsite(URL)
                .clickCookiesButton()
                .login(USERNAME, PASSWORD);

        //Wait().until(webDriverRunner -> webDriverRunner.getCurrentUrl().equals(URLH));
        WebDriverWait wait; // Adjust timeout as needed
        wait = new WebDriverWait(WebDriverRunner.getWebDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(URLH));

        new HomePage().verifyFaUserIsDisplayed();
    }
}
