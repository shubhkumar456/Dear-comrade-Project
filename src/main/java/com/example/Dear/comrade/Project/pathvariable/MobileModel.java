package com.example.Dear.comrade.Project.pathvariable;

import com.example.Dear.comrade.Project.models.Mobile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MobileModel {

    List<Mobile> mobileList = new ArrayList<>();

    @RequestMapping("/ad1")
    public String add(){
        Mobile mobile = new Mobile("Vivo",8,17999.9);
        Mobile mobile1 = new Mobile("one plus",16,87999.9);
        Mobile mobile2 = new Mobile("apple Iphone",8,117999.9);

        mobileList.add(mobile);
        mobileList.add(mobile1);
        mobileList.add(mobile2);

        return "added successful";
    }

    @RequestMapping("/gets1")
    public List<Mobile> getMobileList(){
        return mobileList;
    }

    @RequestMapping("/updates1")
    public  String update(@RequestParam String name,@RequestParam int ram,@RequestParam double price){
        mobileList.get(0).setName(name);
        mobileList.get(0).setRam(ram);
        mobileList.get(0).setPrice(price);

        return "updated successful";
    }

    @RequestMapping("/remsey")
    public String remove(@RequestParam String name){
        mobileList.remove(0);
        return "removed successfully";
    }
}
