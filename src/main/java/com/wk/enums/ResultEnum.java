package com.wk.enums;

import lombok.Getter;

@Getter
//enum枚举？的使用
public enum ResultEnum {

    ORDER_CANCEL_SUCCESS(22, "订单取消成功"),
    ORDER_EMPTY(33,"订单未找到"),
    ORDER_UPDATE_FAIL(44,"订单更新失败"),
    ORDER_NOT_EXIST(55,"订单不存在"),
    COMMODITY_NOT_EXIST(66,"订单包含的信息不存在"),
    ORDER_STATUS_ERROR(77,"订单状态错误"),
    ORDER_DETAIL_EMPTY(88,"订单中无商品"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
