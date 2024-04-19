package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.CreateOrderRequest;
import com.lcwd.electronic.store.dtos.OrderDto;
import com.lcwd.electronic.store.dtos.PageableResponse;

import java.util.List;

public interface OrderService {
   //create order
    OrderDto createOrder(CreateOrderRequest orderDto);
   //remove order
    void removeOrder(String orderId);


    //get orders of user

    List<OrderDto> getOrdersOfUser(String userId);

    //get orders
    PageableResponse<OrderDto> getOrders(int pagenumber,int pageSize,String sortBy,String sortDir);

    //other methods(logic) related o order
}