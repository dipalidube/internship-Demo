package com.example.mypackage.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    // Define a method to handle POST requests to "/add"
    @PostMapping("/add")
    public int add(@RequestBody AddRequest request) {
        System.out.println("Incoming values are || num1: " + request.getNum1() + " | num2: " + request.getNum2());
        int sum = request.getNum1() + request.getNum2();
        System.out.println("Sum: " + sum);
        return sum;
    }
}
