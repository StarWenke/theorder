package com.wk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

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
@ApiModel(value="Commodity对象", description="")
@AllArgsConstructor
@NoArgsConstructor
public class Commodity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品id")
    @TableId(value = "c_id", type = IdType.AUTO)
    @Id
    private Integer cId;

    @ApiModelProperty(value = "商品名称")
    @TableField("c_name")
    private String cName;

    @ApiModelProperty(value = "商品类型")
    @TableField("c_type")
    private String cType;

    @ApiModelProperty(value = "商品数量")
    @TableField("c_num")
    private Integer cNum;

    @ApiModelProperty(value = "商品单价")
    @TableField("c_price")
    private Double cPrice;


}
