package com.example.Dear.comrade.Project.controller;

import com.example.Dear.comrade.Project.models.Student;
import com.example.Dear.comrade.Project.service.DataBaseService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataBaseController2 {

    @Autowired
    DataBaseService2 service;

    @PostMapping("/AddStudent")
    public String addstudent(@RequestBody Student student){
        return service.addstudent(student);
    }

    @GetMapping("/GetStudent")
    public List<Student> getstd(){
        return service.getstudent();
    }

    @PutMapping("/Update_Student")
    public String update(@RequestBody Student student){
        return service.update(student);
    }

    @DeleteMapping("/Delete_Student")
        public String delete(@RequestParam Long id){
            return service.delete(id);
        }

}

