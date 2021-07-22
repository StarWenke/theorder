package com.wk.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wk.controller.CommodityController;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.apache.ibatis.annotations.Param;

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

    boolean orderExpired(Integer oId);

    List<OrderCommodityUser> getOrderListByCondition(Integer userId,String condition);

    //查询单个订单
    SpringDataJaxb.OrderDto findOne(int o_id);

    //取消订单
    SpringDataJaxb.OrderDto cancel(SpringDataJaxb.OrderDto orderDto);

    //插入订单，创建订单
    Integer insertOrder(Order order) throws Exception;
    Order createOrder(Integer o_id,Integer o_user,Integer o_commodity,String o_condition) throws Exception;
}
