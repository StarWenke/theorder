package com.wk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderMapper extends BaseMapper<Order> {

    boolean cancelOrder(Integer orderId);

    List<OrderCommodityUser> getOrderList(@Param("uId") Integer uId);

    boolean orderExpired(@Param("oNo") String oNo, @Param("date")Date date);

    List<OrderCommodityUser> getOrderListByStatus(@Param("uId") Integer uId, @Param("status") Integer status);

    boolean insertOrder(Order order);
}
