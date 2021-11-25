package com.example.Dear.comrade.Project.service;

import com.example.Dear.comrade.Project.models.Mobile;
import com.example.Dear.comrade.Project.repository.MobileJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseServie {

    @Autowired
    MobileJpaRepository repository;

    public String addmobile(Mobile mobile){
        repository.save(mobile);
        return "successfully save in database "+mobile.getName();

    }

    public List<Mobile> getmobile(){
        return repository.findAll();
    }

    public String updatemobile(Mobile mobile){
        repository.save(mobile);
        return "mobile name updated successfully in database "+mobile.getName();

    }

    public String deletembl(Long id){
        repository.deleteById(id);
        return "Mobile deleted successfully in database ";
    }


}
