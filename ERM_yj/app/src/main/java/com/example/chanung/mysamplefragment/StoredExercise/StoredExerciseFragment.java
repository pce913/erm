package com.example.chanung.mysamplefragment.StoredExercise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.chanung.mysamplefragment.BaseFragment;
import com.example.chanung.mysamplefragment.Dictation.DictationFragment;
import com.example.chanung.mysamplefragment.Pronunciation.PronunciationFragment;
import com.example.chanung.mysamplefragment.R;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jeonyongjin on 2016. 8. 1..
 */
public class StoredExerciseFragment extends BaseFragment{
    private ArrayList<StoredExerciseList> exerciseDatas = null;
    ListView listview;
    StoredExerciseCustomAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_storedexercise, container, false);

        exerciseDatas = new ArrayList<StoredExerciseList>();
        StoredExerciseList item1 = new StoredExerciseList();
        item1.setSection(0);
        item1.setDate(Date.UTC(2016,7,30,0,0,0));
        item1.setExercise_sentence("헬로 뤠드 헤얼 미스터 펄크");
        exerciseDatas.add(0,item1);

        StoredExerciseList item2 = new StoredExerciseList();
        item2.setSection(1);
        item2.setDate(Date.UTC(2016,8,01,0,0,0));
        item2.setExercise_sentence("헬로 롱 헤얼 미스 코우");
        exerciseDatas.add(1,item2);

        StoredExerciseList item3 = new StoredExerciseList();
        item3.setSection(2);
        item3.setDate(Date.UTC(2016,8,02,0,0,0));
        item3.setExercise_sentence("앤 아이엠 사이몬 전");
        exerciseDatas.add(2,item3);

        StoredExerciseList item4 = new StoredExerciseList();
        item4.setSection(3);
        item4.setDate(Date.UTC(2016,7,31,0,0,0));
        item4.setExercise_sentence("이즈 데얼 애니원 엘스");
        exerciseDatas.add(3,item4);


        adapter = new StoredExerciseCustomAdapter(getActivity().getApplicationContext(), exerciseDatas);
        listview = (ListView) rootView.findViewById(R.id.hclist1);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if(id == 0){ // 받아쓰기 뷰 확인위해 여기에 연결
                    startFragment(getFragmentManager(), DictationFragment.class);
                }
                if(id == 1){ // 말하기 뷰 확인위해 여기에 연결
                    startFragment(getFragmentManager(), PronunciationFragment.class);
                }
                if(id == 2){
                    Toast.makeText(getActivity().getApplicationContext(), "3번 리스트 터치", Toast.LENGTH_SHORT).show();
                }
                if(id == 3){
                    Toast.makeText(getActivity().getApplicationContext(), "4번 리스트 터치", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;

    }
}
