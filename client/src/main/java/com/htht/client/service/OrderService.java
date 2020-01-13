package com.htht.client.service;

import com.htht.client.service.fallback.OrderHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "serviceorder",fallback = OrderHystric.class)
public interface OrderService {

    @RequestMapping(value = "/order/find")
     String find();
}
