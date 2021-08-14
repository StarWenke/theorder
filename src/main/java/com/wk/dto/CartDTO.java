package com.wk.dto;

import lombok.Data;

//订单中的商品
@Data
public class CartDTO {

    private Integer commodityId;
    private Integer commodityQuantity;

    public CartDTO(Integer commodityId,Integer commodityQuantity){
        this.commodityId = commodityId;
        this.commodityQuantity = commodityQuantity;
    }

}
