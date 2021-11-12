package com.example.Dear.comrade.Project.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cal_withpathvariable {


    @RequestMapping("/addi/{a}/{b}")
    public double add(@PathVariable double a, @PathVariable double b){
        double result = a+b;
        return result;
    }

    @RequestMapping("/subtraction/{a}/{b}")
    public double subs(@PathVariable double a,@PathVariable double b){

        double result = a-b;
        return result;
    }

    @RequestMapping("/multiply/{a}/{b}")
    public double mult(@PathVariable double a,@PathVariable double b){
        double result = a*b;
        return result;
    }

    @RequestMapping("/division/{a}/{b}")
    public double div(@PathVariable double a,@PathVariable double b){
        double result = a/b;
        return result;
    }
}
