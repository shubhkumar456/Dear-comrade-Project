package com.example.Dear.comrade.Project.service;

import com.example.Dear.comrade.Project.repository.RepositoryFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFlow {

    @Autowired
    RepositoryFlow repository;
    public String movie(){
        //return "The Story of the Jungle Cruise";
        String name = repository.movie2();
       return name;
    }
}
