package com.example.Dear.comrade.Project.controller;

import com.example.Dear.comrade.Project.service.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowControl {

    @Autowired
    FlowService service;
    @RequestMapping("/songname")
    public String songname(){
       // String name ="Act up";

        String name = service.songname();
        return name;
    }
}
