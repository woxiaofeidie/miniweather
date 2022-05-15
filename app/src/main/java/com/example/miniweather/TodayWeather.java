package com.example.miniweather;


public class TodayWeather {
    private String city;
    private String updatetime;
    private String wendu;
    private String shidu;
    private String pm25;
    private String quality;
    private String fengxiang;
    private String fengli;
    private String date;
    private String high;
    private String low;
    private String type;

    public String getCity(String text) {
        return city;
    }
    public String getUpdatetime(String text) {
        return updatetime;
    }

    public String getWendu(String text) {
        return wendu;
    }

    public String getShidu(String text) {
        return shidu;
    }

    public String getPm25(String text) {
        return pm25;
    }

    public String getDate(String text) {
        return date;
    }

    public String getHigh(String trim) {
        return high;
    }

    public String getLow(String trim) {
        return low;
    }

    public String getType(String text) {
        return type;
    }

    public String getQuality(String text) {
        return quality;
    }

    public String getFengli(String text) {
        return fengli;
    }

    public String getFengxiang(String text) {
        return fengxiang;
    }

    @Override
    public String toString() {
        return "TodayWeather{" +
                "city='" + city + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", wendu='" + wendu + '\'' +
                ", shidu='" + shidu + '\'' +
                ", pm25='" + pm25 + '\'' +
                ", quality='" + quality + '\'' +
                ", fengxiang='" + fengxiang + '\'' +
                ", fengli='" + fengli + '\'' +
                ", date='" + date + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
