package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author SavannaDenega
 *
 */
public class LoginObjs {

    public WebElement textUsername(WebDriver driver) {
        String id = "username";
        return driver.findElement(By.id(id));
    }

    public WebElement textPassword(WebDriver driver) {
        String id = "password";
        return driver.findElement(By.id(id));
    }

    public WebElement buttonLogin(WebDriver driver) {
        String id = "login";
        return driver.findElement(By.id(id));
    }

}
