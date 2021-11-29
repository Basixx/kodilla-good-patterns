package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.four.Airport;
import com.kodilla.good.patterns.challenges.four.Flight;
import com.kodilla.good.patterns.challenges.four.FlightFinder;
import com.kodilla.good.patterns.challenges.one.MovieStore;
import com.kodilla.good.patterns.challenges.three.FoodRequest;
import com.kodilla.good.patterns.challenges.three.supliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.three.supliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.three.supliers.HealthyShop;
import com.kodilla.good.patterns.challenges.three.Service;
import com.kodilla.good.patterns.challenges.two.*;

import java.util.Arrays;
import java.util.List;


public class GoodPatterns {
    public static void main(String[] args) {

        //first task
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore);
        System.out.println();

        //second task
        ProductOrderRetriever productOrderRetriever = new ProductOrderRetriever();
        OrderRequest request = productOrderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderRepository(),
                new ProductOrderService(new ProductOrderRepository()), new UserInformation());
        orderProcessor.process(request);

        //third task
        System.out.println();
        Service service = new Service();

        HealthyShop healthyShop = new HealthyShop();
        healthyShop.setHealthyShop();

        FoodRequest foodRequest1 = new FoodRequest(healthyShop, "bread", 4);
        service.order(foodRequest1, healthyShop);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.setGlutenFreeShop();

        FoodRequest foodRequest2 = new FoodRequest(glutenFreeShop, "potato", 2);
        service.order(foodRequest2, glutenFreeShop);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.setExtraFoodShop();

        FoodRequest foodRequest3 = new FoodRequest(extraFoodShop, "pork", 35);
        service.order(foodRequest3, extraFoodShop);

        //fourth task
        Airport warsaw = new Airport("Warsaw", "Poland");
        Airport berlin = new Airport("Berlin", "Germany");
        Airport paris = new Airport("Paris", "France");
        Airport madrid = new Airport("Madrid", "Spain");
        Airport london = new Airport("London", "UK");
        Airport oslo = new Airport("Oslo", "Norway");
        Airport rome = new Airport("Rome", "Italy");
        Airport copenhagen = new Airport("Copenhagen", "Denmark");

        List<Airport> transfer1 = Arrays.asList(paris, berlin);
        List<Airport> transfer2 = Arrays.asList(london);
        List<Airport> transfer3 = Arrays.asList(copenhagen);
        List<Airport> transfer4 = Arrays.asList(paris, london);

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight(warsaw, berlin, transfer2);
        flightFinder.addFlight(madrid, warsaw, transfer1);
        flightFinder.addFlight(rome, oslo, transfer1);
        flightFinder.addFlight(warsaw, copenhagen, null);
        flightFinder.addFlight(rome, berlin, transfer4);
        flightFinder.addFlight(london, oslo, transfer3);
        flightFinder.addFlight(madrid, copenhagen, transfer2);
        flightFinder.addFlight(rome, oslo, transfer4);

        List<Airport> searchedTransfer = Arrays.asList(paris);

        flightFinder.flightsFrom(warsaw);
        System.out.println();
        flightFinder.flightsTo(berlin);
        System.out.println();
        flightFinder.flightsWithTransfers(rome, oslo, searchedTransfer);

    }
}
