import Entities.Passenger;
import Entities.Flight;
import Entities.Reservation;

class Main {
    public static void main(String[] args) {
        // Create flights
        Flight flight1 = new Flight("FS 7361", "Turkestan", "Astana", 146);
        Flight flight2 = new Flight("FS 7362", "Astana", "Turkestan", 146);

        // Create passengers
        Passenger passenger1 = new Passenger("Yerkin Yerassyl", 19, "049900900");
        Passenger passenger2 = new Passenger("Yerkin Kobey", 23, "049900901");

        // Make reservations
        Reservation reservation1 = new Reservation(passenger1, flight1);
        Reservation reservation2 = new Reservation(passenger2, flight2);

        // Output reservations
        System.out.println(reservation1);
        System.out.println(reservation2);

        // Compare flights
        System.out.println("Are flight1 and flight2 the same? " + flight1.equals(flight2));

        // Output flight details
        System.out.println(flight1);
        System.out.println(flight2);
    }
}