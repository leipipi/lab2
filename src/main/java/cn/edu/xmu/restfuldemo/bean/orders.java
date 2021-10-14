package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class orders {
    private int id;
    private int customer_id;
    private int shop_id;
    private String order_sn;
    private int pid;
    private String consignee;
    private int region_id;
    private String address;
    private String mobile;
    private String message;
    private int order_type;
    private int freight_price;
    private int coupon_id;
    private int coupon_activity_id;
    private int discount_price;
    private int origin_price;
    private int presale_id;
    private int groupon_discount;
    private int rebate_num;
    private Date confirm_time;
    private String shipment_sn;
    private int state;
    private int substate;
    private int be_delated;
    private Date gmt_create;
    private Date gmt_modified;
    private int groupon_id;
}
