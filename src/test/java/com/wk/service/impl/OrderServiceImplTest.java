package com.wk.service.impl;

import com.wk.dto.OrderDTO;

import com.wk.entity.Order;
import com.wk.enums.OrderStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final Integer ORDER_ID =1 ;

    @Test
    void getOrderList() {
    }

    @Test
    void findOne() {
    }

    @Test
    public void cancel() {
        OrderDTO orderDTO = orderService.findOne2(ORDER_ID);
        OrderDTO result = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),result.getStatus());

    }

    @Test
    void createOrder() {
    }

    @Test
    void orderExpired() {
    }

    @Test
    void orderExpiredRedisSet() {
    }

    @Test
    void getOrderListByStatus() {
    }
}