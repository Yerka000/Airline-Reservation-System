import Entities.*;
import Services.DataProvider;
import Services.FlightReservationService;

import java.util.List;

class Main {
    public static void main(String[] args) {
        // Initialize DataProvider and Service
        DataProvider dataProvider = new DataProvider();
        FlightReservationService service = new FlightReservationService();

        // Load data
        List<Flight> flights = dataProvider.createFlights();
        List<Passenger> passengers = dataProvider.createPassengers();
        List<Reservation> reservations = dataProvider.createReservations(passengers, flights);

        // Print initial reservations
        System.out.println("Initial Reservations:");
        service.printReservations(reservations);

        // Fill a flight to capacity
        for (int i = 0; i < 98; i++) {
            flights.get(0).bookSeat();
        }

        // Test booking when no seats are available
        try {
            Reservation reservation3 = new Reservation(3, passengers.get(2), flights.get(0));
            System.out.println(reservation3);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Filter available flights
        System.out.println("\nAvailable Flights:");
        List<Flight> availableFlights = service.filterAvailableFlights(flights);
        service.printFlights(availableFlights);

        // Find a passenger by name
        System.out.println("\nSearching for Passenger 'Yerassyl':");
        Passenger foundPassenger = service.findPassengerByName(passengers, "Yerassyl");
        System.out.println(foundPassenger);

        // Sort passengers by age
        System.out.println("\nPassengers Sorted by Age:");
        List<Passenger> sortedPassengers = service.sortPassengersByAge(passengers);
        service.printPassengers(sortedPassengers);
    }
}
