package com.brave.blank.erm;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.brave.blank.erm.SpeechRecognition.AudioWriterPCM;
import com.brave.blank.erm.SpeechRecognition.NaverRecognizer;
import com.naver.speech.clientapi.SpeechConfig;

/**
 * Created by chanung on 2016-07-26.
 */


public class HomeTalkFragment extends BaseFragment {
    Button button;
    Button button5;
    VideoView videoView;
    ToolbarActivity activity;
    String url;


    private static final String CLIENT_ID = "HaRGzTahV1Xs9mtmBpdR"; // "내 애플리케이션"에서 Client ID를 확인해서 이곳에 적어주세요.
    private static final SpeechConfig SPEECH_CONFIG = SpeechConfig.OPENAPI_KR; // or SpeechConfig.OPENAPI_EN

  //  private RecognitionHandler handler;                                             이부분 주석 풀고 코드 추가해야 함.
    private NaverRecognizer naverRecognizer;

    private TextView txtResult;
    private Button btnStart;
    private String mResult;

    private AudioWriterPCM writer;

    private boolean isRunning;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_home_talk, container, false);
         activity= (ToolbarActivity) getActivity();
         button=(Button)rootView.findViewById(R.id.button);
        button5=(Button)rootView.findViewById(R.id.button5);


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 activity.onFragmentChanged(0);
             }
         });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        url="http://sites.google.com/site/ubiaccessmobile/sample_video.mp4";
        videoView=(VideoView) rootView.findViewById(R.id.videoView);

        activity= (ToolbarActivity) getActivity();
        MediaController controller=new MediaController(activity);

        controller.setAnchorView(videoView);
        videoView.setMediaController(controller);


        videoView.setVideoURI(Uri.parse(url));
        videoView.requestFocus();



        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                Toast.makeText(activity.getApplicationContext(), "동영상 재생이 준비되었습니다.", Toast.LENGTH_LONG).show();
            }
        });

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(activity.getApplicationContext(), "동영상 완료 되었습니다.", Toast.LENGTH_LONG).show();
            }
        });
        videoView.seekTo(0);
        videoView.start();           //재생 시키는 코드

        //videoView.setVisibility(View.INVISIBLE);                   setVisibility 를 이용하여 이미지와
                                                                     //동영상을 전환하자.



        return rootView;
    }



}
