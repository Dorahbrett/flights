package codoacodo.flights.controller;

import codoacodo.flights.model.Flight;
import codoacodo.flights.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/flight")

public class FlightController {
    @Autowired
    FlightService flightService;

   @GetMapping("/all")
    public List<Flight> getAllFlights(){
        return flightService.getAllFlights();
    }

    @PostMapping("/add")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);

    }
    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable Long id){

        return flightService.findFlightById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFlightById(@PathVariable Long id){

        flightService.deleteFlightById(id);
    }

    @PutMapping("/update")
    public Flight updateFlight(@RequestBody Flight flight) {
    return flightService.updateFlight(flight);

    }

    @GetMapping("/origin")
    public List<Flight> findByOrigen(@RequestParam String origen){
       return flightService.findByOrigen(origen);

    }

    @GetMapping("/location")
    public List<Flight> findByOrigenAndDestino(@RequestParam String origen, String destino){
        return flightService.findByOrigenAndDestino(origen, destino);

    }

    @GetMapping("/offerflights")
    public List<Flight> findByPrice(){
       Double OfferPrice = 4000.00;
    return flightService.findByPrice(OfferPrice);
    }

}