package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderFirstPage {

    WebDriver driver;

    @FindBy(className = "Button_Button__ra12g")
    private WebElement topButtonOrder; //верхняя кнопка Заказать
    @FindBy(xpath = ".//div[@class='Home_FinishButton__1_cWm']/button")
    private WebElement lowerButtonOrder;  //нижняя кнопка Заказать

    @FindBy(xpath = ".//input[@placeholder='* Имя']")
    private WebElement onName; // поле Имя
    @FindBy(xpath = ".//input[@placeholder='* Фамилия']")
    private WebElement onSurname; //поле Фамилия
    @FindBy(xpath = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private WebElement onAddress; //поле Адрес
    @FindBy(xpath = ".//input[@placeholder='* Станция метро']")
    private WebElement fieldOnMetroStation; //поле станций Метро
    @FindBy(xpath = ".//button[@value='1']")
    private WebElement stationValue; //станция метро 1
    @FindBy(xpath = ".//button[@value='2']")
    private WebElement stationValue2; //станция метро 2
    @FindBy(xpath = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private WebElement phoneNumber; //поле Телефон
    @FindBy(xpath = ".//button[@class = \"Button_Button__ra12g Button_Middle__1CSJM\"]")
    private WebElement nextButton; //кнопка Далее

    public OrderFirstPage(WebDriver driver) {
        this.driver = driver;
    }

    //заявка по верхней кнопке
    public void open() {
        driver.get("https://qa-scooter.praktikum-services.ru");  }

    public void loginPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTopButtonOrder() {  //Кликнул на кнопку заказа
        topButtonOrder.click();
    }

    public void setUsername(String username) {   //Ввел имя
        onName.sendKeys(username);
    }

    public void setOnSurname(String surname) {   //Ввел фамилию
        onSurname.sendKeys(surname);
    }

    public void setOnAddress(String address) {  //ввел адрес
        onAddress.sendKeys(address);
    }
    //станции метро
    public void clickStationValue() {
        fieldOnMetroStation.click();
        stationValue.click();    }

    public void setPhoneNumber(String number) { //Вводим номер
        phoneNumber.sendKeys(number);
    }

    public void clickNextButton() {  //кликаем на кнопку Далее
        nextButton.click();
    }

    public void personalDate(String username, String surname, String address, String number) {
        setUsername(username);
        setOnSurname(surname);
        setOnAddress(address);
        setPhoneNumber(number);
    }
    //заявка по нижней кнопке
    public void clickLowButtonOrder() {   //кликаю на нжнюю кнопку Заказать
        lowerButtonOrder.click();
    }
    //клик по нижней кнопке
    public void clickStationValueLowButton() {
        fieldOnMetroStation.click();
        stationValue2.click();
    }
}