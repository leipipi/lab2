package cn.edu.xmu.restfuldemo.bean;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class OrderItemRetVo {
    private static Logger logger = LoggerFactory.getLogger(OrdersRetVo.class);
    private Integer skuId;
    private Integer orderId;
    private String name;
    private Integer quantity;
    private Integer price;
    private Integer discount;
    private Integer coupoActId;
    private Integer beSharedId;
    public OrderItemRetVo(OrderItem orderItem)
    {
        this.skuId=orderItem.getSkuId();
        this.orderId=orderItem.getOrderId();
        this.name=orderItem.getName();
        this.quantity=orderItem.getQuantity();
        this.price=orderItem.getPrice();
        this.discount=orderItem.getDiscount();
        this.coupoActId=orderItem.getCouponActId();
        this.beSharedId=orderItem.getBeShareId();
    }
}
