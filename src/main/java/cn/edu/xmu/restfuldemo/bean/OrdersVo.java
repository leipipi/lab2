package cn.edu.xmu.restfuldemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/*
* 接收POST请求，接收创建新订单时收到的值
* */
@Data
@ApiModel(description = "订单")
public class OrdersVo {
    @ApiModelProperty(value = "订单明细")
    private List<OrderItemVo> orderItemsList;
  
    @ApiModelProperty(value = "收货人")
    private String consignee;

    @ApiModelProperty(value = "地区id")
    private Integer regionId;

    @ApiModelProperty(value = "详细收货地址")
    private String address;

    @ApiModelProperty(value = "联系电话")
    private String mobile;

    @ApiModelProperty(value = "附言")
    private String message;

    @ApiModelProperty(value = "使用的优惠券Id")
    private Integer couponId;

    @ApiModelProperty(value = "预售活动id")
    private Integer presaleId;

    @ApiModelProperty(value = "团购活动id")
    private Integer grouponId;

    public Orders createOrders()
    {
        Orders orders=new Orders();
        orders.setConsignee(this.consignee);
        orders.setRegionId(this.regionId);
        orders.setAddress(this.address);
        orders.setMobile(this.mobile);
        orders.setCouponId(this.couponId);
        orders.setPresaleId(this.presaleId);
        orders.setGrouponId(this.grouponId);
        if(null!=this.orderItemsList)
        {
            List<OrderItem> newOrderItem=new ArrayList<>(this.orderItemsList.size());
            for(OrderItemVo orderItemVo:this.orderItemsList)
            {
                OrderItem orderItem=orderItemVo.createOrderItem();
                newOrderItem.add(orderItem);
            }
            orders.setOrderItems(newOrderItem);
        }
        return orders;
    }
}
