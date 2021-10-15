package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemPo {
    private Integer id;
    private Integer order_id;
    private Integer goods_sku_id;
    private Integer quantity;
    private Integer price;
    private Integer discount;
    private String name;
    private Integer coupon_activity_id;
    private Integer be_share_id;
    private Date gmt_create;
    private Date gmt_modified;
}
