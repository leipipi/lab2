package cn.edu.xmu.restfuldemo.service.Impl;


import cn.edu.xmu.restfuldemo.bean.OrdersPo;
import cn.edu.xmu.restfuldemo.mapper.OrderMapper;
import cn.edu.xmu.restfuldemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrdersPo> findOrders(Integer id)
    {
        return orderMapper.findOrders(id);
    }

    @Override
    public Integer deleteOrders(Integer id)
    {
        return orderMapper.deleteOrders(id);
    }

}
