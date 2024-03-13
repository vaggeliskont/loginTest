package basicscript;

import com.codeborne.selenide.Configuration;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.io.File;

import static firstPackage.FirstLesson.driver;

public class BasicTestCase {

    @BeforeTest
            public void setup() {
        System.setProperty("wdm.cachePath", "./build");
        Configuration.downloadsFolder = System.getProperty("user.dir") + File.separator + "build" + File.separator + "downloads";
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.xm.com");
    }

    @Test
    public void mytest() {
        WebElement displayedElement = driver.findElement(By.cssSelector("div[class='block'] a[class='btn btn-solid btn-red btn-block']"));
        WebElement existsElement = driver.findElement(By.cssSelector(".apply-link"));
        WebElement enabledElement = driver.findElement(By.cssSelector(".img-responsive.center-block.xmapp_iso"));

        SoftAssert softAssert = new SoftAssert();
        //SoftAssertions softAssertions = new SoftAssertions();

        //softAssertions.assertThat(displayedElement.isDisplayed()).as("Displayed Element").isTrue();
        softAssert.assertTrue(displayedElement.isDisplayed() , "Element is not Displayed/Not expected " );
        System.out.println("Is Element Displayed? " + displayedElement.isDisplayed());
        //softAssertions.assertThat(existsElement).as("Exists Element").isNotNull();
        softAssert.assertNotNull(existsElement, "Element does not exist");
        //softAssertions.assertThat(enabledElement.isEnabled()).as("Enabled Element").isTrue();
        softAssert.assertTrue(enabledElement.isEnabled(), "Element is not enabled");

        //softAssertions.assertAll();
        softAssert.assertAll();
    }
    @AfterTest
    public void tearDown() {
        if (driver != null) {;
            driver.quit();
        }
    }

}
