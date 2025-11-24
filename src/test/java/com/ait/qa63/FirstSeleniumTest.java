package com.ait.qa63;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    //private static final Logger log = LoggerFactory.getLogger(FirstSeleniumTest.class);
    //before- setUp()
    WebDriver driver; // объявление переменной

    @BeforeMethod // annotation, метод, который будет выполняться перед каждым тестом
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com"); // открытие страницы впервые
        // driver.navigate().to("https://www.google.com"); // разница в том, что
        // открывается страница с историей
        driver.navigate().back(); // возвращение на предыдущую страницу(backspace)
        driver.navigate().forward(); // возвращение на следующую страницу(forward)
        driver.navigate().refresh(); // обновление страницы
        driver.manage().window().maximize(); // максимальное окно
        //driver.manage().window().minimize(); // минимальное окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // wait for all elements

    }

    //test
    @Test // annotation, метод, который будет выполняться как тест
    public void firstTest() {
        System.out.println("Google is opened");

    }

    // after - tearDown()
    @AfterMethod // метод, который будет выполняться после каждого теста
            (enabled = false) // означает, что метод не будет выполняться
    public void tearDown() {
        //driver.quit(); // закрывается весь браузер
        driver.close(); // закрытие только одной вкладки
    }
}
