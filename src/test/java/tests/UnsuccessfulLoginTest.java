package tests;

import gui.BasePage;
import gui.pages.HomePage;
import gui.pages.LoginPage;
import org.testng.annotations.Test;

public class UnsuccessfulLoginTest extends BasePage {
    private LoginPage loginPage;
    private HomePage homePage;

    @Test
    public void testUnsuccessfulLogin() {

        loginPage.login("ekontoulis+ldstestpara2@xm.com", "Testing123");
        //System.out.println(loginPage.wrongCredentials());
    }
}
