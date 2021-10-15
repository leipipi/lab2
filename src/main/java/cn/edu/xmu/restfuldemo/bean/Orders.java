package cn.edu.xmu.restfuldemo.bean;

import io.swagger.models.auth.In;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Orders implements VoObject{
    @Override
    public Object createVo(){
        return new OrdersRetVo(this);
    }

    private OrdersPo ordersPo;

    private String shipment_sn;

    public Orders(){ordersPo=new OrdersPo();}

    public Orders(OrdersPo ordersPo){this.ordersPo=ordersPo;}

    public Integer getId(){return ordersPo.getId();}

    public void setId(Integer id){ordersPo.setId(id);}

    public Integer getCustomerId(){return ordersPo.getCustomer_id();}

    public void setCustomerId(Integer customerId){ordersPo.setCustomer_id(customerId);}

    public Integer getShopId(){return ordersPo.getShop_id();}

    public void setShopId(Integer shopId){ordersPo.setShop_id(shopId);}

    public String getOrderSn(){return ordersPo.getOrder_sn();}

    public void setOrderSn(String orderSn){ordersPo.setOrder_sn(orderSn);}

    public Integer getPid(){return ordersPo.getPid();}

    public void setPid(Integer pid){ordersPo.setPid(pid);}

    public String getConsignee(){return ordersPo.getConsignee();};

    public void setConsignee(String consignee){ordersPo.setConsignee(consignee);}

    public Integer getRegionId(){return ordersPo.getRegion_id();}

    public void setRegionId(Integer regionId){ordersPo.setRegion_id(regionId);}

    public String getAddress(){return ordersPo.getAddress();};

    public void setAddress(String address){ordersPo.setAddress(address);}

    public String getMobile(){return ordersPo.getMobile();}

    public void setMobile(String mobile){ordersPo.setMobile(mobile);}

    public String getMessage(){return ordersPo.getMessage();}

    public void setMessage(String message){ordersPo.setMessage(message);}

    public Integer getOrderType(){return ordersPo.getOrder_type();}

    public void setOrderType(Integer orderType){ordersPo.setOrder_type(orderType);}

    public Integer getFreightPrice(){return ordersPo.getFreight_price();}

    public void setFreightPrice(Integer freightPrice){ordersPo.setFreight_price(freightPrice);}

    public Integer getCouponId(){return ordersPo.getCoupon_id();}

    public void setCouponId(Integer couponId){ordersPo.setCoupon_id(couponId);}

    public Integer getCouponActivityId(){return ordersPo.getCoupon_activity_id();}

    public void setCouponActivityId(Integer couponActivityId){ordersPo.setCoupon_activity_id(couponActivityId);}

    public Integer getDiscountPrice(){return ordersPo.getDiscount_price();}

    public void setDiscountPrice(Integer discountPrice){ordersPo.setDiscount_price(discountPrice);}

    public Integer getOriginPrice(){return ordersPo.getOrigin_price();}

    public void setOriginPrice(Integer originPrice){ordersPo.setOrigin_price(originPrice);}

    public Integer getPresaleId(){return ordersPo.getPresale_id();}

    public void setPresaleId(Integer presaleId){ordersPo.setPresale_id(presaleId);}

    public Integer getGrouponDiscount(){return ordersPo.getGroupon_discount();}

    public void setGrouponDiscount(Integer grouponDiscount){ordersPo.setGroupon_discount(grouponDiscount);}

    public Integer getRebateNum(){return ordersPo.getRebate_num();}

    public void setRebateNum(Integer rebateNum){ordersPo.setRebate_num(rebateNum);}

    public Date getConfirmTime(){return ordersPo.getConfirm_time();}

    public void setConfirmTime(Date confirmTime){ordersPo.setConfirm_time(confirmTime);}

    public String getShipmentSn(){return ordersPo.getShipment_sn();}

    public void setShipmentSn(String shipmentSn){ordersPo.setShipment_sn(shipmentSn);}

    public Integer getState(){return ordersPo.getState();}

    public void setState(Integer state){ordersPo.setState(state);}

    public Integer getSubState(){return ordersPo.getSubstate();}

    public void setSubState(Integer subState){ordersPo.setSubstate(subState);}

    public Integer getBeDelated(){return ordersPo.getBe_delated();}

    public void setBeDelated(Integer beDelated){ordersPo.setBe_delated(beDelated);}

    public Date getGmtCreate(){return ordersPo.getGmt_create();}

    public void setGmeCreate(Date gmeCreate){ordersPo.setGmt_create(gmeCreate);}

    public Date getGmtModified(){return ordersPo.getGmt_modified();}

    public void setGmtModified(Date gmtModified){ordersPo.setGmt_modified(gmtModified);}

    public Integer getGrouponId(){return ordersPo.getGroupon_id();}

    public void setGrouponId(Integer grouponId){ordersPo.setGroupon_id(grouponId);}

    public List<OrderItemPo> getOrderItems(){return ordersPo.getOrder_itemPoList();}

    public void setOrderItems(List<OrderItemPo> orderItemList){ordersPo.setOrder_itemPoList(orderItemList);}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return Objects.equals(ordersPo, orders.ordersPo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersPo);
    }


    public OrdersPo getOrdersPo() {
        return ordersPo;
    }

    public void setOrdersPo(OrdersPo ordersPo) {
        this.ordersPo = ordersPo;
    }


}
