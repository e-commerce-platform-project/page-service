package ru.ivanov.ecommerceplatformproject.pageservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class PageController {

    @GetMapping
    public String shopPage() {
        return "forward:/index_withVerificationCode1.0.html";
    }

    @GetMapping("/seller")
    public String sellerPage() {
        return "forward:/seller1.7.html";
    }
}