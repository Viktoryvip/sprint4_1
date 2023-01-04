package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSecondPage {

    WebDriver driver;

    @FindBy(xpath = ".//input[@placeholder='* Когда привезти самокат']")
    private WebElement orderDate; //поле Дата заказа
    @FindBy(xpath = ".//div[@class='react-datepicker__day react-datepicker__day--031 react-datepicker__day--weekend']")
    private WebElement exactDate;// дата 1
    @FindBy(xpath = ".//div[@class='react-datepicker__day react-datepicker__day--030'] ")
    private WebElement exactDate2; //дата 2
    @FindBy(className = "Dropdown-placeholder")
    private WebElement rentPeriod; //поле Срок аренды
    @FindBy(xpath = ".//div[@class='Dropdown-option'][7]")
    private WebElement rentPeriodInDay; //срок аренды для заказа 1
    @FindBy(xpath = ".//div[@class='Dropdown-option'][5]")
    private WebElement rentPeriodInDay2; //срок аренды для заказа 2
    @FindBy(xpath = "//*[@id=\"black\"]")
    private WebElement colorScooterBlack; //цвет черный
    @FindBy(xpath = "//*[@id=\"grey\"]")
    private WebElement colorScooterGrey; //цвет серый
    @FindBy(xpath = ".//input[@placeholder='Комментарий для курьера']")
    private WebElement commentDelivery; //комментарий для курьера
    @FindBy(xpath = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private WebElement confirmOrderButton; //конпка заказа на второй страницу
    @FindBy(xpath = ".//div[@class='Order_Modal__YZ-d3']//button[2]")
    private WebElement buttonYes; //кнопка Да
    @FindBy(xpath = ".//div[@class = 'Order_ModalHeader__3FDaJ']")
    public WebElement finishModalWindow; //текст успешного оформления

    public OrderSecondPage(WebDriver driver) {
        this.driver = driver;
    }
    //выбрать дату доставки заказа 1
    public void clickOrderDate() {
        orderDate.click();
        exactDate.click();    }
    //выбрать срок аренды заказа 1
    public void clickRentPeriod() {
        rentPeriod.click();
        rentPeriodInDay.click();    }

    public void clickColorScooterBlack() { //цвет самоката черный
        colorScooterBlack.click();
    }

    public void setCommentDelivery(String comment) {  //комент
        commentDelivery.sendKeys(comment);
    }

    public void commentForDelivery(String comment) { //ввод коммента для курьера (он не обязателен, но думаю не помешает))
        setCommentDelivery(comment);
    }

    public void clickConfirmOrderButton() {   //Кликаю заказать
        confirmOrderButton.click();
    }

    public void clickButtonYes() {   //подтвержадю заказ
        buttonYes.click();
    }

    //выбрать дату доставки заказа 2 через нижнюю кнопку
    public void clickOrderDateTwo() {
        orderDate.click();
        exactDate2.click();
    }

    public void clickColorScooterGrey() { //цвет самоката серый
        colorScooterGrey.click();
    }
    //выбрать срок аренды для заказа 2
    public void clickRentPeriodTwo() {
        rentPeriod.click();
        rentPeriodInDay2.click();    }}