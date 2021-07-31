package com.wk.service;


import com.wk.entity.Order;
import com.wk.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
public interface UserService extends IService<User> {

   // Order cancelOrder(Integer o_id);

    Order findOrderOne(Integer o_id);
}
