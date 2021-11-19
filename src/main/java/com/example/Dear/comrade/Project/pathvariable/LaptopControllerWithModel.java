package com.example.Dear.comrade.Project.pathvariable;

import com.example.Dear.comrade.Project.models.Laptop;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

    @RestController
    public class LaptopControllerWithModel {

        List<Laptop> laptopList = new ArrayList<>();

        @RequestMapping("/Adding1")
        public String add(@RequestBody Laptop laptop){
            laptopList.add(laptop);
            return "Added Successfully";
        }


        @RequestMapping("/Getting1")
        public List<Laptop> getLaptopList() {
            return laptopList;
        }

        @RequestMapping("/Update1")
        public String update(@RequestParam String name,@RequestParam String name1){
            laptopList.get(0).setBrand(name);
            laptopList.get(1).setBrand(name1);
            return "Updated successfully";
        }


        @RequestMapping("/Remove1")
        public String remo(@RequestParam String name){
            laptopList.remove(1);
            return "Removed successfully";

        }

    }


