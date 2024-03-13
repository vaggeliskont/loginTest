package tests;


import gui.BasePage;
import gui.HomePage;
import gui.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static gui.BasePage.initializeDriver;

public class SuccessfulLoginTest extends BasePage {

    public LoginPage loginPage;
    public HomePage homePage;

    @BeforeClass
    public void setup() {
        initializeDriver();
        driver.get("https://my.xm.com/member/login");
        driver.findElement(By.cssSelector("div[id='js-cookieInitialPage'] div button[aria-label='Close']")).click();


    }

    @Test
    public void testSuccessfulLogin()  {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage = new LoginPage();
        loginPage.login("ekontoulis+ldstestpara2@xm.com","Testing123!");
        SoftAssert softAssert = new SoftAssert();

        homePage = new HomePage();
        softAssert.assertTrue(homePage.isFaUserDisplayed(), "fa-User is not displayed/Check if you are logged in");
        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
        BasePage.quitBrowser();
    }

}
