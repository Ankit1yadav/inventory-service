package com.ecom.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InventoryController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
