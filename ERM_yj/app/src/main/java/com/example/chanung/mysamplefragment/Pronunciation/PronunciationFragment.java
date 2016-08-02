package com.example.chanung.mysamplefragment.Pronunciation;

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
public class PronunciationFragment extends BaseFragment {
    View view;
    RecyclerView pronunciationRecycler;
    RecyclerView.Adapter adapter;
    ArrayList<PronunciationList> pronunciationitems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_pronunciation, container, false);

        pronunciationRecycler = (RecyclerView)view.findViewById(R.id.recycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        pronunciationRecycler.setLayoutManager(layoutManager);
        pronunciationRecycler.setHasFixedSize(true);

        pronunciationitems = new ArrayList<>();
        PronunciationList item = new PronunciationList();
        item.setPronunciation_date(Date.UTC(2016,8,01,00,00,00));
        item.setp_Teacher_id(1234567);
        item.setPronunciation_answer("니돈이 내돈");
        item.setPronunciation_answer_rate(90);
        item.setPronunciation_playnum(5);
        pronunciationitems.add(0,item);

        adapter = new PronunciationRecyclerAdapter(pronunciationitems, getActivity(),R.layout.pronunciationlist_item);
        pronunciationRecycler.setAdapter(adapter);
        return view;
    }
}
