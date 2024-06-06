package codoacodo.flights.service;

import codoacodo.flights.model.Flight;
import codoacodo.flights.repository.FlightRepository;
import codoacodo.flights.utils.FlightUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class FlightService {

@Autowired
FlightRepository flightRepository;

@Autowired
    FlightUtils flightUtils;
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public void createFlight(Flight flight){
        flightRepository.save(flight);
   }
    public Flight findFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public void deleteFlightById(Long id) {
        flightRepository.deleteById(id);
    }

    public Flight updateFlight(Flight flight) {
       flightRepository.save(flight);
       return flightRepository.findById(flight.getId()).orElse(null);
    }


    public List<Flight> findByOrigen(String origen) {
        return flightRepository.findByOrigen(origen);
    }


    public List<Flight> findByOrigenAndDestino(String origen, String destino) {
        return flightRepository.findByOrigenAndDestino(origen, destino);
    }

    public List<Flight> findByPrice(Double OfferPrice){
        List<Flight> Flights = flightRepository.findAll();
        List<Flight> OfferFlights = new ArrayList<>();

        return flightUtils.detectOffers(Flights, OfferPrice);

    }
}
