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

//    @Override
//    public Order cancelOrder(Integer oId) {
//       Order order = checkOrder(oId);
//       if (order == null){
//           log.error("【取消订单】查不到该订单, oId={}",oId);
//           throw new SellException(ResultEnum.ORDER_NOT_EXIST);
//       }
//       return orderService.cancel(order);
//    }

    @Override
    public Order findOrderOne(Integer oId) {
        return checkOrder(oId);
    }


    private Order checkOrder(Integer oId){
        Order order = orderService.findOne(oId);
        if (order == null){
            return null;
        }

        if (!order.getOId().equals(oId)){
            log.error("【查询订单】订单id不一致");
            throw new SellException(ResultEnum.ORDER_EMPTY);
        }
        return order;
    }

}
