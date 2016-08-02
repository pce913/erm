package com.brave.blank.erm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.brave.blank.erm.Consonant_Vowel.Consonant_VowelFragment;

import java.util.ArrayList;

/**
 * Created by jeonyongjin on 2016. 7. 27..
 */

// 배우기 탭 page 3
public class LearningFragment extends BaseFragment {
    ArrayList<String> learninglist = new ArrayList<String>();
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        learninglist.add("소리내기");
        learninglist.add("자음/모음");
        learninglist.add("1음절");
        learninglist.add("단어");
        learninglist.add("문장");

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_learning,container,false);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.simple1, learninglist);
        listView= (ListView) rootView.findViewById(R.id.listView1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //임시로 toast발생시키게 처리 액티비티 이어줄때 각 조건에 해당하는 위치에 인텐트 발생시키도록 넣어주면 됨
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id == 0){                       //소리내기로 이동.
                    startFragment(getFragmentManager(), NoiseTestFragment.class);
                    Toast.makeText(getActivity().getApplicationContext(),"소리내기 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 1) {
                    startFragment(getFragmentManager(), Consonant_VowelFragment.class);
                }
                else if(id == 2){
                    Toast.makeText(getActivity().getApplicationContext(),"1음절 터치됨",Toast.LENGTH_SHORT).show();
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
