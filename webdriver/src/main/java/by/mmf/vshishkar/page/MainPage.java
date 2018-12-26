package by.mmf.vshishkar.page;

import org.openqa.selenium.By;
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
    @FindBy(xpath = "//div[@data-testid='autocomplete-origin']")
    private WebElement arrivalAirportError;


    @FindBy(xpath = "//input[@id='destination']")
    private WebElement departureInput;

    /* *
     * Error data at attribute named : "data-error-message"
     *
     * */
    @FindBy(xpath = "//div[@data-testid='autocomplete-destination']")
    private WebElement departureAirportError;


    @FindBy(xpath = "//div[@data-testid='datepicker_day_2018-12-28']")
    private WebElement arrivedDate;

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
        PageFactory.initElements(driver, this);
    }


    public void setArrivalAirport(String airport){
        arrivalInput.sendKeys(airport);

    }

    public void setDepartureAirport(String airport){
        departureInput.sendKeys(airport);

    }

    public void clickDate(){
        WebElement webElement = driver.findElement(By.xpath("//div[@class='datefield-dropdown__content-wrap']"));
        webElement.click();

        checkVisibility(arrivedDate).click();
    }

    public void clickSearch() {
        // didn't work
       // checkVisibility(searchButton).submit();
        findSearchButton().submit();
    }

    public String getDepartureError(){
        return checkVisibility(departureAirportError).getAttribute("data-error-message");
    }


    private WebElement findSearchButton(){
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='of_main_form__submit']"));
        return searchButton;
    }

    private WebElement checkVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}

