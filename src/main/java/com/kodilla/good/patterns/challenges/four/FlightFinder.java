package com.kodilla.good.patterns.challenges.four;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightFinder {
    private Set<Flight> flightSet = new HashSet<>();

    public void addFlight(Airport departure, Airport arrival, List <Airport> transfer){
        flightSet.add(new Flight(departure, arrival, transfer));
    }

    public void flightsFrom (Airport departure){
        System.out.println("All flights from " + departure.getCity() + ", " +departure.getCountry() + ":");
        flightSet.stream().filter(e -> e.getDeparture().equals(departure)).forEach(System.out::println);
    }

    public void flightsTo (Airport arrival){
        System.out.println("All flights to " + arrival.getCity() + ", " +arrival.getCountry() + ":");
        flightSet.stream().filter(flight -> flight.getArrival().equals(arrival)).forEach(System.out::println);
    }

    public void flightsWithTransfers (Airport departure, Airport arrival, List<Airport> stopover) {
        System.out.print("Searching for flights from " + departure.getCity() + " - " + departure.getCountry() +
                ", to " + arrival.getCity() + " - " + arrival.getCountry() + " with stopovers at ");

        for (int i = 0; i < stopover.size(); i++) {
            System.out.println(stopover.get(i).getCity() + " - " + stopover.get(i).getCountry() + ": ");

            int finalI = i; //bez inicjalizacji "i" wyrzuca błąd
            flightSet.stream().filter(flight -> (flight.getDeparture().equals(departure)) && (flight.getArrival().equals(arrival))
            && flight.getTransfer().contains(stopover.get(finalI))).forEach(System.out::println);
        }
    }
}

