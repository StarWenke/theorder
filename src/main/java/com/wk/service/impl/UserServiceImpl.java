package com.wk.service.impl;

import com.wk.entity.Order;
import com.wk.entity.User;
import com.wk.mapper.UserMapper;
import com.wk.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public Order cancelOrder(Integer o_id) {
        return null;
    }

    @Override
    public Order findOrderOne(Integer o_id) {
        return null;
    }
}
