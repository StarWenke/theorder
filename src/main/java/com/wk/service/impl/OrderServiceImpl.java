package com.wk.service.impl;

import com.wk.controller.CommodityController;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;
import com.wk.mapper.OrderMapper;
import com.wk.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderCommodityUser> getgetOrderList(Integer userId) {
        return orderMapper.getOrderList(userId);
    }

    @Override
    public boolean orderExpired(Integer oId) {
        return orderMapper.orderExpired(oId);
    }
}
