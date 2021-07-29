package com.wk;



import com.wk.entity.Order;
import com.wk.enums.OrderStatusEnum;
import com.wk.service.impl.OrderServiceImpl;
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
public class CancelOrderTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Test
    public void cancel() throws Exception{
        Order order = orderService.findOne(1);
        Order result = orderService.cancel(order);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(), result.getStatus());
    }
}
