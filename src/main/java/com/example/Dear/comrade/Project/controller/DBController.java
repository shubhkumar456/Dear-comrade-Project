package com.example.Dear.comrade.Project.controller;

import com.example.Dear.comrade.Project.models.Laptop;
import com.example.Dear.comrade.Project.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBController {

    @Autowired
    DBService service;

    @PostMapping("/addlaptop")
    public String add(@RequestBody Laptop laptop){
        return service.addlappy(laptop);
    }

    @GetMapping("/getlaptop")
    public List<Laptop> getlist(){
        return service.getlaptop();
    }

    @PutMapping("/updatelaptop")
    public String update(@RequestBody Laptop laptop){
        return service.update(laptop);
    }

    @DeleteMapping("/deletelaptop")
    public String delete(@RequestParam Long id){
        return service.delete(id);
    }
}
