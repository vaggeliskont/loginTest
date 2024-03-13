package tests;

import gui.BasePage;
import gui.HomePage;
import gui.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static gui.BasePage.initializeDriver;

public class UnsuccessfulLoginTest extends BasePage {
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void setup(){
        initializeDriver();
        driver.get("https://my.xm.com/member/login");
        driver.findElement(By.cssSelector("div[id='js-cookieInitialPage'] div button[aria-label='Close']")).click();
        loginPage = new LoginPage();
        homePage = new HomePage();

    }

    @Test
    public void testUnsuccessfulLogin() {



        loginPage.login("ekontoulis+ldstestpara2@xm.com","Testing123");
        //System.out.println(loginPage.wrongCredentials());
    }

    @AfterClass
    public void tearDown() {
        BasePage.quitBrowser(); //otan h methodos einai static kaloume classname.method
    }

}