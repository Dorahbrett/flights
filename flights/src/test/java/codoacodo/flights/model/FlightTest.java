package codoacodo.flights.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlightTest {
    private static Flight flight;

    @Test
    public void setAndGetOrigenTest() {
        String testedorigen = "Buenos Aires";
        flight.setOrigen(testedorigen);
        System.out.println("Se le asigna el origen ="+ testedorigen);
        assertThat(flight.getOrigen()).isEqualTo(testedorigen);
    }

    @Test
    public void setAndGetDestinoTest(){
        String testeddestino = "Mendoza";
        flight.setDestino(testeddestino);
        System.out.println("Se le asigna el destino=" + testeddestino);
        assertThat(flight.getDestino()).isEqualTo(testeddestino);

    }

    @BeforeAll
    public static void setup(){
        System.out.println("Se esta creando el vuelo");
        flight = new Flight();
    }

}