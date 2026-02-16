package com.example.ex_intermediate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex_intermediate.Domian.BaseballTeamDomain;
import com.example.ex_intermediate.Repository.BaseballTeamRepository;

@Service
public class BaseballTeamService {
    
    @Autowired
    BaseballTeamRepository repository;

    /**
     * DBに登録されている全ての野球チームを返す。
     * @return List<BaseballTeamDomain>
     */
    public List<BaseballTeamDomain> getAllData(){
        return repository.findAll();
    }

    /**
     * 引数のidをもとに、該当データを取得する。
     * @param id
     * @return
     */
    public BaseballTeamDomain getSpecificTeam(int id){
        return repository.load(id);
    }
}
