package com.example.Dear.comrade.Project.pathvariable;

import com.example.Dear.comrade.Project.models.Employeee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class EmployeeModelController {

    List<Employeee> employeeeList = new ArrayList<>();

    @RequestMapping("/Adding2")
    public String add(@RequestBody Employeee employee){
        employeeeList.add(employee);
        return "Added";
    }

    @RequestMapping("/Getting2")
    public List<Employeee> getEmployeeeList(){
        return employeeeList;
    }

    @RequestMapping("/Update2")
    public String update(@RequestParam String name,@RequestParam String name1,@RequestParam String name2){
        employeeeList.get(0).setName(name);
        employeeeList.get(1).setName(name1);
        employeeeList.get(2).setName(name2);

        return "Updated successfully";

    }

    @RequestMapping("/Delete2")
    public String remove(@RequestParam String name){
        employeeeList.remove(1);
        return "deleted successfully";
    }
}
