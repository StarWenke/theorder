package com.wk.service.impl;

import com.wk.entity.Order;
import com.wk.entity.User;
import com.wk.enums.ResultEnum;
import com.wk.exception.SellException;
import com.wk.mapper.UserMapper;
import com.wk.service.OrderService;
import com.wk.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private OrderService orderService;

    @Override
    public Order cancelOrder(Integer o_id) {
       Order order = checkOrder(o_id);
       if (order == null){
           log.error("【取消订单】查不到改订单, o_id={}",o_id);
           throw new SellException(ResultEnum.ORDER_NOT_EXIST);
       }
       return orderService.cancel(order);
    }

    @Override
    public Order findOrderOne(Integer o_id) {
        return checkOrder(o_id);
    }

    private Order checkOrder(Integer o_id){
        Order order = orderService.findOne(o_id);
        if (order == null){
            return null;
        }

        if (!order.getOId().equals(o_id)){
            log.error("【查询订单】订单id不一致");
            throw new SellException(ResultEnum.ORDER_EMPTY);
        }
        return order;
    }

}
