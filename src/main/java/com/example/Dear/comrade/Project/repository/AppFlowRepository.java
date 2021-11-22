package com.example.Dear.comrade.Project.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepository {

    public String message(){
        return "this message is from repository layer";
    }
}
