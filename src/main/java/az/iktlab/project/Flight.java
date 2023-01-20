package az.iktlab.project;

import java.util.Objects;

public class Flight {

    private String date;
    private String time;
    private String destination;
    private int seat;

    public Flight(String date, String time, String destination, int seat) {
        this.date = date;
        this.time = time;
        this.destination = destination;
        this.seat = seat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return seat == flight.seat && date.equals(flight.date) && time.equals(flight.time) && destination.equals(flight.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time, destination, seat);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", destination='" + destination + '\'' +
                ", seat=" + seat +
                '}';
    }
}
