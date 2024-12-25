package Entities;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int capacity;
    private int bookedSeats;

    // Constructor
    public Flight(String flightNumber, String origin, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0; // Initially, no seats are booked
    }

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

    public void bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;
        } else {
            System.out.println("No seats available on this flight.");
        }
    }
    public boolean isAvailable() {
        return bookedSeats < capacity;
    }

    @Override
    public String toString() {
        return "Flight[" + flightNumber + ", From: " + origin + ", To: " + destination + ", Capacity: " + capacity + ", Booked: " + bookedSeats + "]";
    }
}
