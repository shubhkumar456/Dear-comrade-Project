package com.example.Dear.comrade.Project.pathvariable;

import com.example.Dear.comrade.Project.models.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Model_with_Employee {

        List<Employee> emploeearraylist = new ArrayList<>();

        @RequestMapping("/adddd")
        public String add(){
            Employee emp = new Employee("arun",23,10000.0,"Jio");
            Employee emp1 = new Employee("hemant",22,40000.0,"TCS");
            Employee emp2 = new Employee("chotu",19,20000.0,"ITL");

            emploeearraylist.add(emp);
            emploeearraylist.add(emp1);
            emploeearraylist.add(emp2);

            return "object added successfully";
        }

        @RequestMapping("/gettings")
        public  List<Employee> getEmplist(){
            return emploeearraylist;
        }

        @RequestMapping("/upddd")
        public String update(@RequestParam String a, @RequestParam int b, @RequestParam double c, @RequestParam String d){
            emploeearraylist.get(0).setName(a);
            emploeearraylist.get(0).setAge(b);
            emploeearraylist.get(0).setSalary(c);
            emploeearraylist.get(0).setCompany(d);


            return "object updated successfully";
        }

        @RequestMapping("/remmm")
        public String remove(@RequestParam String name){
            emploeearraylist.remove(0);
            return "object reoved successfully";
        }

}
