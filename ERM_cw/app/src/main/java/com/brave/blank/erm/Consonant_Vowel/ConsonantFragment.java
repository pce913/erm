package com.brave.blank.erm.Consonant_Vowel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.brave.blank.erm.BaseFragment;
import com.brave.blank.erm.R;

import java.util.ArrayList;

/**
 * Created by jeonyongjin on 2016. 7. 30..
 */

//자음모음(자음클릭) page 9
public class ConsonantFragment extends BaseFragment {
    GridView gridview;
    ArrayList<String> consonantdata = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        consonantdata.add("ㄱ");
        consonantdata.add("ㄴ");
        consonantdata.add("ㄷ");
        consonantdata.add("ㄹ");
        consonantdata.add("ㅁ");
        consonantdata.add("ㅂ");
        consonantdata.add("ㅅ");
        consonantdata.add("ㅇ");
        consonantdata.add("ㅈ");
        consonantdata.add("ㅊ");
        consonantdata.add("ㅌ");
        consonantdata.add("ㅋ");
        consonantdata.add("ㅍ");
        consonantdata.add("ㅎ");
        consonantdata.add("");

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_consonant,container,false);
        gridview = (GridView)rootView.findViewById(R.id.gridView1);
        gridview.setAdapter(new gridAdapter());
        return rootView;
    }
    public class gridAdapter extends BaseAdapter{
        LayoutInflater inf;

        public gridAdapter(){
            inf = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount(){return consonantdata.size();}
        @Override
        public Object getItem(int position){return consonantdata.get(position);}
        @Override
        public long getItemId(int position){return position;}
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null){
                convertView = inf.inflate(R.layout.item,parent, false);
            }
            TextView textView = (TextView)convertView.findViewById(R.id.consonant);
            textView.setText(consonantdata.get(position));
            return convertView;
        }
    }


}
