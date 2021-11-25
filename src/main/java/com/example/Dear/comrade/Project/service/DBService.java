package com.example.Dear.comrade.Project.service;

import com.example.Dear.comrade.Project.models.Laptop;
import com.example.Dear.comrade.Project.repository.DBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    @Autowired
    DBRepository repository;

    public String addlappy(Laptop laptop){
         repository.save(laptop);
         return "Laptop list added successfully";
    }

    public List<Laptop> getlaptop(){
        return repository.findAll();
    }

    public String update(Laptop laptop){
        repository.save(laptop);
        return "Laptop List updated successfully";
    }

    public String delete(Long id){
        repository.deleteById(id);
        return "Laptop List deleted successfully";
    }
}
