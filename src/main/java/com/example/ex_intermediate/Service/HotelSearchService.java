package com.example.ex_intermediate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex_intermediate.Domian.HotelSearchDomain;
import com.example.ex_intermediate.Repository.HotelSearchRepository;

@Service
public class HotelSearchService {
    
    @Autowired
    HotelSearchRepository repositiory;

    /**
     * 引数の価格「以下」のデータを取得する。
     * @param price
     * @return repositiory.findByPrice(price)
     */
    public List<HotelSearchDomain> filterByPrice(int price){
        return repositiory.findByPrice(price);
    }

    /**
     * すべてのデータを取得する。
     * @return repositiory.getAllData()
     */
    public List<HotelSearchDomain> getAllData(){
        return repositiory.getAllData();
    }

}
