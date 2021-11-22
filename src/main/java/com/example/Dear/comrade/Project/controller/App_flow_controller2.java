package com.example.Dear.comrade.Project.controller;

import com.example.Dear.comrade.Project.service.App_flow_service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App_flow_controller2 {

    @Autowired
    App_flow_service2 service2;
    @RequestMapping("/Call_name")
    public String name(){

       // String name="Shubendra kumar";

      String name= service2.name();
      return name;
    }
}
