package consumable;

import com.codeborne.selenide.*;
import lombok.SneakyThrows;
import org.openqa.selenium.PageLoadStrategy;

public class WebDriverManager {

    public static void setUpWebDriver(String url) {
        if (!WebDriverRunner.hasWebDriverStarted()) {
            setUp();
            Selenide.open(url);
        }
    }

    @SneakyThrows
    private static void setUp() {
        System.setProperty("wdm.cachePath", "./build");
        Configuration.remote = null;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = Browsers.CHROME;
        Configuration.screenshots = true;
        Configuration.pageLoadStrategy = PageLoadStrategy.EAGER.toString();
        Configuration.fileDownload = FileDownloadMode.FOLDER;
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
    }
}
