package com.example.onlineshopdemo.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Component
@SessionScope
public class Basket {
    private final Set<Integer> id = new HashSet<>();

    public void add (Set<Integer> id){
        this.id.addAll(id);
    }
    public Set<Integer> get() {
        return Collections.unmodifiableSet(id);
    }
}
