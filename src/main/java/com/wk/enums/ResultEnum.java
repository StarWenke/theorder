package com.wk.enums;

import lombok.Getter;

@Getter
//enum枚举？的使用
public enum ResultEnum {

    ORDER_CANCEL_SUCCESS(22, "订单取消成功"),;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
