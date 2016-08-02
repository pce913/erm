package com.brave.blank.erm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by jeonyongjin on 2016. 7. 30..
 */

//문장 page 16
public class SayingsentenceFragment extends BaseFragment {
    ArrayList<String> sentencelist = new ArrayList<String>();
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        sentencelist.add("인사");
        sentencelist.add("감정 표현");
        sentencelist.add("쇼핑");
        sentencelist.add("일상");

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_sayingsentence,container,false);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.simple1, sentencelist);
        listView= (ListView) rootView.findViewById(R.id.listView2);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //임시로 toast발생시키게 처리 액티비티 이어줄때 각 조건에 해당하는 위치에 인텐트 발생시키도록 넣어주면 됨
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id == 0){
                    Toast.makeText(getActivity().getApplicationContext(),"인사 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 1) {
                    Toast.makeText(getActivity().getApplicationContext(),"감정표현 터치됨", Toast.LENGTH_SHORT).show();;
                }
                else if(id == 2){
                    Toast.makeText(getActivity().getApplicationContext(),"쇼핑 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 3){
                    Toast.makeText(getActivity().getApplicationContext(),"일상 터치됨",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;
    }
}
