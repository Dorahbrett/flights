package codoacodo.flights.utils;

import codoacodo.flights.model.Flight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlightUtils {

    public List<Flight> detectOffers(List <Flight>  Flights, double offerPrice) {

        List<Flight> offers = new ArrayList<>();
        for (Flight flight : Flights){
            if (flight.getPrecioEnPesos() < offerPrice){
                offers.add(flight);
            }
        }
        return offers;
    }
}
