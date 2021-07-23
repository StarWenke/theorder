package com.wk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper extends BaseMapper<Order> {

    List<OrderCommodityUser> getOrderList(@Param("uId") Integer uId);

    boolean orderExpired(@Param("oId") Integer oId);

    List<OrderCommodityUser> getOrderListByStatus(@Param("uId") Integer uId, @Param("status") Integer status);

    Integer insertOrder(Order order);
}
