package com.codesigne.myrh.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recruter")
public class RecruterController {

    @GetMapping
    public String getRecruter(){
        return "hello from GET recruter method";
    }

    @PostMapping
    public String createRecruter(){

        return "hello from CREATE recruter method";
    }

    @PutMapping
    public String updateRecruter(){

        return "hello fom UPDATE recruter method";
    }

    @DeleteMapping
    public String deleteRecruter(){

        return "hello from DELETE recruter method";
    }
}
