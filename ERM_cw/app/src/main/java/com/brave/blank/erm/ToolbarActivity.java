package com.brave.blank.erm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by chanung on 2016-07-28.
 */
public class ToolbarActivity  extends AppCompatActivity {
    NoiseTestFragment noiseTestFragment;
    HomeTalkFragment homeTalkFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        // Set a toolbar to  replace to action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        noiseTestFragment=new NoiseTestFragment();
        homeTalkFragment=new HomeTalkFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.container,  noiseTestFragment).commit();         //두번째 인자 수정
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.global, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Toolbar.", Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void onFragmentChanged(int index){


        if(index ==0){
            // noiseTestFragment=new NoiseTestFragment();

//            ft.replace(R.id.container, noiseTestFragment,"noiseTest");
//            ft.commit();

            getSupportFragmentManager().beginTransaction().replace(R.id.container,noiseTestFragment).commit();
            Log.d("fragment change", "index 0 호출됨");
        }

        else if(index ==1){
            //  homeTalkFragment=new HomeTalkFragment();

//            ft.replace(R.id.container, homeTalkFragment, "homeTalk");
//            ft.commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.container, homeTalkFragment).commit();
            Log.d("fragment change", "index 1 호출됨");
        }

    }
}
