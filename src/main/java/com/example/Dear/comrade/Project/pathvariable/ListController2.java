package com.example.Dear.comrade.Project.pathvariable;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

    @RestController
    public class ListController2 {
        List<String> stringList = new ArrayList<>();
        //CRUD = create, read, update, delete

        @RequestMapping("/create/{a}/{b}")
        public String addToList(@PathVariable String a,@PathVariable String b){
            stringList.add(a);
            stringList.add(b);
            return "Object is successfully added to the list";
        }

        @RequestMapping("/get1")
        public List<String>getStringList(){
            return stringList;
        }

        @RequestMapping("/updated/{a}")
        public String upDate(@PathVariable String a){
            stringList.remove(0);
            stringList.add(a);
            return "Object is successfully updated to the list";
        }

        @RequestMapping("/remove/{b}")
        public String delete(@PathVariable String b){
            stringList.remove(b);
            return "Object is successfully delete to the list";
        }
    }


