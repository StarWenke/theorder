package com.wk.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;


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
   static Order findOne(int o_id){
    return null;
   }

    //取消订单
    static Order cancel(Order order) {

       return null;
    }
}
