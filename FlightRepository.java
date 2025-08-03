package Repository;

import Database.FlightList;
import Entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightRepository {
    @Autowired
    FlightList flightList;
    public List<Flight> getAllList(){
        return flightList.getAllFlights();
    }
}
