package by.mmf.vshishkar.steps;

import by.mmf.vshishkar.common.SearchData;
import by.mmf.vshishkar.page.MainPage;
import org.openqa.selenium.WebDriver;

public class MainPageSteps {

    private MainPage mainPage;

    public MainPageSteps(WebDriver driver) {
        mainPage = new MainPage(driver);
    }

    public String getErrorWhenNoArrivalAirport(){
        mainPage.clickSearch();
        return mainPage.getDepartureError();
    }


    public String getErrorWhenArrivalAirportEqualsToDepartureOne(SearchData data){
        mainPage.setArrivalAirport(data.getArrivalAirport());
        mainPage.setDepartureAirport(data.getDepartureAirport());
        mainPage.clickDate();
        mainPage.clickSearch();
        return mainPage.getDepartureError();
    }

}
