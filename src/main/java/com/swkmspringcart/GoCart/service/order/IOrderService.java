package com.swkmspringcart.GoCart.service.order;

import com.swkmspringcart.GoCart.dto.OrderDto;
import com.swkmspringcart.GoCart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
