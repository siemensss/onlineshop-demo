package com.example.onlineshopdemo.controller;

import com.example.onlineshopdemo.model.Item;
import com.example.onlineshopdemo.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }
    @GetMapping("/add")
    public void add(@RequestParam Set<Integer> id){
        shopService.add(id);
    }
    @GetMapping("/get")
    public List<Item> get(){
        return shopService.get();
    }
}
