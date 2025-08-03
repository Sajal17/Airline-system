package Service;


import Entity.Flight;
import Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;
    public List<Flight> getAllFlightsFromSourceToDestination(String source,String destination){
        return flightRepository.getAllList().stream().filter(item->item.getSource().equalsIgnoreCase(source)
                && item.getDestination().equalsIgnoreCase(destination)).toList();
    }
}
