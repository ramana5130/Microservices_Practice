package com.reddy.ms2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms2")
public class DemoController {

    @GetMapping("/welcome")
    public String hello() {
        return "hello MS2";
    }
}
