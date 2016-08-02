package com.example.chanung.mysamplefragment;

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
public class SayingwordsFragment extends BaseFragment {
    ArrayList<String> wordlist = new ArrayList<String>();
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        wordlist.add("가족");
        wordlist.add("채소/과일");
        wordlist.add("동물");
        wordlist.add("고민주");
        wordlist.add("사물");

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_sayingwords,container,false);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.simple1, wordlist);
        listView= (ListView) rootView.findViewById(R.id.listView1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //임시로 toast발생시키게 처리 액티비티 이어줄때 각 조건에 해당하는 위치에 인텐트 발생시키도록 넣어주면 됨
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id == 0){
                    Toast.makeText(getActivity().getApplicationContext(),"가족 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 1) {
                    Toast.makeText(getActivity().getApplicationContext(),"채소/과일 터치됨", Toast.LENGTH_SHORT).show();;
                }
                else if(id == 2){
                    Toast.makeText(getActivity().getApplicationContext(),"동물 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 3){
                    Toast.makeText(getActivity().getApplicationContext(),"고민주 처치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 4){
                    Toast.makeText(getActivity().getApplicationContext(),"사물 터치됨",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;
    }
}
