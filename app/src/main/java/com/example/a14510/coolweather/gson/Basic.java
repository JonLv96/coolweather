package com.example.a14510.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 14510 on 2018/8/20.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String wetherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
