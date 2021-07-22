package com.wk.controller;


import com.wk.entity.Order;
import com.wk.global.entity.dto.JsonResponse;
import com.wk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/{userId}")
    public JsonResponse getOrderList(@PathVariable("userId") @NotNull Integer userId){
        return new JsonResponse().data(orderService.getgetOrderList(userId));
    }

    @GetMapping("/createOrder")
    public JsonResponse createOrder(@RequestParam("o_id") Integer o_id,
                                    @RequestParam("o_user") Integer o_user,
                                    @RequestParam("o_commodity") Integer o_commodity,
                                    @RequestParam("o_condition") String o_condition

    ) throws Exception {
        Order order =orderService.createOrder(o_id,o_user,o_commodity,o_condition);
        return new JsonResponse().data(order);
    }


}

