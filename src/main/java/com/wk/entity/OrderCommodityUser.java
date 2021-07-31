package com.wk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * @author Makonike
 * @date 2021-07-20 12:58
 **/
@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderCommodityUser extends Order{

    private Commodity commodity;
    private User user;

}
