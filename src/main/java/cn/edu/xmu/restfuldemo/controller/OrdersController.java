package cn.edu.xmu.restfuldemo.controller;


import cn.edu.xmu.restfuldemo.bean.*;

import cn.edu.xmu.restfuldemo.bean.OrdersVo;
import cn.edu.xmu.restfuldemo.util.ResponseCode;
import cn.edu.xmu.restfuldemo.util.ResponseUtil;
import cn.edu.xmu.restfuldemo.util.ReturnObject;
import cn.edu.xmu.restfuldemo.service.OrdersService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static cn.edu.xmu.restfuldemo.util.Common.*;
import javax.servlet.http.HttpServletResponse;

/**
 * 订单控制器
 * @author Yixuan Chen
 */

//OrdersController是一个RESTful控制类，接收json格式，返回json格式
//返回的json会有中文，需要设置编码格式为UTF-8
@Api(value = "订单API",tags = "订单API")
@RestController
@RequestMapping(value = "/orders", produces = "application/json;charset=UTF-8")
public class OrdersController {
    //使用指定类初始化日志对象，在日志输出的时候，可以打印出日志信息所在类
    private final Logger logger = LoggerFactory.getLogger(OrdersController.class);


    //待定义的OrdersService类
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private HttpServletResponse httpServletResponse;

    //方法的说明
    @ApiOperation(value = "获得一个订单对象",  produces="application/json;charset=UTF-8")
    //方法的参数的说明，具体可参考资料：https://blog.csdn.net/xiaojin21cen/article/details/78654652
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", dataType = "Integer", name = "id", value ="订单对象id" ,required = true)
    })
    @ApiResponses({
    })
    @GetMapping("{id}")
    public Object getOrdersById(@PathVariable("id") Integer id){

        ReturnObject<VoObject> returnObject =  ordersService.findById(id);
        ResponseCode code = returnObject.getCode();
        switch (code){
            //表示操作的资源id不存在,设置http状态码为NOT_FOUND 即404
            case RESOURCE_ID_NOTEXIST:
                httpServletResponse.setStatus(HttpStatus.NOT_FOUND.value());
                return ResponseUtil.fail(returnObject.getCode(), returnObject.getErrmsg());
            //成功找到
            case OK:
                OrdersRetVo ordersRetVo = (OrdersRetVo) returnObject.getData().createVo();
                return ResponseUtil.ok(ordersRetVo);
            default:
                return ResponseUtil.fail(code);
        }
    }

    //@ApiOperation(value = "创建一个订单对象",  produces="application/json;charset=UTF-8")
    @ApiOperation(value = "新建订单",  produces="application/json")
    @ApiImplicitParams({
    })
    @ApiResponses({
    })
    @PostMapping("")
    public Object createOrder(@Validated @RequestBody OrdersVo ordersVo, BindingResult bindingResult){
        Object returnObject = processFieldErrors(bindingResult, httpServletResponse);
        if (null != returnObject){
            return returnObject;
        }
        ReturnObject<VoObject> returnObject1 = ordersService.createOrders(ordersVo);
        httpServletResponse.setStatus(HttpStatus.CREATED.value());
        return getRetObject(returnObject1);
    }
}
