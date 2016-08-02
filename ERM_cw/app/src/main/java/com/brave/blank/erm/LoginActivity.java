package com.brave.blank.erm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by IT on 2016-07-26.
 */
public class LoginActivity extends AppCompatActivity {
    Button singup;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        singup = (Button)findViewById(R.id.singupbtn);
        login=(Button)findViewById(R.id.loginbtn);
        singup.setOnClickListener(new View.OnClickListener() {           //회원가입 페이지로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {               //메인페이지로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), ToolbarActivity.class);
                startActivity(intent);
            }
        });
    }
}
