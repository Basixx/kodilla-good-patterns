package com.kodilla.good.patterns.challenges.four;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private List<Flight> flightList = new ArrayList<>();

    public void addFlight(Airport departure, Airport arrival, List <Airport> transfer){
        flightList.add(new Flight(departure, arrival, transfer));
    }

    public void flightsFrom (Airport departure){
        System.out.println("All flights from " + departure.getCity() + ", " +departure.getCountry() + ":");
        flightList.stream().filter(e -> e.getDeparture().equals(departure)).forEach(System.out::println);
    }

    public void flightsTo (Airport arrival){
        System.out.println("All flights to " + arrival.getCity() + ", " +arrival.getCountry() + ":");
        flightList.stream().filter(e -> e.getArrival().equals(arrival)).forEach(System.out::println);
    }

    public void flightsWithTransfers (Airport departure, Airport arrival, List<Airport> stopover) {
        System.out.print("Searching for flights from " + departure.getCity() + " - " + departure.getCountry() +
                ", to " + arrival.getCity() + " - " + arrival.getCountry() + " with stopovers at ");

        for (int i = 0; i < stopover.size(); i++) {
            System.out.println(stopover.get(i).getCity() + " - " + stopover.get(i).getCountry() + ": ");
        int a =i;

            flightList.stream().filter(e -> (e.getDeparture().equals(departure)) && (e.getArrival().equals(arrival))
            && e.getTransfer().contains(stopover.get(a))).forEach(System.out::println);
        }
    }
}

