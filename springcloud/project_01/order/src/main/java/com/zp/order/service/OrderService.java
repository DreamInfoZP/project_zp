package com.zp.order.service;


import com.zp.order.dto.OrderDTO;


public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
