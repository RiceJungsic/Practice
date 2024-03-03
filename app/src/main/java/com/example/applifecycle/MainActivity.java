package com.example.applifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 액티비티, 프로그래먼트 생성
        Log.e("onCreate", "onCreate : 액티비티, 프로그래먼트  생성");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "onStart : 액티비티, 프로그래먼트  생성");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "onResume : 액티비티, 프로그래먼트  생성");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "onPause : 액티비티, 프로그래먼트  생성");
    }

    @Override

    protected void onStop() {
        super.onStop();
        Log.e("onStop", "onStop : 액티비티, 프로그래먼트  생성");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "onDestroy : 액티비티, 프로그래먼트  생성");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "onRestart : 액티비티, 프로그래먼트  생성");
    }
}