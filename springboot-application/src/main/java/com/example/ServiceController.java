package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ServiceController {

    @GetMapping("/")
    public String HomePage() {
        return "HomePage";
    }
}
