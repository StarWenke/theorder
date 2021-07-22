package com.wk.global.listener;

import com.wk.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

/**
 * @author Makonike
 * @date 2021/7/21
 */
@Component
@Slf4j
public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {

    @Autowired
    OrderService orderService;

    /**
     * 需要修改redis配置
     * 将默认配置notify-keyspace-events的值为"",修改为 notify-keyspace-events Ex
     * @param container
     */
    public RedisKeyExpirationListener(RedisMessageListenerContainer container) {
        super(container);
    }
 
    /**
     * 针对redis数据失效事件，进行数据处理
     * @param message
     * @param pattern
     */
    @Override
    public void onMessage(Message message, byte[] pattern) {
        //生效的key
       String key=message.toString();
        //从失效key中筛选代表订单失效的key
        if (key!=null && key.startsWith("order")){
            //截取订单号，查询订单，如果是未支付状态则取消订单
            String orderNo = key.substring(5);
            log.info("订单号为：{} 的订单超时未支付，取消订单",orderNo);
            orderService.orderExpired(Integer.parseInt(orderNo));
        }
    }
}