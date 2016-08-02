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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        singup = (Button)findViewById(R.id.singupbtn);
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });
    }
}
