package com.example.Dear.comrade.Project.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculatorwith_Pathvar {

    @RequestMapping("/add/{a}/{b}")
        public int add(@PathVariable int a,@PathVariable int b){
        int result = a+b;
        return result;
    }

   @RequestMapping("/subs/{a}/{b}")
    public int subs (@PathVariable int a,@PathVariable int b){
        int result = a-b;
        return result;
   }

   @RequestMapping("/mult/{a}/{b}")
   public int multi(@PathVariable int a,@PathVariable int b){
        int result = a*b;
        return result;
   }

   @RequestMapping("/div/{a}/{b}")
   public int division(@PathVariable int a, @PathVariable int b){
        int result = a/b;
        return result;
   }



}



