package com.wk.entity;

import lombok.Data;

/**
 * @author Makonike
 * @date 2021-07-20 12:58
 **/
@Data
public class OrderCommodityUser extends Order{

    private Commodity commodity;
    private User user;

}
