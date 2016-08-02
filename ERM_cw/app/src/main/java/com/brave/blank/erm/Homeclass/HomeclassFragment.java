package com.brave.blank.erm.Homeclass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.brave.blank.erm.BaseFragment;
import com.brave.blank.erm.R;

import java.util.ArrayList;

/**
 * Created by chanung on 2016-07-31.
 */
public class HomeclassFragment extends BaseFragment {
    private ArrayList<HomeclassList> itemDatas = null;
    ListView listview;
    HomeclassCustomAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_homeclass, container, false);

        itemDatas = new ArrayList<HomeclassList>();

        HomeclassList item1 = new HomeclassList();
        item1.setDate("2016.07.30");
        item1.setSection(1);
        item1.setButtonText(false);
        itemDatas.add(0,item1);

        HomeclassList item2 = new HomeclassList();
        item2.setDate("2016.07.30");
        item2.setSection(0);
        item2.setButtonText(true);
        itemDatas.add(1,item2);

        HomeclassList item3 = new HomeclassList();
        item3.setDate("2016.07.30");
        item3.setSection(1);
        item3.setButtonText(true);
        itemDatas.add(2,item3);

        adapter = new HomeclassCustomAdapter(getActivity().getApplicationContext(), itemDatas);
        listview = (ListView) rootView.findViewById(R.id.hclist1);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if(id == 0){
                    Toast.makeText(getActivity().getApplicationContext(), "1번 리스트 터치", Toast.LENGTH_SHORT).show();
                }
                if(id == 1){
                    Toast.makeText(getActivity().getApplicationContext(), "2번 리스트 터치", Toast.LENGTH_SHORT).show();
                }
                if(id == 2){
                    Toast.makeText(getActivity().getApplicationContext(), "3번 리스트 터치", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;

    }
}
