package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemPo {
    private Integer id;
    private Integer orderId;
    private Integer skuId;
    private Integer quantity;
    private Integer price;
    private Integer discount;
    private String name;
    private Integer couponActId;
    private Integer beShareId;
    private Date gmtCreate;
    private Date gmtModified;
}
