package cn.edu.xmu.restfuldemo.service;



import cn.edu.xmu.restfuldemo.model.Orders;
import cn.edu.xmu.restfuldemo.bean.OrdersVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import cn.edu.xmu.restfuldemo.bean.VoObject;
import cn.edu.xmu.restfuldemo.util.ReturnObject;

@Service
public class OrdersService {
    private Logger logger = LoggerFactory.getLogger(OrdersService.class);

    /**
     * 获取某个商品信息，仅展示相关内容
     *
     * @param id 商品id
     * @return 商品对象
     */
    public ReturnObject<VoObject> findById(Integer id) {
        ReturnObject<VoObject> returnObject = new ReturnObject<>();
        return returnObject;
    }

    /**
     * 新增商品
     * @param ordersVo 新商品信息
     * @return 新商品
     */
    public Orders createOrders(OrdersVo ordersVo) {
        Orders orders = new Orders();
        return orders;
    }

}
