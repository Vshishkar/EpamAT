package by.mmf.vshishkar.common;

public class SearchData {

    private String arrivalAirport;
    private String departureAirport;
    private int numberOfDaysFromNowInDepartureDate;
    private int numberOfDaysFromNowInReturnCalendar;
    private int numberOfAdults;
    private int numberOfChildren;
    private int numberOfInfant;

    public SearchData() {
    }

    public SearchData(String arrivalAirport, String departureAirport, int numberOfDaysFromNowInDepartureDate, int numberOfDaysFromNowInReturnCalendar, int numberOfAdults, int numberOfChildren, int numberOfInfant) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.numberOfDaysFromNowInDepartureDate = numberOfDaysFromNowInDepartureDate;
        this.numberOfDaysFromNowInReturnCalendar = numberOfDaysFromNowInReturnCalendar;
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
        this.numberOfInfant = numberOfInfant;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public int getNumberOfDaysFromNowInDepartureDate() {
        return numberOfDaysFromNowInDepartureDate;
    }

    public void setNumberOfDaysFromNowInDepartureDate(int numberOfDaysFromNowInDepartureDate) {
        this.numberOfDaysFromNowInDepartureDate = numberOfDaysFromNowInDepartureDate;
    }

    public int getNumberOfDaysFromNowInReturnCalendar() {
        return numberOfDaysFromNowInReturnCalendar;
    }

    public void setNumberOfDaysFromNowInReturnCalendar(int numberOfDaysFromNowInReturnCalendar) {
        this.numberOfDaysFromNowInReturnCalendar = numberOfDaysFromNowInReturnCalendar;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfInfant() {
        return numberOfInfant;
    }

    public void setNumberOfInfant(int numberOfInfant) {
        this.numberOfInfant = numberOfInfant;
    }
}
