package com.example.ex_intermediate.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.ex_intermediate.Domian.BaseballTeamDomain;

/**
 * DBとのやり取りを担う。NamedParameterJdbcTemplateを使用することで、従来までJDBCで書いていた、DBへの接続や切断などの記述を省略可能。
 */
@Repository
public class BaseballTeamRepository {
    
    @Autowired
    private NamedParameterJdbcTemplate template;

    /**
     * DBのカラムと、JavaのEntity（Domain）の関連付けを行う。
     */
    private static final RowMapper<BaseballTeamDomain> BASEBALL_TEAM_MAPPER =
        (rs, i) -> {
            BaseballTeamDomain baseballTeam = new BaseballTeamDomain();
            baseballTeam.setId(rs.getInt("id"));
            baseballTeam.setLeague_name(rs.getString("league_name"));
            baseballTeam.setTeam_name(rs.getString("team_name"));
            baseballTeam.setHeadquarters(rs.getString("headquarters"));
            baseballTeam.setInauguration(rs.getString("inauguration"));
            baseballTeam.setHistory(rs.getString("history"));
            return baseballTeam;
        };

        /**
         * 引数の主キーから情報の検索を行う。
         * @param id
         * @return
         */
        public BaseballTeamDomain load(int id){
            String sql = 
                "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams WHERE id=:id;";

            SqlParameterSource param = 
                new MapSqlParameterSource().addValue("id", id);
            
            BaseballTeamDomain baseballTeam = 
                template.queryForObject(sql, param, BASEBALL_TEAM_MAPPER);

            return baseballTeam;
        }

        /**
         * 全レコードをリストで取得する。
         * @return List<BaseballTeamDomain>
         */
        public List<BaseballTeamDomain> findAll(){
            String sql = 
                "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams ORDER BY id;";
             
            List<BaseballTeamDomain> baseballTeamList = 
                template.query(sql, BASEBALL_TEAM_MAPPER);

            return baseballTeamList;
            
        }

}
