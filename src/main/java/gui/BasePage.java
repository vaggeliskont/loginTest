package gui;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BasePage {
    protected static WebDriver driver;
    public static void initializeDriver() {
        System.setProperty("wdm.cachePath", "./build");
        Configuration.downloadsFolder = System.getProperty("user.dir") + File.separator + "build" + File.separator + "downloads";
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void initConfiguration(){

    }
    public static void quitBrowser(){
        driver.quit();
    }

}
