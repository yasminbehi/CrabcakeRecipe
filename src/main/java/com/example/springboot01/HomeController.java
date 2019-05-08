package com.example.springboot01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(){
        return "index";

    }
    @RequestMapping("/crabcake")
    public String crabcake () {
        return "crabcake";
    }


}
