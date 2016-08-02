package com.example.chanung.mysamplefragment.Dictation;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chanung.mysamplefragment.BaseFragment;
import com.example.chanung.mysamplefragment.R;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by jeonyongjin on 2016. 8. 2..
 */
public class DictationFragment extends BaseFragment {
    View view;
    RecyclerView dictationRecycler;
    RecyclerView.Adapter adapter;
    ArrayList<DictationList> dictationitems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_dictation, container, false);

        dictationRecycler = (RecyclerView)view.findViewById(R.id.recycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        dictationRecycler.setLayoutManager(layoutManager);
        dictationRecycler.setHasFixedSize(true);

        dictationitems = new ArrayList<>();
        DictationList item = new DictationList();
        item.setDictation_date(Date.UTC(2016,8,01,00,00,00));
        item.setTeacher_id(1111111);
        item.setDictation_answer("커피앤 도넛");
        item.setSubmit_answer("코피앤 도우너");
        item.setDictation_answer_rate(80);
        item.setDictation_playnum(7);
        dictationitems.add(0,item);

        adapter = new DictationRecyclerAdapter(dictationitems, getActivity(),R.layout.dictationlist_item);
        dictationRecycler.setAdapter(adapter);
        return view;
    }
}
