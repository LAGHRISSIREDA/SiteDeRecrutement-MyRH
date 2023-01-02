package com.codesigne.myrh.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin")
public class AdminController {

    @GetMapping(path = "/{id}")
    public String getAdmin(@PathVariable String id){
        return "hello from get admin number : "+id;
    }

    @GetMapping
    public String getAllAdmins(){
        return "hello from get all admin function";
    }

    @PostMapping
    public String createAdmin(){
        return "hello from create admin function";
    }

    @PutMapping
    public String updateAdmin(){
        return "hello from update admin function";
    }

    @DeleteMapping
    public String deleteAdmin(){
        return "hello from delete admin function";
    }
}
