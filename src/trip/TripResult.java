package trip;

import observer.Observable;

public class TripResult extends Observable{

    Trip trip;
    int price;
    String travelCompany;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(this.price != price){
            Object[] args =  new Object[2];
            args[0] = "Trip";
            args[1] = price;
            super.notifyObservers(args);
        }
        this.price = price;

    }

    public String getTravelCompany() {
        return travelCompany;
    }

    public void setTravelCompany(String travelCompany) {
        this.travelCompany = travelCompany;
    }


}