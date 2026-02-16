package com.example.ex_intermediate.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ex_intermediate.Domian.BaseballTeamDomain;
import com.example.ex_intermediate.Service.BaseballTeamService;

@Controller
public class BaseballTeamController {
    
    @Autowired
    BaseballTeamService service;

    @RequestMapping("")
    public String index(Model model) {

        List<BaseballTeamDomain> teamList = service.getAllData();
        
        model.addAttribute("teamList", teamList);

        return "BaseballTeamList";
    }
    

}
