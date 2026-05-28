package com.example12.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    CPU cp;
    public void compile(){
        cp.run();

    }
}
