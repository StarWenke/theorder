package com.wk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * <p>
 * 
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Order对象", description="")
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId(value = "o_id", type = IdType.AUTO)
    @Id
    private Integer oId;

    @ApiModelProperty(value = "订单编号")
    @TableField("o_no")
    private String oNo;

    @ApiModelProperty(value = "下单的用户id")
    private Integer uId;

    @ApiModelProperty(value = "下单的商品id")
    private Integer cId;

    @ApiModelProperty(value = "商品总价")
    @TableField("total_amount")
    private Double totalAmount;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "订单状态")
    @TableField("status")
    private Integer status;

}
