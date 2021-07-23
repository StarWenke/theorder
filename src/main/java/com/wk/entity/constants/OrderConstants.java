package com.wk.entity.constants;

/**
 * @author Makonike
 * @date 2021-07-23 12:24
 **/
public class OrderConstants {

    /**
     * redis-key前缀
     */
    public static final String ORDER_REDIS_KEY = "order";

    /**
     * 设定过期时间为30分钟
     */
    public static final Long ORDER_OVER_TIME = 60L * 30L;
}
