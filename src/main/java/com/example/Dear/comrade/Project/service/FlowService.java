package com.example.Dear.comrade.Project.service;

import com.example.Dear.comrade.Project.repository.FlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowService {

    @Autowired
    FlowRepository repository;
    public String songname(){
       // return "In the dark";

        String var = repository.song();
        return var;
    }
}
