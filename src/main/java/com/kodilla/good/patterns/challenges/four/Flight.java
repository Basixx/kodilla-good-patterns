package com.kodilla.good.patterns.challenges.four;

import java.util.List;

public class Flight {
    private Airport departure;
    private Airport arrival;
    private List<Airport> transfer;

    public Flight(Airport departure, Airport arrival, List<Airport> transfer) {
        this.departure = departure;
        this.arrival = arrival;
        this.transfer = transfer;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public List<Airport> getTransfer() {
        return transfer;
    }


    @Override
    public String toString() {
        String result = "Flight from: " + departure.getCity() + " - " +departure.getCountry() +  " to: "
                + arrival.getCity() + " - " + arrival.getCountry();

        if (transfer == null){
            result += ", no stopovers.";
        } else {
            result += ", stopovers in: "+ transfer.get(0).getCity() + " - " +  transfer.get(0).getCountry();
            for (int i=1; i<transfer.size(); i++){
                result += ", " + transfer.get(i).getCity() + " - " + transfer.get(i).getCountry();
            }
            result +=".";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (departure != null ? !departure.equals(flight.departure) : flight.departure != null) return false;
        if (arrival != null ? !arrival.equals(flight.arrival) : flight.arrival != null) return false;
        return transfer != null ? transfer.equals(flight.transfer) : flight.transfer == null;
    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        result = 31 * result + (transfer != null ? transfer.hashCode() : 0);
        return result;
    }
}
