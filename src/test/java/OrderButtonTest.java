import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObject.MainPage;
import pageObject.OrderFirstPage;
import pageObject.OrderSecondPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class OrderButtonTest extends MainTest {

    @Test  // заказ по верхней кнопке 1
    public void TopButtonOrder() {
        OrderFirstPage pageObject = new OrderFirstPage(driver);
        PageFactory.initElements(driver, pageObject);
        OrderSecondPage orderPageStageTwo = new OrderSecondPage(driver);
        PageFactory.initElements(driver, orderPageStageTwo);
        pageObject.open();
        pageObject.clickTopButtonOrder();
        pageObject.personalDate("Иван", "Иванов", "Москва", "+79123456789");
        pageObject.clickStationValue();
        pageObject.clickNextButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        orderPageStageTwo.clickOrderDate();
        orderPageStageTwo.clickRentPeriod();
        orderPageStageTwo.clickColorScooterBlack();
        orderPageStageTwo.commentForDelivery("Позвонить за 15 минут до приезда");
        orderPageStageTwo.clickConfirmOrderButton();
        orderPageStageTwo.clickButtonYes(); // Баг: не активна кнопка подтверждения заказа "Да"
        boolean result = orderPageStageTwo.finishModalWindow.isDisplayed();
        assertTrue(result);
    }

    @Test   // заказ по нижней кнопке 2
    public void lowButtonOrder() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        OrderFirstPage pageObject = new OrderFirstPage(driver);
        PageFactory.initElements(driver, pageObject);
        OrderSecondPage orderPageStageTwo = new OrderSecondPage(driver);
        PageFactory.initElements(driver, orderPageStageTwo);
        pageObject.open();
        mainPage.scrollImportantQuestions();
        pageObject.clickLowButtonOrder();
        pageObject.personalDate("Петр", "Петров", "Санкт-Петербург", "+79987654321");
        pageObject.clickStationValueLowButton();
        pageObject.clickNextButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        orderPageStageTwo.clickOrderDateTwo();
        orderPageStageTwo.clickRentPeriodTwo();
        orderPageStageTwo.clickColorScooterGrey();
        orderPageStageTwo.commentForDelivery("Позвонить за 30 минут до приезда");
        orderPageStageTwo.clickConfirmOrderButton();
        orderPageStageTwo.clickButtonYes();
        boolean result = orderPageStageTwo.finishModalWindow.isDisplayed();
        assertTrue(result);    }}
