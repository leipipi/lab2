package cn.edu.xmu.restfuldemo.service;



import cn.edu.xmu.restfuldemo.bean.OrdersPo;
import cn.edu.xmu.restfuldemo.bean.OrdersVo;
import cn.edu.xmu.restfuldemo.bean.Orders;
import cn.edu.xmu.restfuldemo.util.ResponseCode;
import org.slf4j.Logger;
import cn.edu.xmu.restfuldemo.dao.OrderDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.xmu.restfuldemo.bean.VoObject;
import cn.edu.xmu.restfuldemo.util.ReturnObject;

import java.util.List;

@Service
public class OrdersService {
    private Logger logger = LoggerFactory.getLogger(OrdersService.class);

    @Autowired
    private OrderDao orderDao;

    public ReturnObject<VoObject> findById(Integer id) {
        OrdersPo queryObj=new OrdersPo();
        queryObj.setId(id);
        ReturnObject<List<Orders>> returnObject=orderDao.findOrder(queryObj,true);
        ReturnObject<VoObject> retOrders = null;
        if (returnObject.getCode().equals(ResponseCode.OK)) {
            if (returnObject.getData().size() == 1) {
                retOrders = new ReturnObject<>(returnObject.getData().get(0));
            }else{
                retOrders  = new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST);
            }
        }else{
            retOrders  = new ReturnObject<>(returnObject.getCode(), returnObject.getErrmsg());
        }
        return retOrders ;
    }


    public ReturnObject<VoObject> createOrders(OrdersVo ordersVo) {
        logger.info("createOrders: ordersVo = " + ordersVo);
        Orders orders = ordersVo.createOrders();
        logger.info("createOrders: orders = " + orders);
        ReturnObject<Orders> retObj=orderDao.createOrders(orders);
        ReturnObject<VoObject> retOrders = null;
        if (retObj.getCode().equals(ResponseCode.OK)) {
            retOrders = new ReturnObject<>(retObj.getData());
        }else{
            retOrders = new ReturnObject<>(retObj.getCode(), retObj.getErrmsg());
        }
        logger.info("createOrders: retOrders = " + retOrders.getData());
        return retOrders;
    }

}
