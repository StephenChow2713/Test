package com.dtm.aimiao.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dtm.aimiao.R;
import com.dtm.aimiao.utils.BDUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Log.e("12","21");
//        new ArrayList<>();

        BDUtils.uiUpdate(this);

    }



}
