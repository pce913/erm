package com.example.chanung.mysamplefragment.Consonant_VowelFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.chanung.mysamplefragment.BaseFragment;
import com.example.chanung.mysamplefragment.R;

import java.util.ArrayList;

/**
 * Created by jeonyongjin on 2016. 7. 29..
 */
public class Consonant_VowelFragment extends BaseFragment {
    ArrayList<String> c_vlist = new ArrayList<String>();
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        c_vlist.add("자음");
        c_vlist.add("모음");

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_consonant_vowel,container,false);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.simple, c_vlist);
        listView= (ListView) rootView.findViewById(R.id.listView3);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //임시로 toast발생시키게 처리 액티비티 이어줄때 각 조건에 해당하는 위치에 인텐트 발생시키도록 넣어주면 됨
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id == 0){
                    startFragment(getFragmentManager(), ConsonantFragment.class);
                }
                else if(id == 1) {
                    startFragment(getFragmentManager(), VowelFragment.class);
                }
            }
        });
        return rootView;
    }
}
