package com.wk.controller;


import com.wk.global.entity.dto.JsonResponse;
import com.wk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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


}

