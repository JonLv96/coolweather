package com.example.a14510.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 14510 on 2018/8/20.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }

}
