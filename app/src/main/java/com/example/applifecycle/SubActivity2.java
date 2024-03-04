package com.example.applifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SubActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        Log.e("SubActivity2", "onCreate : Activity가 사용자에게 표시되기 직전에 호출");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SubActivity2", "onStart : Activity가 사용자에게 표시되기 직전에 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("SubActivity2", "onResume : Activity가 포그라운드로 이동하여 사용자와 상호작용 할 수 있는 상태.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("SubActivity2", "onPause : 다른 Activity가 화면을 완전히 가리면 또는 현재 Activity가 일부분만 가려질 때 호출.");
    }

    @Override

    protected void onStop() {
        super.onStop();
        Log.e("SubActivity2", "onStop : Activity가 사용자에게 더 이상 표시되지 않게 되면 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SubActivity2", "onDestroy :  Activity가 완전히 소멸되기 전에 호출. ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("SubActivity2", "onRestart : Activity가 stop에서 재개 될 때 호출.");
    }
}