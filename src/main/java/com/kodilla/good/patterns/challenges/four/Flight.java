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
        String result;
        result = "Flight from: " + departure.getCity() + " - " +departure.getCountry() +  " to: "
                + arrival.getCity() + " - " + arrival.getCountry();

        if (transfer == null){
            result += ", no stopovers.";
        } else {
            result += ", stopovers in: "+ transfer.get(0).getCity() + " - " +  transfer.get(0).getCountry();
            int i=1;
            while (i<transfer.size()){
                result += ", " + transfer.get(i).getCity() + " - " + transfer.get(i).getCountry();
                i++;
            }
            result +=".";
        }
        return result;
    }
}
