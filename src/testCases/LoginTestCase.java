package testCases;

import objects.LoginObjs;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverInstance;

/**
 * @author SavannaDenega
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTestCase extends WebDriverInstance {

    LoginObjs loginObjs = PageFactory.initElements(driver, LoginObjs.class);

    @Test
    public void login() {
        sleep(3000);
        loginObjs.textUsername(driver).sendKeys("savannamachado");
        sleep(3000);
        loginObjs.textPassword(driver).sendKeys("XIFX38");
        sleep(3000);
        loginObjs.buttonLogin(driver).click();
    }

}
