package com.swkmspringcart.GoCart.service.cart;

import com.swkmspringcart.GoCart.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
}
