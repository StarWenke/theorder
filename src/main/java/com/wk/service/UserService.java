package com.wk.service;


import com.wk.entity.Order;
import com.wk.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
public interface UserService {

    //取消订单
    Order cancelOrder( Integer o_id);

     //查询一个订单
    Order findOrderOne(Integer o_id);
}
