package com.wk.controller;


import com.wk.entity.Order;
import com.wk.global.entity.dto.JsonResponse;
import com.wk.global.util.RedisOrderNoGenerate;
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

    @Autowired
    RedisOrderNoGenerate redisOrderNoGenerate;

    @GetMapping("/{userId}")
    public JsonResponse getOrderList(@PathVariable("userId") @NotNull Integer userId){
        return new JsonResponse().data(orderService.getOrderList(userId));
    }

    @GetMapping("/{userId}/{status}")
    public JsonResponse getOrderListByStatus(@PathVariable("userId") @NotNull Integer userId,
                                                @PathVariable("status") @NotNull Integer status){
        return new JsonResponse().data(orderService.getOrderListByStatus(userId, status));
    }

    @GetMapping("/createOrder")
    public JsonResponse createOrder(@RequestParam("o_no") String o_no,
                                    @RequestParam("u_id") Integer u_id,
                                    @RequestParam("c_id") Integer c_id,
                                    @RequestParam("total_amount") double total_amount

    ) throws Exception {
        Order order =orderService.createOrder(redisOrderNoGenerate.getOrderNo(),u_id,c_id,total_amount);
        return new JsonResponse().data(order);
    }


}

