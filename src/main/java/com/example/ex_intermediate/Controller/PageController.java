package com.example.ex_intermediate.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    
    @RequestMapping("")
    public String requestMethodName() {
        return "BaseballTeamList";
    }
    

}
