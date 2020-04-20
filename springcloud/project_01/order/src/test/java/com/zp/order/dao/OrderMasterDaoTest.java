package com.zp.order.dao;
import java.math.BigDecimal;
import java.util.Date;

import com.zp.order.OrderApplicationTests;
import com.zp.order.domain.OrderMaster;
import com.zp.order.enums.OrderStatusEnum;
import com.zp.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class OrderMasterDaoTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterDao orderMasterDao;

    @Test
    public void testSave() {

        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("猪八戒");
        orderMaster.setBuyerPhone("18989897878");
        orderMaster.setBuyerAddress("asasa");
        orderMaster.setBuyerOpenid("100100110");
        orderMaster.setOrderAmount(new BigDecimal("225.6"));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());

        OrderMaster orderMaster1 = orderMasterDao.save(orderMaster);
        Assert.assertNotNull(orderMaster1);
    }

}