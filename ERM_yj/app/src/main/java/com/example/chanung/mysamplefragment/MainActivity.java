package com.example.chanung.mysamplefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MainpageFragment mainpageFragment;
    LearningFragment learningFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mainpageFragment = new MainpageFragment();
        learningFragment = new LearningFragment();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container,mainpageFragment).commit();
        }
    }

}
