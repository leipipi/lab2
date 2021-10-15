package cn.edu.xmu.restfuldemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "订单")
public class Orders {
    @ApiModelProperty(value = "订单id")
    private Integer id;
}
