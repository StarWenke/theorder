package com.wk.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    private int o_id;
    private Date o_createTime;
    private int o_user;
    private int o_commodity;
    private String o_condition;
}
