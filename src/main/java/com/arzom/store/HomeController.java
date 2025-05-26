package com.arzom.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home()
    {
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    public String About()
    {
        return "Authored by Arzom";
    }

    @GetMapping("/contact")
    @ResponseBody
    public Object Contact()
    {
        return new Object(){
            public String name = "Arzom";
            public String email = "arzom@gmail.com";
        };
    }
}
