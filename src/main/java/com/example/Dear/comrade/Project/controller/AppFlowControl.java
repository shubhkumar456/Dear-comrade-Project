package com.example.Dear.comrade.Project.controller;

import com.example.Dear.comrade.Project.service.ServiceFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowControl {

    @Autowired
    ServiceFlow service;
    @RequestMapping("/callname")
    public String moviename(){

      // String name= "Shang Chi The Legend Of The Ten Rings";
         String name= service.movie();
        return name;
    }
}
