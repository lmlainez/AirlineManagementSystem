package trip;

import observer.Observer;

import java.util.Date;
import java.util.List;

public class Trip extends Observer{

    private Date date;
    private String origin;
    private String destination;
    private List<TripResult> results;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<TripResult> getResults() {
        return results;
    }

    public void setResults(List<TripResult> results) {
        this.results = results;
    }

    @Override
    public void notifyObserver(Object[] args) {
        System.out.println("Changed price for " + args[0] + ", new price :" + args[1]);

    }
}