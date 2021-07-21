package com.wk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="Commodity对象", description="")
@AllArgsConstructor
@NoArgsConstructor
public class Commodity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品id")
    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;

    @ApiModelProperty(value = "商品名称")
    private String cName;

    @ApiModelProperty(value = "商品类型")
    private String cType;

    @ApiModelProperty(value = "商品数量")
    private Integer cNum;

    @ApiModelProperty(value = "商品价格")
    private Integer cPrice;


}
