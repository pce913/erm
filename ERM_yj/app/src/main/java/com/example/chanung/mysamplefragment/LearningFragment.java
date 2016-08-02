package com.example.chanung.mysamplefragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.chanung.mysamplefragment.Consonant_VowelFragment.Consonant_VowelFragment;
import com.example.chanung.mysamplefragment.FinalConsonant.FinalConsonantFragment;
import com.example.chanung.mysamplefragment.StoredExercise.StoredExerciseFragment;

import java.util.ArrayList;

/**
 * Created by jeonyongjin on 2016. 7. 27..
 */
public class LearningFragment extends BaseFragment {
    ArrayList<String> learninglist = new ArrayList<String>();
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        learninglist.add("1. 소리내기");
        learninglist.add("2. 자음/모음");
        learninglist.add("3. 받침");
        learninglist.add("4. 단어");
        learninglist.add("5. 문장");

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_learning,container,false);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.simple1, learninglist);
        listView= (ListView) rootView.findViewById(R.id.listView1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //임시로 toast발생시키게 처리 액티비티 이어줄때 각 조건에 해당하는 위치에 인텐트 발생시키도록 넣어주면 됨
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id == 0){
                    //저장한 학습내용 에뮬을 통해서 확인하기 위해 소리내기 리스트에 연결하여 확인
                    startFragment(getFragmentManager(), StoredExerciseFragment.class);
                }
                else if(id == 1) {
                    startFragment(getFragmentManager(), Consonant_VowelFragment.class);
                }
                else if(id == 2){
                    startFragment(getFragmentManager(), FinalConsonantFragment.class);
                }
                else if(id == 3){
                    startFragment(getFragmentManager(),SayingwordsFragment.class);
                }
                else if(id == 4){
                    startFragment(getFragmentManager(),SayingsentenceFragment.class);
                }
            }
        });
        return rootView;
    }
}
