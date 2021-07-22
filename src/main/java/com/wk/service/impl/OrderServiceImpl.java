package com.wk.service.impl;

import com.wk.controller.CommodityController;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;
import com.wk.mapper.OrderMapper;
import com.wk.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public SpringDataJaxb.OrderDto findOne(int o_id) {
        return null;
    }

    @Override
    public SpringDataJaxb.OrderDto cancel(SpringDataJaxb.OrderDto orderDto) {
        return null;
    }


    @Override
    public Integer insertOrder(Order order) throws Exception {
        Integer rows = orderMapper.insertOrder(order);
        if (rows != 1) {
            throw new Exception("创建订单失败！插入订单数据时出现未知错误，请联系系统管理员！");
        }
        return rows;
    }

    @Override
    public Order createOrder(Integer o_id,Integer o_user,Integer o_commodity,String o_condition) throws Exception {
        Date now = new Date();
        Order order=new Order();
        order.setO_id(o_id);
        order.setO_user(o_user);
        order.setO_createTime(now);
        order.setO_condition(o_condition);
        order.setO_commodity(o_commodity);
        insertOrder(order);
        return order;
    }
}
