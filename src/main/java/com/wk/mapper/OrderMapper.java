package com.wk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper extends BaseMapper<Order> {

    List<OrderCommodityUser> getOrderList(@Param("oUser") Integer oUser);

    boolean orderExpired(@Param("oId") Integer oId);

    List<OrderCommodityUser> getOrderListByCondition(@Param("oUser") Integer oUser, @Param("oCondition") String oCondition);

}
