package com.example.Dear.comrade.Project.pathvariable;

import com.example.Dear.comrade.Project.models.Mobile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerModelMobile {

    List<Mobile> mobileList = new ArrayList<>();


    @RequestMapping("/add7")
    public String add(){
        Mobile mbl = new Mobile("Apple Iphone",8,120000.0);
        Mobile mbl1 = new Mobile("Apple Iphone",8,120000.0);
        Mobile mbl2 = new Mobile("Apple Iphone",8,120000.0);
        mobileList.add(mbl);
        mobileList.add(mbl1);
        mobileList.add(mbl2);

        return "mobile added";

    }

    @RequestMapping("/gets7")
    public List<Mobile> getMobileList(){
        return mobileList;

    }

    @RequestMapping("/update7")
    public String update(@RequestParam double price,@RequestParam int ram,@RequestParam String name,@RequestParam String name1,@RequestParam int ram1,@RequestParam double price1){
        mobileList.get(1).setPrice(price);
        mobileList.get(1).setRam(ram);
        mobileList.get(1).setName(name);
        mobileList.get(2).setName(name1);
        mobileList.get(2).setRam(ram1);
        mobileList.get(2).setPrice(price1);


        return "updated successfully";

    }

    @RequestMapping("/remove7")
    public String remove(@RequestParam String name){
        mobileList.remove(0);

        return "removed successfully";
    }
}
