package com.wk.dto;


import lombok.Data;


@Data
public class OrderDto {

    /** 订单id. */
    private int o_id;

    /** 买家名字. */
    private String u_name;

    /** 买家手机号. */
    private String u_phone;

    /** 买家地址. */
    private String u_address;


    /** 订单总金额. */
    private String o_sum;

    /** 订单状态, 默认为0新下单. */
    private Integer o_status;



}
