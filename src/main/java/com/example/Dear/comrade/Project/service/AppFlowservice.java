package com.example.Dear.comrade.Project.service;


import com.example.Dear.comrade.Project.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowservice {

    @Autowired
    AppFlowRepository repository;
    public String message(){
       // return "this message is from service layer";

       return repository.message();
    }
}
