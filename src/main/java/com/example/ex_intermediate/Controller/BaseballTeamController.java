package com.example.ex_intermediate.Controller;

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

    /**
     * トップページ（一覧画面）を表示するためのコントローラ。
     * @param model
     * @return
     */
    @RequestMapping("")
    public String index(Model model) {

        List<BaseballTeamDomain> teamList = service.getAllData();
        
        model.addAttribute("teamList", teamList);

        return "BaseballTeamList";
    }
    
    /**
     * 詳細画面を表示するためのコントローラ。
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/detail")
    public String requestMethodName(String id, Model model) {
        int convertedId = Integer.valueOf(id);

        BaseballTeamDomain teamDetail = service.getSpecificTeam(convertedId);
        model.addAttribute("teamDetail", teamDetail);

        return "BaseballTeamDetail";
    }
    

}
