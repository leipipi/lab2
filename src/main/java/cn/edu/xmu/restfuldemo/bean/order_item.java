package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class order_item {
    private int id;
    private int order_id;
    private int goods_sku_id;
    private int quantity;
    private int price;
    private int discount;
    private String name;
    private int coupon_activity_id;
    private int be_share_id;
    private Date gmt_create;
    private Date gmt_modified;
}
