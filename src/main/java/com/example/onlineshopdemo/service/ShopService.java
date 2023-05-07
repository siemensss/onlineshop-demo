package com.example.onlineshopdemo.service;

import com.example.onlineshopdemo.component.Basket;
import com.example.onlineshopdemo.model.Item;
import com.example.onlineshopdemo.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ShopService {
    private final Basket basket;
    private final ShopRepository shopRepository;
    public ShopService(Basket basket, ShopRepository shopRepository) {
        this.basket = basket;
        this.shopRepository = shopRepository;
    }
    public void add(Set<Integer> id){
        basket.add(id);
    }
    public List<Item> get() {
        return basket.get().stream()
                .map(id -> shopRepository.get(id))
                .collect(Collectors.toList());
    }
}
