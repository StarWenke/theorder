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

    List<OrderCommodityUser> getOrderList(Integer userId);

    boolean orderExpired(String oNo);

    boolean orderExpiredRedisSet(String oNo);

    List<OrderCommodityUser> getOrderListByStatus(Integer userId, Integer status);

    //查询单个订单
    SpringDataJaxb.OrderDto findOne(int o_id);

    //取消订单
    SpringDataJaxb.OrderDto cancel(SpringDataJaxb.OrderDto orderDto);

    //创建订单
    Order createOrder(String o_no,Integer u_id,Integer c_id,double total_amount) throws Exception;



}
