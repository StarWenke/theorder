package com.wk.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wk.entity.Commodity;
import com.wk.entity.Order;
import com.wk.entity.OrderCommodityUser;
import com.wk.entity.constants.OrderConstants;
import com.wk.global.util.RedisOrderNoGenerate;
import com.wk.global.util.RedisUtils;
import com.wk.mapper.OrderMapper;
import com.wk.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    IService<Commodity> iService;

    @Autowired
    private RedisOrderNoGenerate redisOrderNoGenerate;

    /**
     * 获取某个用户所有订单数据
     * @param userId 用户id
     * @author Makonike
     * @date 2021/7/23 11:23
     */
    @Override
    public List<OrderCommodityUser> getOrderList(Integer userId) {
        return orderMapper.getOrderList(userId);
    }

    @Override
    public Order findOne(int o_id) {
        return null;
    }



    @Override
    public Order cancel(Order order) {
        return null;
    }



    /**
     * 创建订单
     * @param uId 用户id
     * @param cId 商品id
     * @return Order
     */
    @Override
    public boolean createOrder(Integer uId, Integer cId) throws Exception {
        String oNo = redisOrderNoGenerate.getOrderNo();
        Order order=new Order();
        order.setONo(oNo);
        order.setUId(uId);
        order.setCId(cId);
        Commodity commodity = iService.getById(cId);
        order.setTotalAmount(commodity.getCNum() * commodity.getCPrice());
        order.setStatus(0);
        boolean rows = orderMapper.insertOrder(order);
        if (!rows) {
            throw new Exception("创建订单失败！");
        }
        orderExpiredRedisSet(oNo);
        return true;
    }

    /**
     * 处理订单过期，如果是未支付状态则更新订单状态为订单过期
     * @param oNo 订单编号
     * @author Makonike
     * @date 2021/7/23 12:01
     */
    @Override
    public boolean orderExpired(String oNo) {
        return orderMapper.orderExpired(oNo,new Date());
    }

    /**
     * 将编号插入redis，设定过期时长为30分钟
     * @param oNo 订单编号
     * @author Makonike
     * @date 2021/7/23 12:42
     */
    @Override
    public boolean orderExpiredRedisSet(String oNo) {
        return redisUtils.set(OrderConstants.ORDER_REDIS_KEY + oNo, 1, OrderConstants.ORDER_OVER_TIME);
    }

    /**
     * 查询某个用户指定订单状态的订单数据
     * @param userId 用户Id
     * @param status 指定的订单状态 0-未支付，1-已支付，2-已取消，3-支付超时
     * @author Makonike
     * @date 2021/7/22 22:55
     */
    @Override
    public List<OrderCommodityUser> getOrderListByStatus(Integer userId, Integer status) {
        return orderMapper.getOrderListByStatus(userId, status);
    }
}
