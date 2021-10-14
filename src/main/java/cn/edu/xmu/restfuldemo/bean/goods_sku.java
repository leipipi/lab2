package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class goods_sku {
    private int id;
    private int goods_spu_id;
    private String sku_sn;
    private String name;
    private int original_price;
    private String configuration;
    private int weight;
    private String image_url;
    private int inventory;
    private String detail;
    private int disavled;
    private Date gmt_create;
    private Date gmt_modified;
    private int state;
}
