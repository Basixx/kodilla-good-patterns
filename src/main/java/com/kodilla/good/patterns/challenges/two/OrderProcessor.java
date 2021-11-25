package com.kodilla.good.patterns.challenges.two;

import com.kodilla.good.patterns.challenges.two.auxiliary.InformationService;
import com.kodilla.good.patterns.challenges.two.auxiliary.OrderService;
import com.kodilla.good.patterns.challenges.two.auxiliary.OrderRepository;

public class OrderProcessor {
    private OrderRepository orderRepository;
    private OrderService OrderService;
    private InformationService informationService;

    public OrderProcessor(OrderRepository orderRepository,
                          OrderService OrderService, InformationService informationService) {
        this.orderRepository = orderRepository;
        this.OrderService = OrderService;
        this.informationService = informationService;
    }

    public OrderDto process (final OrderRequest orderRequest){
        boolean isOrdered = OrderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getDate(), orderRequest.getPayment());
        if (isOrdered){
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getDate(), orderRequest.getPayment());
            informationService.inform(orderRequest.getUser());

            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
