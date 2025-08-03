package Database;

import Entity.Flight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public abstract class SimpleFlightList implements FlightList{

    List<Flight> listOfFlight = new ArrayList<Flight>();

    public SimpleFlightList(){
        listOfFlight.add(new Flight("Fl001","LA","Stockholm"));
        listOfFlight.add(new Flight("Fl002","LA","New York"));
        listOfFlight.add(new Flight("Fl004","LA","Texas"));
        listOfFlight.add(new Flight("Fl007","Delhi","Bengaluru"));
        listOfFlight.add(new Flight("Fl009","Sydney","Miami"));
        listOfFlight.add(new Flight("Fl011","Wales","Cambridge"));
        listOfFlight.add(new Flight("Fl016","Michigan","Delhi"));
        listOfFlight.add(new Flight("Fl021","Wisconsin","Mumbai"));
        listOfFlight.add(new Flight("Fl026","Calcutta","Delhi"));
        listOfFlight.add(new Flight("Fl032","Mumbai","Bengaluru"));
        listOfFlight.add(new Flight("Fl045","Bengaluru","Calcutta"));
        listOfFlight.add(new Flight("Fl051","Delhi","London"));
        listOfFlight.add(new Flight("Fl065","Mumbai","New York"));

    }

    @Override
    public List<Flight> getAllFlights() {
        return this.listOfFlight;
    }
}
