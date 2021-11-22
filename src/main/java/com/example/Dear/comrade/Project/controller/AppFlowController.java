package com.example.Dear.comrade.Project.controller;


import com.example.Dear.comrade.Project.service.AppFlowservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    @Autowired
    AppFlowservice service;

    @RequestMapping("/messagess")
    public String hello(){

        String msg = service.message();
        return msg;
    }
}
