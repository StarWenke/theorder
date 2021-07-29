package com.wk.controller;


import com.wk.entity.Order;
import com.wk.enums.ResultEnum;
import com.wk.exception.SellException;
import com.wk.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/seller/order") // 将订单的管理事项，交由seller（卖家）管理
@Slf4j
public class AboutOrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/cancel")
    public ModelAndView cancel(@RequestParam("o_id") int o_id, Map<String,Object> map){
        try{
            Order order = orderService.findOne(o_id);
            orderService.cancel(order);
        } catch(SellException e){
            log.error("!!卖家取消订单!!发生异常{}",e);
            map.put("msg", e.getMessage());
            map.put("url","/seller/order/list");
            return new ModelAndView("common/error",map);
        }
        map.put("msg", ResultEnum.ORDER_CANCEL_SUCCESS.getMessage());
        map.put("url","/seller/order/list");
        return new ModelAndView("common/success");
    }

}
