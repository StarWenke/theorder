package com.wk;



import com.wk.entity.Order;
import com.wk.service.OrderService;

import org.junit.jupiter.api.Test;
import org.springframework.data.domain.jaxb.SpringDataJaxb;


public class CancelOrderTest {

    @Test
    public void cancel() throws Exception{
        Order order = OrderService.findOne(1);
        Order result = OrderService.cancel(order);
    }
}
