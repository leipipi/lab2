package cn.edu.xmu.restfuldemo.service;

import cn.edu.xmu.restfuldemo.bean.OrdersPo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface OrderService {
    List<OrdersPo> findOrders(Integer id);
    Integer deleteOrders(Integer id);
}
