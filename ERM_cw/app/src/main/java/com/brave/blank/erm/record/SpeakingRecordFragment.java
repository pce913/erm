package com.brave.blank.erm.record;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brave.blank.erm.BaseFragment;
import com.brave.blank.erm.R;

import java.util.ArrayList;

/**
 * Created by IT on 2016-07-24.
 */
public class SpeakingRecordFragment extends BaseFragment {
    View view;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<List_item_speaking> lists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_speaking_record, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycle_speaking);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        lists = new ArrayList<>();

        List_item_speaking[] item = new List_item_speaking[10];

        for (int i = 0; i < 10; i++)
            item[i] = new List_item_speaking("2016년 7월 24일", "선생님 ID", "식사는 하셨나요?", "5", "40");

        for (int i = 0; i < 10; i++)
            lists.add(item[i]);

        adapter = new RecyclerAdapter_spk(lists, getActivity(), R.layout.speaking_item);
        recyclerView.setAdapter(adapter);


        return view;
    }
}
