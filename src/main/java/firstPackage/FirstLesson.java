package firstPackage;

import com.codeborne.selenide.Configuration;
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
//import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
//import static com.codeborne.selenide.Selenide.open;

public class FirstLesson {

    public static WebDriver driver; //giati thelei public static

    public static void main(String[] args) throws InterruptedException {//giati h iselementPresent den mporei na einai mesa sthn main

        System.setProperty("wdm.cachePath", "./build");
        Configuration.downloadsFolder = System.getProperty("user.dir") + File.separator + "build" + File.separator + "downloads";
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.get("https://www.xm.com");



        //open("https://www.xm.com");

        boolean exist = isElementPresent("/html/body/div[3]/div/div"); /* edw kaleitai h methodos. Epeidh h isElementPresent
        einai public static tote gia na thn kalesoume mesa apo thn main den xreiazetai na dimiourgisoume object ths klashs
        kai apo ekei na thn kalesoume. An den kaname static thn isElementPresent tote tha eprepe na grapsoume
        FirstLesson fl = new FirstLesson();
        boolean exist = fl.isElementPresent("/html/body/div[3]/div/div");
        An ipirxe h methodos public mitsos kai mesa apo afth thn methodo thelame na kalesoume thn methodo kitsos tha
        mporousame na grapsoume public mitsos{
                                 kitsos();
                                }
        arkei h kitsos na einai kai afth no static */


        if (exist) {
            driver.findElement(By.xpath("//button[normalize-space()='ACCEPT ALL']")).click();
        }

        Thread.sleep(5000);
        driver.quit();
    }
    public static boolean isElementPresent(String locator) { // giati thelei public static?
        /*So if we are keeping everything as static, then it means that we are not following the oops concept
        We cannot do inheritance polymorphism if we have everything as static*/
        try {
            driver.findElement(By.xpath(locator)); //Pws doulevei h try catch
            return true;
        }catch (Throwable t){
            return false;
        }


    }


}

