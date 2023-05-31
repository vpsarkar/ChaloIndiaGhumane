package com.example.ChaloIndiaGhumane;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @GetMapping("/myhotel")
    public String getData() {
        return "Please book your flight ticket";
    }
}
