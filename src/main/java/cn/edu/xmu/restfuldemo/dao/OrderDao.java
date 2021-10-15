package cn.edu.xmu.restfuldemo.dao;

import cn.edu.xmu.restfuldemo.mapper.OrderMapper;
import cn.edu.xmu.restfuldemo.bean.*;
//import cn.edu.xmu.restfuldemo.util.Common;
import cn.edu.xmu.restfuldemo.util.ResponseCode;
import cn.edu.xmu.restfuldemo.util.ReturnObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//import static cn.edu.xmu.restfuldemo.util.Common.*;

@Repository
public class OrderDao {
    private Logger logger = LoggerFactory.getLogger(OrderDao.class);

    @Autowired
    private OrderMapper orderMapper;


    public  ReturnObject<List<Orders>> findOrder(OrdersPo ordersPo,Boolean withOrderItem)
    {
        logger.info("findOrders: OrdersPo =" + ordersPo+" withProduct = "+withOrderItem);
        List<OrdersPo> ordersPos = orderMapper.findOrders(ordersPo);
        logger.info("findOrders: OrdersPos =" + ordersPos);
        List<Orders> retOrders=new ArrayList<>(ordersPos.size());
        OrderItemPo orderitemPo=null;

        if(withOrderItem)
        {
            orderitemPo=new OrderItemPo();
        }

        for(OrdersPo ordersItem : ordersPos)
        {
            Orders item=new Orders(ordersItem);
            if(withOrderItem)
            {
                orderitemPo.setOrdersId(ordersItem.getId());
                List<OrderItemPo> orderItemPos=orderMapper.findOrderItem(orderitemPo);
                List<OrderItem> orderitemList=new ArrayList<>(orderItemPos.size());
                for (OrderItemPo orderItem : orderItemPos) {
                    OrderItem orderitem = new OrderItem(orderItem);
//                  -----------------------------------
//                    product = getEffectivePrice(product);
//                   ---------------------------------------
                    orderitemList.add(orderitem);
                }
                item.setOrderItemList(orderitemList);
                }
                retOrders.add(item);
            }
            logger.info("findOrders: retOrders = "+retOrders +", withOrderItem ="+withOrderItem);
            return new ReturnObject<>(retOrders);
        }


    }

}
