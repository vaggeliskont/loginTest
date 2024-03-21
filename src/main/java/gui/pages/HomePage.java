package gui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import gui.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {

    private final SelenideElement faUser = $x("//a[@class='hidden ltr:ml-4 rtl:mr-4 text-center text-white bg-secondary-500 hover:bg-secondary-800 font-medium rounded-lg text-sm ltr:pl-3 rtl:pr-3 ltr:pr-4 rtl:pl-4 py-2.5 items-center md:inline-flex dark:bg-secondary-400 dark:hover:bg-secondary-700 dark:focus:ring-secondary-800']");

    public HomePage() {
        // Wait for page to load
        Selenide.Wait().until(Selenide::page);
    }
    public HomePage verifyFaUserIsDisplayed() {
        faUser.shouldBe(visible);
        return this;
    }
}
