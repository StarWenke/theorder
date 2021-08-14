package com.wk.controller;


import com.wk.entity.Order;
import com.wk.global.entity.dto.JsonResponse;
import com.wk.global.util.RedisOrderNoGenerate;
import com.wk.service.OrderService;
import com.wk.utils.ResultVOUtil;
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
        return new JsonResponse().data(orderService.getOrderList(userId));
    }

    @GetMapping("/{userId}/{status}")
    public JsonResponse getOrderListByStatus(@PathVariable("userId") @NotNull Integer userId,
                                                @PathVariable("status") @NotNull Integer status){
        return new JsonResponse().data(orderService.getOrderListByStatus(userId, status));
    }

    @PostMapping("/createOrder")
    public JsonResponse createOrder(@RequestParam("userId") Integer uId,
                                    @RequestParam("commodityId") Integer cId
    ) throws Exception {
        return new JsonResponse().data(orderService.createOrder(uId,cId));
    }

//    @PostMapping("/cancelOrder/{orderId}")
//    public JsonResponse cancelOrder(@RequestParam(value = "orderId",required = false) @NotNull Integer orderId) throws Exception{
//        Order order = new Order();
//        orderService.findOne(orderId);
//        orderService.cancel(orderId);
//        order.setStatus(2);
//        return new JsonResponse().data(orderService.cancel(orderId));
//    }

}
