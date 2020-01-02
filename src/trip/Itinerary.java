package trip;

import java.util.List;

public class Itinerary {

    String customer;
    List<Trip> tripList;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Trip> getTripList() {
        return tripList;
    }

    public void setTripList(List<Trip> tripList) {
        this.tripList = tripList;
    }

    public static void main(String[] args){

        System.out.println("HEEEY");
    }
}