package com.wk.dto;

import com.wk.entity.Order;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {

    private Integer oId;
    private String oNo;
    private Integer uId;
    private Integer cID;
    private Double totalAmount;
    private Date createTime;
    private Date updateTime;
    private Integer status;

    List<Order> orderList;
}
