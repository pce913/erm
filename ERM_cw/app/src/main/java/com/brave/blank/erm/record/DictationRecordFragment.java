package com.brave.blank.erm.record;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brave.blank.erm.BaseFragment;
import com.brave.blank.erm.R;

import java.util.ArrayList;

public class DictationRecordFragment extends BaseFragment {
    View view;
    RecyclerView recordRecycler;
    RecyclerView.Adapter adapter;
    ArrayList<List_item_dictation> lists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_dictation_record, container, false);

        recordRecycler = (RecyclerView)view.findViewById(R.id.recycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recordRecycler.setLayoutManager(layoutManager);
        recordRecycler.setHasFixedSize(true);

        Log.i("MyTag", "recycler2");

        lists = new ArrayList<>();

        List_item_dictation[] item = new List_item_dictation[10];

        for (int i = 0; i < 10; i++)
            item[i] = new List_item_dictation("2016년 7월 24일", "선생님 ID", "사당역 탐앤탐스", "80", "5");

        for (int i = 0; i < 10; i++)
            lists.add(item[i]);

        adapter = new RecyclerAdapter_dic(lists, getActivity(), R.layout.dictation_item);
        recordRecycler.setAdapter(adapter);

        return view;
    }
}
