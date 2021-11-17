package com.example.Dear.comrade.Project.pathvariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Listcontroller3 {
    List<String> javalist = new ArrayList<>();

    @RequestMapping("/jodna")
    public String jod(@RequestParam String name,@RequestParam String name1,@RequestParam String name2){
        javalist.add(name);
        javalist.add(name1);
        javalist.add(name2);

        return "java name added successfully";
    }

    @RequestMapping("/laana")
    public List<String> getJavalist(){
        return javalist;
    }

    @RequestMapping("/changes")
    public String changes(@RequestParam String name2){
        javalist.remove(2);
        javalist.add(name2);

        return "javaname updated successfull";
    }

    @RequestMapping("/removal")
    public String hatana(@RequestParam String name1){
        javalist.remove(name1);

        return "javalist name removed successfully";
    }
}
