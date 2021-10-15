package cn.edu.xmu.restfuldemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "订单明细")
public class OrderItemVo {

    @ApiModelProperty(value = "商品SKU id")
    private Integer skuId;

    @ApiModelProperty(value = "明细中购买商品数量")
    private Integer quantity;

    @ApiModelProperty(value = "优惠活动id")
    private Integer couponActId;

    public OrderItem createOrderItem()
    {
        OrderItem orderItem=new OrderItem();
        orderItem.setskuId(this.skuId);
        orderItem.setquantity(this.quantity);
        orderItem.setcouponActId(this.couponActId);
        return orderItem;
    }
}
