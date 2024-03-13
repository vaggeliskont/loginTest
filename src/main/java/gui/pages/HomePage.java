package gui.pages;

import com.codeborne.selenide.SelenideElement;
import gui.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {

    private final SelenideElement faUser = $x("//i[@class='fak fa-user text-xl text-gray-900 dark:text-white']");

    public HomePage verifyFaUserIsDisplayed() {
        faUser.shouldBe(visible);
        return this;
    }
}
