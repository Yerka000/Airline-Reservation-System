package Services;

import Entities.Flight;
import Entities.Passenger;
import Entities.Reservation;

import java.util.Arrays;
import java.util.List;

public class DataProvider {

    // Method to create a list of flights
    public List<Flight> createFlights() {
        return Arrays.asList(
                new Flight(1, "FS 7361", "Turkestan", "Astana", 100),
                new Flight(2, "FS 7362", "Astana", "Turkestan", 100)
        );
    }

    // Method to create a list of passengers
    public List<Passenger> createPassengers() {
        return Arrays.asList(
                new Passenger(1, "Yerassyl", 19, "049900900"),
                new Passenger(2, "Kobey", 23, "049900901"),
                new Passenger(3, "Alice", 20, "P789012")
        );
    }

    // Method to create a list of reservations
    public List<Reservation> createReservations(List<Passenger> passengers, List<Flight> flights) {
        return Arrays.asList(
                new Reservation(1, passengers.get(0), flights.get(0)),
                new Reservation(2, passengers.get(1), flights.get(1))
        );
    }
}
