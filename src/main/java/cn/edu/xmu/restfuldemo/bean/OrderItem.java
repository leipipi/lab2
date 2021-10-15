package cn.edu.xmu.restfuldemo.bean;

import io.swagger.models.auth.In;

import java.util.Date;
import lombok.*;

public class OrderItem implements VoObject{
    @Override
    public Object createVo(){
        return new OrderItemRetVo(this);
    }

    public OrderItem(){this.orderItemPo=new OrderItemPo();}

    public OrderItem(OrderItemPo orderItemPo)
    {
        this.orderItemPo=orderItemPo;
    }



    private OrderItemPo orderItemPo;

    public Integer getId(){return orderItemPo.getId();}

    public void setId(Integer id){orderItemPo.setId(id);}

    public Integer getOrderId(){return orderItemPo.getOrderId();}
    
    public void setOrderId(Integer orderId){orderItemPo.setOrderId(orderId);}

    public Integer getSkuId(){return orderItemPo.getSkuId();}

    public void setSkuId(Integer goodsSkuId){orderItemPo.setSkuId(goodsSkuId);}

    public Integer getQuantity(){return orderItemPo.getQuantity();}

    public void setQuantity(Integer quantity){orderItemPo.setQuantity(quantity);}

    public Integer getPrice(){return orderItemPo.getPrice();}

    public void setPrice(Integer price){orderItemPo.setPrice(price);}

    public Integer getDiscount(){return orderItemPo.getDiscount();}

    public void setDiscount(Integer discount){orderItemPo.setDiscount(discount);}

    public String getName(){return orderItemPo.getName();}

    public void setName(String name){orderItemPo.setName(name);}

    public Integer getCouponActId(){return orderItemPo.getCouponActId();}

    public void setCouponActId(Integer couponActivityId){orderItemPo.setCouponActId(couponActivityId);}

    public Integer getBeShareId(){return orderItemPo.getBeShareId();}

    public void setBeShareId(Integer beShareId){orderItemPo.setBeShareId(beShareId);}

    public Date getGmtCreate(){return orderItemPo.getGmtCreate();}

    public void setGmtCreate(Date gmtCreate){orderItemPo.setGmtCreate(gmtCreate);}

    public Date getGmtModified(){return orderItemPo.getGmtModified();}

    public void setGmtModified(Date gmtModified){orderItemPo.setGmtModified(gmtModified);}

    public OrderItemPo getOrderItemPo(){return this.orderItemPo;}

}
