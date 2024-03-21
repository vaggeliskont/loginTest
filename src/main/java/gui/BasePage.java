package gui;

import com.codeborne.selenide.WebDriverRunner;
import lombok.SneakyThrows;

import static org.assertj.core.api.Assertions.assertThat;

public class BasePage {

    public String getCurrentUrl() {
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }

    @SneakyThrows
    public <T extends BasePage> T verifyCurrentUrlIsProper(String url, Class<T> clazz) {
        assertThat(getCurrentUrl()).as("Current url is not proper").isEqualTo(url);
        return clazz.getDeclaredConstructor().newInstance();
    }
}
