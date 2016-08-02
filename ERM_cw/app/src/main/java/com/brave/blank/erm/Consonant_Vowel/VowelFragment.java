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

//자음모음(모음 클릭) page 10
public class VowelFragment extends BaseFragment {
    GridView gridView;
    ArrayList<String> voweldata = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        voweldata.add("ㅏ");
        voweldata.add("ㅑ");
        voweldata.add("ㅓ");
        voweldata.add("ㅕ");
        voweldata.add("ㅗ");
        voweldata.add("ㅛ");
        voweldata.add("ㅜ");
        voweldata.add("ㅠ");
        voweldata.add("ㅡ");
        voweldata.add("ㅣ");
        voweldata.add("ㅐ");
        voweldata.add("ㅒ");
        voweldata.add("ㅔ");
        voweldata.add("ㅖ");
        voweldata.add("ㅘ");
        voweldata.add("ㅚ");
        voweldata.add("ㅙ");
        voweldata.add("ㅝ");
        voweldata.add("ㅟ");
        voweldata.add("ㅞ");
        voweldata.add("ㅢ");
        voweldata.add("");
        voweldata.add("");
        voweldata.add("");
        voweldata.add("");

        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_vowel,container,false);
        gridView= (GridView)rootView.findViewById(R.id.gridView1);
        gridView.setAdapter(new gridAdapter());
        return rootView;
    }
    public class gridAdapter extends BaseAdapter {
        LayoutInflater inf;

        public gridAdapter(){
            inf = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount(){return voweldata.size();}
        @Override
        public Object getItem(int position){return voweldata.get(position);}
        @Override
        public long getItemId(int position){return position;}
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null){
                convertView = inf.inflate(R.layout.item,parent, false);
            }
            TextView textView = (TextView)convertView.findViewById(R.id.consonant);
            textView.setText(voweldata.get(position));
            return convertView;
        }
    }

}
