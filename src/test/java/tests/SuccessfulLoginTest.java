package tests;

import gui.pages.HomePage;
import gui.pages.LoginPage;
import org.testng.annotations.Test;
import setUp.TestSetUp;

public class SuccessfulLoginTest extends TestSetUp {

    private final static String URL = "https://my.xm.com/member/login";

    private final static String URLH = "https://my.xm.com/member";
    private final static String USERNAME = "ekontoulis+ldstestpara2@xm.com";
    private final static String PASSWORD = "Testing123!";

    @Test
    public void successfulLogin() {
        new LoginPage()
                .openWebsite(URL)
                .clickCookiesButton()
                .login(USERNAME, PASSWORD)
                    .verifyCurrentUrlIsProper(URLH, HomePage.class)
                    .verifyFaUserIsDisplayed();
    }
}
