package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class Session {
    private String uid;

    Context context;
    SharedPreferences sharedPreferences;
    public Session(Context context){
        this.context=context;
        sharedPreferences =context.getSharedPreferences("userinfo",Context.MODE_PRIVATE);
    }

    public String getUid() {
        uid=sharedPreferences.getString("userdata","");
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
        sharedPreferences.edit().putString("userdata",uid).commit();


    }
}
