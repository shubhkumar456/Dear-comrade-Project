package com.example.Dear.comrade.Project.service;

import com.example.Dear.comrade.Project.models.Student;
import com.example.Dear.comrade.Project.repository.DataBaseRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseService2 {

     @Autowired
     DataBaseRepository2 repository;

     public String addstudent(Student student) {
         repository.save(student);
         return "database successfully added";

     }

     public List<Student> getstudent(){
       return   repository.findAll();
     }

     public String update(Student student){
          repository.save(student);
          return "successfully updated ";

     }

     public String delete(Long id){
         repository.deleteById(id);
         return "object deleted successfully";
     }


}
