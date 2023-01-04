package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    //Вопросы о важном
    @FindBy(xpath = ".//div[starts-with(@class,'Home_FourPart')]/div[starts-with(@class,'Home_SubHeader')]")
    private WebElement skrollQuestions;

    //Вопрос 1
    @FindBy(xpath = "//*[@id=\"accordion__heading-0\"]")
    private WebElement buttonFirstQuestion;
    public String expectedFirstQuestionText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    //Вопрос 2
    @FindBy(xpath = "//*[@id=\"accordion__heading-1\"]")
    private WebElement buttonSecondQuestion;
    public String expectedSecondQuestionText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    //Вопрос 3
    @FindBy(id = "accordion__heading-2")
    private WebElement buttonThirdQuestion;
    public String expectedThirdQuestionText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    //Вопрос 4
    @FindBy(id = "accordion__heading-3")
    private WebElement buttonFourthQuestion;
    public String expectedFourthQuestionText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    //Вопрос 5
    @FindBy(xpath = "//*[@id=\"accordion__heading-4\"]")
    private WebElement buttonFifthQuestion;
    public String expectedFifthQuestionText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

    //Вопрос 6
    @FindBy(id = "accordion__heading-5")
    private WebElement buttonSixthQuestion;
    public String expectedSixthQuestionText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    //Вопрос 7
    @FindBy(id = "accordion__heading-6")
    private WebElement buttonSeventhQuestion;
    public String expectedSeventhQuestionText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    //Вопрос 8
    @FindBy(id = "accordion__heading-7")
    private WebElement buttonEightQuestion;
    public String expectedEightQuestionText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    //скрол до элемента
    public void scrollImportantQuestions() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", skrollQuestions);
    }

    public void openPage() {  driver.get("https://qa-scooter.praktikum-services.ru/");  }

    public void clickButtonFirstQuestion() {   buttonFirstQuestion.click();    }

    public void clickButtonSecondQuestion() { buttonSecondQuestion.click();    }

    public void clickButtonThirdQuestion() {  buttonThirdQuestion.click();    }

    public void clickButtonFourthQuestion() {  buttonFourthQuestion.click();  }

    public void clickButtonFifthQuestion() {  buttonFifthQuestion.click();    }

    public void clickButtonSixthQuestion() {   buttonSixthQuestion.click();   }

    public void clickButtonSeventhQuestion() {  buttonSeventhQuestion.click(); }

    public void clickButtonEightQuestion() {  buttonEightQuestion.click();   }  }