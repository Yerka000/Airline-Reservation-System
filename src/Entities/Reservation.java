package Entities;

public class Reservation {
    // Default constructor
    public Reservation(){
    }

    // Constructor
    public Reservation(Passenger passenger, Flight flight) {
        if (flight.isAvailable()) {
            this.passenger = passenger;
            this.flight = flight;
            flight.bookSeat();
        } else {
            throw new IllegalStateException("Reservation failed. No seats available.");
        }
    }

    // Attributes
    private Passenger passenger;
    private Flight flight;

    // Getters
    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    @Override
    public String toString() {
        return "Reservation[" + passenger + " -> " + flight + "]";
    }
}
