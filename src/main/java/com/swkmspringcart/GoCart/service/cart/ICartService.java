package com.swkmspringcart.GoCart.service.cart;

import com.swkmspringcart.GoCart.dto.CartDto;
import com.swkmspringcart.GoCart.model.Cart;
import com.swkmspringcart.GoCart.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);

}
