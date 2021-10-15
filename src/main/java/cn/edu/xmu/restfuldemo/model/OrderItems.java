package cn.edu.xmu.restfuldemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "订单明细")
public class OrderItems {

    @ApiModelProperty(value = "商品SKU id")
    private Integer skuId;

    @ApiModelProperty(value = "明细中购买商品数量")
    private Integer quantity;

    @ApiModelProperty(value = "优惠活动id")
    private Integer couponActId;
}
