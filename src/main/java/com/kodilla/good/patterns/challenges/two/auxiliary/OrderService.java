package com.kodilla.good.patterns.challenges.two.auxiliary;

import com.kodilla.good.patterns.challenges.two.Product;
import com.kodilla.good.patterns.challenges.two.User;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, Product product, LocalDateTime date, double payment);
}
