package com.zp.order.dao;
import java.math.BigDecimal;

import com.zp.order.OrderApplicationTests;
import com.zp.order.domain.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderDetailDaoTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    public void testSave(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123212");
        orderDetail.setOrderId("1232132");
        orderDetail.setProductId("1231");
        orderDetail.setProductName("好周到");
        orderDetail.setProductPrice(new BigDecimal("20.01"));
        orderDetail.setProductQuantity(0);
        orderDetail.setProductIcon("www.baidu.com");

        OrderDetail orderDetail1 = orderDetailDao.save(orderDetail);
        Assert.assertNotNull(orderDetail1);
    }
}