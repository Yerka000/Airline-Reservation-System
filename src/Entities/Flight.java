package Entities;

public class Flight extends Entity {

    // Constructor
    public Flight(int id, String flightNumber, String origin, String destination, int capacity) {
        super(id);
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    // attributes
    private String flightNumber;
    private String origin;
    private String destination;
    private int capacity;
    private int bookedSeats;

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    // methods
    public boolean isAvailable() {
        return bookedSeats < capacity;
    }

    public void bookSeat() {
        if (isAvailable()) {
            bookedSeats++;
        } else {
            throw new IllegalStateException("No seats available.");
        }
    }

    @Override
    public String toString() {
        return "Flight[ID: " + getId() + ", Number: " + flightNumber + ", From: " + origin +
                ", To: " + destination + ", Capacity: " + capacity + ", Booked: " + bookedSeats + "]";
    }
}
