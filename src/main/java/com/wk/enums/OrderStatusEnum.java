package com.wk.enums;


import lombok.Getter;

//关于订单状态
@Getter
public enum OrderStatusEnum implements CodeEnum{

    NEW(0,"新订单（未支付）"),
    FINISHED(1,"订单已支付"),
    CANCEL(2,"订单取消"),
    DELAYED(3,"订单超时");

    private Integer code;
    private String message;

    OrderStatusEnum (Integer code,String message){
        this.code = code;
        this.message=message;
    }

    @Override
    public Integer getCode() {
        return null;
    }
}
