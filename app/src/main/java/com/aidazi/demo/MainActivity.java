package com.aidazi.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aidazi.scommonlib.log.SLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SLog.i("onCreate");
    }
}
