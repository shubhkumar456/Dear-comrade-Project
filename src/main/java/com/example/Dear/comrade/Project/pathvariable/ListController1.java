package com.example.Dear.comrade.Project.pathvariable;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListController1 {

    List <String> namelists = new ArrayList<>();


    @RequestMapping("/Adding")
    public String addlist(@RequestParam String value,@RequestParam String value1,@RequestParam String value2){
        namelists.add (value);
        namelists.add (value1);
        namelists.add (value2);

        return "Object name successfully added in addlist";
    }

    @RequestMapping("/gets")
    public List<String> getlist(){
        return namelists;
    }

    @RequestMapping("/updates")
    public String update(@RequestParam String value2){
        namelists.remove(2);
        namelists.add(value2);
        return "Object name updated successfully";
    }

    @RequestMapping("/removed")
    public String remove(@RequestParam String value){
        namelists.remove(value);
        return "object removed successfully";

    }

}
