package com.example.tests;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest{
    @GetMapping("/http/get")
    public String getTest(){
        return "get 요청";
    }
    @PostMapping("/http/post")
    public String postTest(){
        return "post 요청";
    }
    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }
    @DeleteMapping("/http/put")
    public String deletTest(){
        return "delete 요청";
    }
}