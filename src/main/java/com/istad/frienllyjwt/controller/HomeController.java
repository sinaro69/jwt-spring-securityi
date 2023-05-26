package com.istad.frienllyjwt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/home")
    public String homepage(Authentication authentication){
        var user = authentication.getPrincipal();
        log.info("User is :{}",authentication.getPrincipal());
        return "hello "+authentication.getName();
    }



}
