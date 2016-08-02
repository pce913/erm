package com.example.chanung.mysamplefragment.FinalConsonant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.chanung.mysamplefragment.BaseFragment;
import com.example.chanung.mysamplefragment.R;

import java.util.ArrayList;

/**
 * Created by jeonyongjin on 2016. 8. 1..
 */
public class FinalConsonantFragment extends BaseFragment {
    ArrayList<String> finalconsonantlist = new ArrayList<String>();
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        finalconsonantlist.add("ㄱ(ㄱ,ㄲ,ㅋ,ㄱㅅ,ㄹㄱ 등)");
        finalconsonantlist.add("ㄴ(ㄴ, ㄴㅈ, ㄴㅎ 등)");
        finalconsonantlist.add("ㄷ(ㄷ, ㅅ, ㅆ, ㅈ, ㅊ, ㅌ 등)");
        finalconsonantlist.add("ㄹ(ㄹ, ㄹㄱ, ㄹㅁ, ㄹㅂ, ㄹㅅ, ㄹㅌ, ㄹㅎ 등)");
        finalconsonantlist.add("ㅁ(ㅁ, ㄹㅁ, ㄹㅂ 등)");
        finalconsonantlist.add("ㅂ(ㅂ, ㄹㅂ, ㄹㅍ, ㅂㅅ 등)");
        finalconsonantlist.add("ㅇ(ㅇ 등)");

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_finalconsonant,container,false);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.simple1, finalconsonantlist);
        listView= (ListView) rootView.findViewById(R.id.finalconsonantlist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //임시로 toast발생시키게 처리 액티비티 이어줄때 각 조건에 해당하는 위치에 인텐트 발생시키도록 넣어주면 됨
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id == 0){
                    Toast.makeText(getActivity().getApplicationContext(),"ㄱ받침 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 1) {
                    Toast.makeText(getActivity().getApplicationContext(),"ㄴ받침 터치됨", Toast.LENGTH_SHORT).show();;
                }
                else if(id == 2){
                    Toast.makeText(getActivity().getApplicationContext(),"ㄷ받침 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 3){
                    Toast.makeText(getActivity().getApplicationContext(),"ㄹ받침 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 4){
                    Toast.makeText(getActivity().getApplicationContext(),"ㅁ받침 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 5){
                    Toast.makeText(getActivity().getApplicationContext(),"ㅂ받침 터치됨",Toast.LENGTH_SHORT).show();
                }
                else if(id == 6){
                    Toast.makeText(getActivity().getApplicationContext(),"ㅇ받침 터치됨",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;
    }


}
