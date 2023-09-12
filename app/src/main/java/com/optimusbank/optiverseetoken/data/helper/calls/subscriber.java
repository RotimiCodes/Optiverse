package com.optimusbank.optiverseetoken.data.helper.calls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class subscriber {

    @SerializedName("user_id")
    @Expose
    public String user_id;

    @SerializedName("password")
    @Expose
    public String password;

}
