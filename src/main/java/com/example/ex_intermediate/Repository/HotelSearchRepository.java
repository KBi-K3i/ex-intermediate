package com.example.ex_intermediate.Repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.ex_intermediate.Domian.HotelSearchDomain;

@Repository
public class HotelSearchRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;
    
    private static final RowMapper<HotelSearchDomain> HOTEL_DATA_MAPPER =
        (rs, i) -> {
            HotelSearchDomain hotel = new HotelSearchDomain();
            hotel.setId(rs.getInt("id"));
            hotel.setAreaName(rs.getString("area_name"));
            hotel.setHotelName(rs.getString("hotel_name"));
            hotel.setAddress(rs.getString("address"));
            hotel.setNearestStation(rs.getString("nearest_station"));
            hotel.setPrice(rs.getInt("price"));
            hotel.setParking(rs.getString("parking"));
            return hotel;
        };

    /**
     * 引数の価格「以下」のデータを取得する。
     * @param price
     * @return hotel
     */
    public List<HotelSearchDomain> findByPrice(int price){
        String sql =
            "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels WHERE price <= :price;";
        
        SqlParameterSource param =
            new MapSqlParameterSource().addValue("price", price);
        
        List<HotelSearchDomain> hotel = 
            template.query(sql, param, HOTEL_DATA_MAPPER);
        
        return hotel;
    }

    /**
     * すべてのデータを取得する。
     * @return hotel
     */
    public List<HotelSearchDomain> getAllData(){
        String sql =
            "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels;";

        List<HotelSearchDomain> hotel = 
            template.query(sql, HOTEL_DATA_MAPPER);
        
        return hotel;
        
    }
}
