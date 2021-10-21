package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.util.ArrayList;
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
    private String order_sn;
    private Integer pid;
    private Integer order_type;
    private Integer state;
    private Integer substate;
    private Integer be_deleted;
    private Date gmt_create;
    private Date gmt_modified;
    private Date confirm_time;
    private Integer origin_price;
    private Integer discount_price;
    private Integer freight_price;
    private Integer rebate_num;
    private String message;
    private Integer region_id;
    private String address;
    private String mobile;
    private String consignee;
    private Integer coupon_id;
    private Integer groupon_id;
    private Integer presale_id;
    private String shipment_sn;
    private List<OrderItemRetVo> orderItems;

    OrdersRetVo(Orders orders){
        this.id=orders.getId();
        this.order_sn=orders.getOrderSn();
        this.pid=orders.getPid();
        this.order_type=orders.getOrderType();
        this.state=orders.getState();
        this.substate=orders.getSubState();
        this.be_deleted=orders.getBeDeleted();
        this.gmt_create=orders.getGmtCreate();
        this.gmt_modified=orders.getGmtModified();
        this.confirm_time=orders.getConfirmTime();
        this.origin_price=orders.getOriginPrice();
        this.discount_price=orders.getDiscountPrice();
        this.freight_price=orders.getFreightPrice();
        this.rebate_num=orders.getRebateNum();
        this.message= orders.getMessage();
        this.region_id=orders.getRegionId();
        this.address=orders.getAddress();
        this.mobile=orders.getMobile();
        this.consignee=orders.getConsignee();
        this.coupon_id=orders.getCouponId();
        this.groupon_id=orders.getGrouponId();
        this.presale_id=orders.getPresaleId();
        this.shipment_sn=orders.getShipmentSn();
        if(null!=orders.getOrderItemsList())
        {
            List<OrderItemRetVo> orderItemRetVoList=new ArrayList<>(orders.getOrderItemsList().size());
            for(OrderItem orderItem:orders.getOrderItemsList())
            {
                OrderItemRetVo orderItemRetVo=new OrderItemRetVo(orderItem);
                orderItemRetVoList.add(orderItemRetVo);
            }
            this.orderItems=orderItemRetVoList;
        }
    }


}
