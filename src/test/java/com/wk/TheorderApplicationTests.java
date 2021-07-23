package com.wk;

import com.wk.entity.OrderCommodityUser;
import com.wk.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TheorderApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
    }

}
