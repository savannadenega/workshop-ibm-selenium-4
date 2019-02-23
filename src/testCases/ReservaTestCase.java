package testCases;

import objects.ReservaObjs;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverInstance;

/**
 * @author SavannaDenega
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservaTestCase extends WebDriverInstance {

    ReservaObjs empregadoObjs = PageFactory.initElements(driver, ReservaObjs.class);

    @Test
    public void task1_procurarReservaDeQuarto() {
        sleep(3000);
        empregadoObjs.comboBoxLocation(driver).sendKeys("Sydney");
        sleep(3000);
        empregadoObjs.comboBoxHotel(driver).sendKeys("Hotel Creek");
        sleep(3000);
        empregadoObjs.comboBoxRoomType(driver).sendKeys("Standard");
        sleep(3000);
        empregadoObjs.comboRoomNumber(driver).sendKeys("1 - One");
        sleep(3000);
        empregadoObjs.textDateCheckIn(driver).clear();
        sleep(3000);
        empregadoObjs.textDateCheckIn(driver).sendKeys("23/11/2019");
        sleep(3000);
        empregadoObjs.textDateCheckout(driver).clear();
        sleep(3000);
        empregadoObjs.textDateCheckout(driver).sendKeys("26/11/2019");
        sleep(3000);
        empregadoObjs.comboBoxAdultRoom(driver).sendKeys("1 - One");
        sleep(3000);
        empregadoObjs.comboBoxChildRoom(driver).sendKeys("1 - One");
        sleep(3000);
        empregadoObjs.buttonSearch(driver).click();
    }

    @Test
    public void task2_selecionarReservaDeQuarto() {
        sleep(3000);
        empregadoObjs.checkBoxSelectRoom(driver).click();

        sleep(3000);
        empregadoObjs.buttonContinue(driver).click();
    }

    @Test
    public void task3_inserirDadosPessoaisReserva() {
        sleep(3000);
        empregadoObjs.textFirstName(driver).sendKeys("Savanna");
        sleep(3000);
        empregadoObjs.textLastName(driver).sendKeys("Machado");
        sleep(3000);
        empregadoObjs.textAddress(driver).sendKeys("Rua Missões");
        sleep(3000);
        empregadoObjs.textCreditCardNumber(driver).sendKeys("45465456456454564");
        sleep(3000);
        empregadoObjs.comboBoxCreditCartTypeCreditCard(driver).sendKeys("American Express");
        sleep(3000);
        empregadoObjs.comboBoxMonthExpireDateCreditCard(driver).sendKeys("January");
        sleep(3000);
        empregadoObjs.comboBoxYearExpireDateCreditCard(driver).sendKeys("2020");
        sleep(3000);
        empregadoObjs.textCvvCreditCard(driver).sendKeys("4567");
        sleep(3000);
        empregadoObjs.buttonBookNow(driver).click();
    }

    @Test
    public void task4_validarReserva() {
        sleep(3000);
        String orderNumber = empregadoObjs.textOrderNo(driver).getText();
        Assert.assertNotNull(orderNumber);
    }

}
