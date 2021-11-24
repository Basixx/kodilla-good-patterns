package com.kodilla.good.patterns.challenges.two;

public class OrderProcessor {
    private ProductOrderRepository productOrderRepository;
    private ProductOrderService productOrderService;
    private UserInformation userInformation;

    public OrderProcessor(ProductOrderRepository productOrderRepository,
                          ProductOrderService productOrderService, UserInformation userInformation) {
        this.productOrderRepository = productOrderRepository;
        this.productOrderService = productOrderService;
        this.userInformation = userInformation;
    }

    public OrderDto process (final OrderRequest orderRequest){
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getDate(), orderRequest.getPayment());
        if (isOrdered){
            productOrderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getDate(), orderRequest.getPayment());
            userInformation.inform(orderRequest.getUser());

            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        }
        else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
