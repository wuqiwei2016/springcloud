package com.htht.serviceorder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/find")
    public String find(){
        return "Hello world";
    }
}
