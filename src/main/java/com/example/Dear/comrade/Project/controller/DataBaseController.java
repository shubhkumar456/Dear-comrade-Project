package com.example.Dear.comrade.Project.controller;

import com.example.Dear.comrade.Project.models.Mobile;
import com.example.Dear.comrade.Project.service.DataBaseServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataBaseController {

    @Autowired
    DataBaseServie servie;

    @PostMapping("/Add_mbl")
    public String addmobile(@RequestBody Mobile mobile){

        return  servie.addmobile(mobile);

    }

    @GetMapping("/get_mbl")
    public List<Mobile> getmobile(){
        return servie.getmobile();

    }

    @PutMapping("/update_mbl")
    public String update(@RequestBody Mobile mobile){
        return servie.updatemobile(mobile);
    }

    @DeleteMapping("/delete_mbl")
    public String deletembl(@RequestParam Long id){
        return servie.deletembl(id);
    }

}
