package com.example.ex_intermediate.Domian;

/** 
 * エンティティの役割を担う。
 * 各Getter及びSetterなどを定義。
*/

public class BaseballTeamDomain {

    private int id;
    private String league_name;
    private String team_name;
    private String headquarters; 
    private String Inauguration;
    private String history;

    /**
     * 全てのフィールドを文字列として結合して返す
     */
    @Override
    public String toString() {
        return "BaseballTeam [id=" + id + ", league_name=" + league_name + ", team_name=" + team_name + ", headquarters="
                + headquarters + ", Inauguration=" + Inauguration + ", history=" + history + "]";
    }

    /**
     * private int idのgetterである。
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * private int idのsetterである。
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * private String league_nameのgetterである。
     * @return league_name
     */
    public String getLeague_name() {
        return league_name;
    }

    /**
     * private String league_nameのsetterである。
     * @param league_name
     */
    public void setLeague_name(String league_name) {
        this.league_name = league_name;
    }

    /**
     * private String team_nameのgetterである。
     * @return team_name
     */
    public String getTeam_name() {
        return team_name;
    }

    /**
     * private String team_nameのsetterである。
     * @param team_name
     */
    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    /**
     * private String headquartersのgetterである。
     * @return headquarters
     */
    public String getheadquarters() {
        return headquarters;
    }

    /**
     * private String headquartersのsetterである。
     * @param headquarters
     */
    public void setheadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    /**
     * private String inaugurationのgetterである。
     * @return Inauguration
     */
    public String getInauguration() {
        return Inauguration;
    }

    /**
     * private String inaugurationのsetterである。
     * @param inauguration
     */
    public void setInauguration(String inauguration) {
        Inauguration = inauguration;
    }

    /**
     * private String historyのgetterである。
     * @return history
     */
    public String getHistory() {
        return history;
    }

    /**
     * private String historyのsetterである。
     * @param history
     */
    public void setHistory(String history) {
        this.history = history;
    }

}
