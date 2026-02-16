package com.example.ex_intermediate.Domian;

public class HotelSearchDomain {

    private int id;
    private String areaName;
    private String hotelName;
    private String address;
    private String nearestStation;
    private int price;
    private String parking;
    
    /**
     * 全フィールドの値を出力する。
     */
    @Override
    public String toString() {
        return "HotelSearchDomail [id=" + id + ", areaName=" + areaName + ", hotelName=" + hotelName + ", address="
                + address + ", nearestStation=" + nearestStation + ", price=" + price + ", parking=" + parking + "]";
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
     * private String areaNameのgetterである。
     * @return areaName
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * private String areaNameのsetterである。
     * @param areaName
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * private String hotelNameのgetterである。
     * @return hotelName
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * private String hotelNameのsetterである。
     * @param hotelName
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * private String addressのgetterである
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * private String addressのsetterである。
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * private String nearestStationのgetterである。
     * @return nearestStation
     */
    public String getNearestStation() {
        return nearestStation;
    }

    /**
     * private String nearestStationのsetterである。
     * @param nearestStation
     */
    public void setNearestStation(String nearestStation) {
        this.nearestStation = nearestStation;
    }

    /**
     * private int priceのgettterである。
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * private int priceのsetterである。
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * private String parkingのgetterである。
     * @return parking
     */
    public String getParking() {
        return parking;
    }

    /**
     * private String parkingのsetterである。
     * @param parking
     */
    public void setParking(String parking) {
        this.parking = parking;
    }

    

}
