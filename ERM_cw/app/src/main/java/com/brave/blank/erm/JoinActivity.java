package com.brave.blank.erm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by IT on 2016-07-26.
 */
public class JoinActivity extends AppCompatActivity {
    Button join, cancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        join = (Button)findViewById(R.id.joinbtn);
        cancle = (Button)findViewById(R.id.canclebtn);

        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
