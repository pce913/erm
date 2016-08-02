package com.brave.blank.erm;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.brave.blank.erm.Consonant_Vowel.Consonant_VowelFragment;
import com.brave.blank.erm.SpeechRecognition.SoundMeter;

/**
 * Created by chanung on 2016-07-24.
 */

//page 5
public class NoiseTestFragment extends BaseFragment{

    ProgressBar progressBar;
    Button button_ok;
    Button button2;
    TextView textView3;

    Handler handler=new Handler();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_noise_test, container, false);
        progressBar=(ProgressBar)rootView.findViewById(R.id.progressBar);
        button_ok=(Button)rootView.findViewById(R.id.button_ok);
        textView3=(TextView)rootView.findViewById(R.id.textView3);

        button2=(Button)rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToolbarActivity activity= (ToolbarActivity) getActivity();
                activity.onFragmentChanged(1);
                Log.d("fragment", "NoiseTest 프레그먼트 변환버튼 눌림");
            }
        });
        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressThread progressThread=new ProgressThread();
                progressThread.start();


            }
        });
        return rootView;
    }

    class ProgressThread extends Thread{
        double sum=0;
        double dB=0;
        Long longAverage=new Long(0);

        public void run() {
            buttonSetting(false);  //이 부분에 버튼 비활성화 코드 넣어야함.

            final SoundMeter sm = new SoundMeter();
            sm.start();

            for (int i = 0; i < 100; i++){

                progressbarSetting(i);

                try {
                    dB=20*Math.log10(sm.getAmplitude());
                    sum=sum+dB;
                    Log.d("dB:","#"+i+": "+dB);
                    Thread.sleep(30);                       //3초간 측정. 30
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
            sm.stop();
            longAverage= Math.round(sum/100);
            buttonSetting(true);  //이 부분에 버튼 활성화 코드 넣어야 함.


            startFragment(getFragmentManager(), Consonant_VowelFragment.class);            //자음모음 8page로 이동

        };

        public void progressbarSetting(final int i)
        {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    progressBar.setProgress(i);
                }
            });
        }

        public void buttonSetting(final boolean act){
            handler.post(new Runnable() {
                @Override
                public void run() {
                    button_ok.setEnabled(act);
                    textView3.setText(longAverage.toString());
                }
            });
        }

    }

}
