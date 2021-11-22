package com.example.Dear.comrade.Project.service;

import com.example.Dear.comrade.Project.repository.App_flow_repository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class App_flow_service2 {

    @Autowired
    App_flow_repository2 repository2;
    public String name(){
       // return "Hello guys i'am Shang Chi";

        return repository2.name();


    }
}
