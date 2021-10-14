package cn.edu.xmu.restfuldemo.mapper;
import cn.edu.xmu.restfuldemo.bean.OrdersPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List <OrdersPo> findOrders(Integer id);

    Integer deleteOrders(Integer id);
}
