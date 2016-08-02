package com.brave.blank.erm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.brave.blank.erm.record.PracticeRecordActivity;

public class MainActivity extends AppCompatActivity {
    Button loginbtn, mypagebtn, practicebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = (Button)findViewById(R.id.test_loginbtn);
        mypagebtn = (Button)findViewById(R.id.btn_mypage);
        practicebtn = (Button)findViewById(R.id.test_practice);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        mypagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MypageActivity.class);
                startActivity(intent);
            }
        });

        practicebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PracticeRecordActivity.class);
                startActivity(intent);
            }
        });
    }
}
