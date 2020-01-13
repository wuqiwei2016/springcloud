package com.htht.client.service.fallback;

import com.htht.client.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderHystric implements OrderService {
    @Override
    public String find() {
        return "heihei";
    }
}
