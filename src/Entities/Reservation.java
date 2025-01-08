package Entities;

public class Reservation extends Entity {

    // Constructor
    public Reservation(int id, Passenger passenger, Flight flight) {
        super(id);
        if (flight.isAvailable()) {
            this.passenger = passenger;
            this.flight = flight;
            flight.bookSeat();
        } else {
            throw new IllegalStateException("No seats available for reservation.");
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
        return "Reservation[ID: " + getId() + ", Passenger: " + passenger + ", Flight: " + flight + "]";
    }
}
