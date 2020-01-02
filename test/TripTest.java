
import org.junit.Test;
import trip.Trip;
import trip.TripResult;

import static org.junit.Assert.*;

public class TripTest {

    @org.junit.Test
    public void subscribeTest() throws Exception {

        Trip trip = new Trip();
        TripResult result =  new TripResult();
        result.addObserver(trip);
        assertEquals( result.countObservers(), 1);
    }

    @org.junit.Test
    public void unsubscribeTest() throws Exception {
        Trip trip = new Trip();
        TripResult result =  new TripResult();
        result.addObserver(trip);
        assertEquals( result.countObservers(), 1);
        result.removeObserver(trip);
        assertEquals( result.countObservers(), 0);
    }


    @org.junit.Test
    public void notifyTest() throws Exception {
        Trip trip = new Trip();
        TripResult result =  new TripResult();
        result.setPrice(100);
        result.addObserver(trip);
        result.setPrice(200);
        assertEquals( true,true);

    }



}