package com.wk.service;

import com.wk.dto.OrderDto;
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

    //取消订单
    static OrderDto cancelOrder(String c_id, String o_id) {
        return null;
    }

}
