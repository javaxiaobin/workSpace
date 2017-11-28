package com.magiclee.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TestWeb")
public class TestWeb {


    @RequestMapping("/sayhello")
    public void sayhello(){

        System.out.println("####################");
    }

}
