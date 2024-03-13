package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static firstPackage.FirstLesson.driver;

public class LoginPage extends BasePage {

    WebElement userEmail = driver.findElement(By.cssSelector("#login_user"));
    WebElement userPass = driver.findElement(By.cssSelector("#login_pass"));
    WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

   // WebElement wrongCreds = driver.findElement(By.cssSelector(".xm-link-key"));


    public void login(String username, String password)  {
        userEmail.sendKeys(username);
        userPass.sendKeys(password);
        loginButton.click();
    }

//    public String wrongCredentials(){
//        String errorMessage = wrongCreds.getText();
//        return errorMessage;
//    }
}
