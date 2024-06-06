package codoacodo.flights.repository;


import codoacodo.flights.model.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FlightRepositorytest {

    @Autowired
    private FlightRepository flightRepository;

    private Flight flight;

    @BeforeEach
    void setup(){
        flight = new Flight("Buenos Aires", "Cordoba", "9:00","11:00", 3500.00, "MensuAL");


    }
    @Test
    void saveFlightTest(){

        Flight Flightbd = flightRepository.save(flight);
        assertThat(Flightbd).isNotNull();
        assertThat(Flightbd.getId()).isGreaterThan(0);


    }

}
