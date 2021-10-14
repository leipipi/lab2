package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class goods_sku {
    private Integer id;
    private Integer goods_spu_id;
    private String sku_sn;
    private String name;
    private Integer original_price;
    private String configuration;
    private Integer weight;
    private String image_url;
    private Integer inventory;
    private String detail;
    private Integer disavled;
    private Date gmt_create;
    private Date gmt_modified;
    private Integer state;
}
