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


    List<OrderCommodityUser> getOrderList(Integer userId);



    //查询单个订单
    Order findOne(int o_id) ;

    //取消订单
   Order cancel(Order order) ;

    boolean createOrder(Integer uId, Integer cId) throws Exception;

    boolean orderExpired(String oNo);

    boolean orderExpiredRedisSet(String oNo);

    List<OrderCommodityUser> getOrderListByStatus(Integer userId, Integer status);
}
