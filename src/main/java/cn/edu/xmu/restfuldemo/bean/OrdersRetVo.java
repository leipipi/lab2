package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 商品视图对象
 * @author Ming Qiu
 **/
@Data
public class OrdersRetVo{
    private static Logger logger = LoggerFactory.getLogger(OrdersRetVo.class);
    private Integer id;
    private String orderSn;
    private Integer pid;
    private Integer orderType;
    private Integer state;
    private Integer substate;
    private Integer beDelated;
    private Date gmtCreate;
    private Date gmtModified;
    private Date confirmTime;
    private Integer originPrice;
    private Integer discountPrice;
    private Integer freightPrice;
    private Integer rebateNum;
    private String message;
    private Integer regionId;
    private String address;
    private String mobile;
    private String consignee;
    private Integer couponId;
    private Integer grouponId;
    private Integer presaleId;
    private String shipmentSn;
    private List<OrderItemPo> orderItems;

    OrdersRetVo(Orders orders){
        this.id=orders.getId();
        this.orderSn=orders.getOrderSn();
        this.pid=orders.getPid();
        this.orderType=orders.getOrderType();
        this.state=orders.getState();
        this.substate=orders.getSubState();
        this.beDelated=orders.getBeDelated();
        this.gmtCreate=orders.getGmtCreate();
        this.gmtModified=orders.getGmtModified();
        this.confirmTime=orders.getConfirmTime();
        this.originPrice=orders.getOriginPrice();
        this.discountPrice=orders.getDiscountPrice();
        this.freightPrice=orders.getFreightPrice();
        this.rebateNum=orders.getRebateNum();
        this.message= orders.getMessage();
        this.regionId=orders.getRegionId();
        this.address=orders.getAddress();
        this.mobile=orders.getMobile();
        this.consignee=orders.getConsignee();
        this.couponId=orders.getCouponId();
        this.grouponId=orders.getGrouponId();
        this.presaleId=orders.getPresaleId();
        this.shipmentSn=orders.getShipmentSn();
        this.orderItems=orders.getOrderItems();
    }


}
