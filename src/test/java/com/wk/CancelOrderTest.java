package com.wk;


import com.wk.dto.OrderDto;
import com.wk.service.OrderService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CancelOrderTest {

    @Test
    public void cancel() throws Exception{
        OrderDto orderDto = OrderService.findOne(1);
        OrderDto result = OrderService.cancel(orderDto);
    }
}
