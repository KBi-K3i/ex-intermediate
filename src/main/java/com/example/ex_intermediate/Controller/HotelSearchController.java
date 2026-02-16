package com.example.ex_intermediate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ex_intermediate.Domian.HotelSearchDomain;
import com.example.ex_intermediate.Service.HotelSearchService;

@Controller
public class HotelSearchController {
    
    @Autowired
    HotelSearchService service;

    /**
     * リソースをリクエストする場合はGETメソッドであるため、初期表示はこのメソッドで制御を行う。
     * @return HotelSearchForm
     */
    @GetMapping("/hotel")
    public String index(Model model) {
        // 安全のため、nullを明示的に渡しておく。
        model.addAttribute("hotels", null);
        return "HotelSearchForm";
    }
    
    /**
     * フォームに入力された情報を送信する際はPOSTメソッドであるため、このメソッドでPOST時の動作を制御する。
     * @param model
     * @param price
     * @return HotelSearchForm
     */
    @PostMapping("/hotel")
    public String filterPrice(Model model, String price) {
        
        if(price.equals("")){

            List<HotelSearchDomain> hotel = service.getAllData();

            model.addAttribute("hotels", hotel);
    
            // 入力値を保つため、priceも渡す。
            model.addAttribute("price", price);

        }else{

            int convertedPrice = Integer.valueOf(price);

            List<HotelSearchDomain> hotel = service.filterByPrice(convertedPrice);
            
            model.addAttribute("hotels", hotel);

            // 入力値を保つため、priceも渡す。
            model.addAttribute("price", convertedPrice);
        }

        return "HotelSearchForm";
    }

}
