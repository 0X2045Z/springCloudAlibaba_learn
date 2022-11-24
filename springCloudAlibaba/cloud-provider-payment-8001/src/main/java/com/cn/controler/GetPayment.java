package com.cn.controler;

import com.cn.entities.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPayment {

    @RequestMapping("/payment/pay")
    public CommonResult pay() {
        return new CommonResult(200, "Success");
    }
}
