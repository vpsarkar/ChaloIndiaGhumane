package com.example.ChaloIndiaGhumane;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RailwaysController {

    @GetMapping("/mytrain")
    public String getData() {
        return "Please book your train-MH exp ticket ";
    }
}
