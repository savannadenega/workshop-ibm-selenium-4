package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author SavannaDenega
 *
 */
public class ReservaObjs {

    public WebElement comboBoxLocation(WebDriver driver) {
        String id = "location";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxHotel(WebDriver driver) {
        String id = "hotels";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxRoomType(WebDriver driver) {
        String id = "room_type";
        return driver.findElement(By.id(id));
    }

    public WebElement comboRoomNumber(WebDriver driver) {
        String id = "room_nos";
        return driver.findElement(By.id(id));
    }

    public WebElement textDateCheckIn(WebDriver driver) {
        String id = "datepick_in";
        return driver.findElement(By.id(id));
    }

    public WebElement textDateCheckout(WebDriver driver) {
        String id = "datepick_out";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxAdultRoom(WebDriver driver) {
        String id = "adult_room";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxChildRoom(WebDriver driver) {
        String id = "child_room";
        return driver.findElement(By.id(id));
    }

    public WebElement buttonSearch(WebDriver driver) {
        String id = "Submit";
        return driver.findElement(By.id(id));
    }

    //---------------------------

    public WebElement checkBoxSelectRoom(WebDriver driver) {
        String id = "radiobutton_0";
        return driver.findElement(By.id(id));
    }

    public WebElement buttonContinue(WebDriver driver) {
        String id = "continue";
        return driver.findElement(By.id(id));
    }

    //-----------------------------

    public WebElement textFirstName(WebDriver driver) {
        String id = "//*[@id=\"first_name\"]";
        return driver.findElement(By.xpath(id));
    }

    public WebElement textLastName(WebDriver driver) {
        String id = "last_name";
        return driver.findElement(By.id(id));
    }

    public WebElement textAddress(WebDriver driver) {
        String id = "address";
        return driver.findElement(By.id(id));
    }

    public WebElement textCreditCardNumber(WebDriver driver) {
        String id = "cc_num";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxCreditCartTypeCreditCard(WebDriver driver) {
        String id = "cc_type";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxMonthExpireDateCreditCard(WebDriver driver) {
        String id = "cc_exp_month";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxYearExpireDateCreditCard(WebDriver driver) {
        String id = "cc_exp_year";
        return driver.findElement(By.id(id));
    }

    public WebElement textCvvCreditCard(WebDriver driver) {
        String id = "cc_cvv";
        return driver.findElement(By.id(id));
    }

    public WebElement buttonBookNow(WebDriver driver) {
        String id = "book_now";
        return driver.findElement(By.id(id));
    }

    //------------------------------

    public WebElement textOrderNo(WebDriver driver) {
        String id = "order_no";
        return driver.findElement(By.id(id));
    }

}
