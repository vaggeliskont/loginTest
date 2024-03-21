package gui.pages;

import com.codeborne.selenide.SelenideElement;
import consumable.WebDriverManager;
import gui.BasePage;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.Wait;
import static com.codeborne.selenide.WebDriverConditions.url;

public class LoginPage extends BasePage {

    private final SelenideElement emailInput = $("#login_user");
    private final SelenideElement passwordInput = $("#login_pass");
    private final SelenideElement submitButton = $("button[type='submit']");

    private final SelenideElement cookiesButton = $("div[id='js-cookieInitialPage'] div button[aria-label='Close']");

    public LoginPage openWebsite(String url) {
        WebDriverManager.setUpWebDriver(url);
        return this;
    }

    public LoginPage clickCookiesButton() {
        if (cookiesButton.isDisplayed()) {
            cookiesButton.click();
        }
        return this;
    }

    public HomePage login(String username, String password) {
        emailInput.setValue(username);
        passwordInput.setValue(password);
        submitButton.shouldBe(enabled).click();
        return new HomePage();
    }

}
