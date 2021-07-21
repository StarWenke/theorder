package com.wk.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wk.controller.CommodityController;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
public interface OrderService extends IService<Order> {

    List<OrderCommodityUser> getgetOrderList(Integer userId);

    //查询单个订单
    SpringDataJaxb.OrderDto findOne(int o_id);

    //取消订单
    SpringDataJaxb.OrderDto cancel(SpringDataJaxb.OrderDto orderDto);
}
