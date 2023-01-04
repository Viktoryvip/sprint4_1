import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObject.MainPage;

import static org.junit.Assert.assertEquals;



public class QuestionsTest extends MainTest {

    @Test
    public void testFirstQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollImportantQuestions(); //скролим до вопроса

        mainPage.clickButtonFirstQuestion();  //кликаем по вопросу 1
        String firstQuestionText = driver.findElement(By.id("accordion__panel-0")).getText();
        assertEquals(mainPage.expectedFirstQuestionText, firstQuestionText);
    }

    @Test
    public void testSecondQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollImportantQuestions();


        mainPage.clickButtonSecondQuestion();  //кликаем по вопросу 2
        String secondQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-1\"]/p")).getText(); //Текст 2 элемента
        assertEquals(mainPage.expectedSecondQuestionText, secondQuestionText);// сравнивает текст
    }

    @Test
    public void testThirdQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollImportantQuestions();

        mainPage.clickButtonThirdQuestion(); //кликаем по вопросу 3
        String thirdQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-2\"]/p")).getText();  //Текст 3 вопроса
        assertEquals(mainPage.expectedThirdQuestionText, thirdQuestionText);
    }

    @Test
    public void testFourthQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollImportantQuestions();

        mainPage.clickButtonFourthQuestion(); //кликаем по вопросу 4
        String fourthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-3\"]/p")).getText();   //текст 4 вопроса
        assertEquals(mainPage.expectedFourthQuestionText, fourthQuestionText);
    }

    @Test
    public void testFifthQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollImportantQuestions();

        mainPage.clickButtonFifthQuestion(); //кликаем по вопросу 5
        String fifthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-4\"]/p")).getText();  //Текст 5 вопроса
        assertEquals(mainPage.expectedFifthQuestionText, fifthQuestionText);
    }

    @Test
    public void testSixthQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollImportantQuestions();

        mainPage.clickButtonSixthQuestion(); //кликаем по вопросу 6
        String sixthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-5\"]/p")).getText();
        assertEquals(mainPage.expectedSixthQuestionText, sixthQuestionText);
    }

    @Test
    public void testSeventhQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollImportantQuestions();

        mainPage.clickButtonSeventhQuestion(); //кликаем по вопросу 7
        String seventhQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-6\"]/p")).getText();
        assertEquals(mainPage.expectedSeventhQuestionText, seventhQuestionText);
    }

    @Test
    public void testEightQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollImportantQuestions();

        mainPage.clickButtonEightQuestion();  //кликаем по вопросу 8
        String eightQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-7\"]/p")).getText();
        assertEquals(mainPage.expectedEightQuestionText, eightQuestionText);
    }

}
