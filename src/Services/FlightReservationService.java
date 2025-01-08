package Services;

import Entities.Flight;
import Entities.Passenger;
import Entities.Reservation;

import java.util.List;
import java.util.stream.Collectors;

public class FlightReservationService {

    // Filter flights with available seats
    public List<Flight> filterAvailableFlights(List<Flight> flights) {
        return flights.stream()
                .filter(Flight::isAvailable)
                .collect(Collectors.toList());
    }

    // Search for a passenger by name
    public Passenger findPassengerByName(List<Passenger> passengers, String name) {
        return passengers.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Sort passengers by age
    public List<Passenger> sortPassengersByAge(List<Passenger> passengers) {
        return passengers.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .collect(Collectors.toList());
    }

    // Print reservations
    public void printReservations(List<Reservation> reservations) {
        reservations.forEach(System.out::println);
    }

    // Print flights
    public void printFlights(List<Flight> flights) {
        flights.forEach(System.out::println);
    }

    // Print passengers
    public void printPassengers(List<Passenger> passengers) {
        passengers.forEach(System.out::println);
    }
}
