package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage extends BasePage {


     WebElement faUser = driver.findElement(By.xpath("//i[@class='fak fa-user text-xl text-gray-900 dark:text-white']"));

     public boolean isFaUserDisplayed() {

          return faUser.isDisplayed();
     }

}
