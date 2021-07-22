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
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * 
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Order对象", description="")
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId(value = "o_id", type = IdType.AUTO)
    private Integer o_id;

    @TableField("o_createTime")
    private Date o_createTime;

    @ApiModelProperty(value = "下单的用户")
    private Integer o_user;

    @ApiModelProperty(value = "下单的商品")
    private Integer o_commodity;

    @ApiModelProperty(value = "订单状态")
    private String o_condition;


}
