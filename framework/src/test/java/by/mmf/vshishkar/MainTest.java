package by.mmf.vshishkar;

import by.mmf.vshishkar.steps.MainPageSteps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainTest {

    private WebDriver driver;
    private MainPageSteps mainPageSteps;

    @Before
    public void openPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        /*options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        driver = new ChromeDriver(options);
        */
        driver = new ChromeDriver();
        driver.get("https://www.aviasales.ru");
        mainPageSteps = new MainPageSteps(driver);
    }

    @Test
    public void findTicketWhenThereAreBlankFields(){
        String expectedError = "Укажите город прибытия";
        String actualValue = mainPageSteps.getErrorWhenNoArrivalAirport();
        Assert.assertEquals(expectedError,actualValue);
    }


    @After
    public void close() {
        driver.quit();
        driver = null;
    }

}
