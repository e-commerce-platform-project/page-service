package ru.ivanov.ecommerceplatformproject.pageservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PageController {

    @GetMapping("/shop")
    public String shopPage() {
        return "forward:/index_multiPage2.html";
    }

    @GetMapping("/seller")
    public String sellerPage() {
        return "forward:/seller1.7.html";
    }
}