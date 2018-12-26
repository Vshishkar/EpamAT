package by.mmf.vshishkar.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    @FindBy(xpath = "//button[@class='of_main_form__submit']")
    private WebElement searchButton;


    @FindBy(xpath = "//input[@id='origin']")
    private WebElement arrivalInput;


    /* *
    * Error data at attribute named : "data-error-message"
    *
    * */
    @FindBy(xpath = "//div[@data-testid='autocomplete-destination']")
    private WebElement arrivalAirportError;


    @FindBy(xpath = "//input[@id='destination']")
    private WebElement departureInput;

    /* *
     * Error data at attribute named : "data-error-message"
     *
     * */
    @FindBy(xpath = "//div[@data-testid='autocomplete-origin']")
    private WebElement departureAirportError;


    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
        PageFactory.initElements(driver, this);
    }


    public void clickSearch() {
        checkVisibility(searchButton).submit();
    }

    public String getDepartureError(){
        return checkVisibility(departureAirportError).getAttribute("data-error-message");
    }


    private WebElement checkVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}

