package by.mmf.vshishkar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

    private WebDriver driver;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.aviasales.ru");
    }

    @Test
    public void findTicketWhenThereAreBlankFields() {
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='of_main_form__submit']"));

        searchButton.submit();
        String realError = driver.findElement(By.xpath("//div[@data-testid='autocomplete-destination']"))
                .getAttribute("data-error-message");
        System.out.println(realError);
        String expectedError = "Укажите город прибытия";

        Assert.assertEquals(realError, expectedError);
    }


    @After
    public void close() {
        driver.close();
    }


}

