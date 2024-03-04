package com.example.applifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 액티비티, 프로그래먼트 생성
        Log.e("MainActivity", "onCreate : Activity가 생성될 때 호출.");

        // 프래그먼트 매니저를 통해 프래그먼트 트랜잭션 시작
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        findViewById(R.id.btn_move).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SubActivity.class));
            }
        });

        findViewById(R.id.btn_move2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SubActivity2.class));
            }
        });

        findViewById(R.id.btn_move3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

                if (fragment != null) {
                    // 프래그먼트가 있다면 종료
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.remove(fragment);
                    fragmentTransaction.commit();
                }

                // 프래그먼트 트랜잭션을 통해 BlankFragment를 프레임 레이아웃에 추가
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment blankFragment = new BlankFragment();
                fragmentTransaction.add(R.id.fragment_container, blankFragment);
                fragmentTransaction.commit(); // 트랜잭션 완료
            }
        });

        findViewById(R.id.btn_move4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

                if (fragment != null) {
                    // 프래그먼트가 있다면 종료
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.remove(fragment);
                    fragmentTransaction.commit();
                }

                // 프래그먼트 트랜잭션을 통해 BlankFragment를 프레임 레이아웃에 추가
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment2 blankFragment = new BlankFragment2();
                fragmentTransaction.add(R.id.fragment_container, blankFragment);
                fragmentTransaction.commit(); // 트랜잭션 완료
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "onStart : Activity가 사용자에게 표시되기 직전에 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "onResume : Activity가 포그라운드로 이동하여 사용자와 상호작용 할 수 있는 상태.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "onPause : 다른 Activity가 화면을 완전히 가리면 또는 현재 Activity가 일부분만 가려질 때 호출.");
    }

    @Override

    protected void onStop() {
        super.onStop();
        Log.e("MainActivity", "onStop : Activity가 사용자에게 더 이상 표시되지 않게 되면 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "onDestroy :  Activity가 완전히 소멸되기 전에 호출. ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity", "onRestart : Activity가 stop에서 재개 될 때 호출.");
    }


}