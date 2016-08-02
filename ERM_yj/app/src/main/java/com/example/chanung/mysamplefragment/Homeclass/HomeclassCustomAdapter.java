package com.example.chanung.mysamplefragment.Homeclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.chanung.mysamplefragment.R;

import java.util.ArrayList;

/**
 * Created by jeonyongjin on 2016. 7. 29..
 */
public class HomeclassCustomAdapter extends BaseAdapter {
    private ArrayList<HomeclassList>listViewItemList = new ArrayList<HomeclassList>();
    private LayoutInflater inflater = null;

    public HomeclassCustomAdapter(Context c, ArrayList<HomeclassList> arr){
        this.listViewItemList = arr;
        inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    };
    public void setItemDatas(ArrayList<HomeclassList> itemDatas){
        this.listViewItemList = itemDatas;
        this.notifyDataSetChanged();
    }
    @Override
    public int getCount(){
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.homeclasslist_item, parent, false);
        }

        TextView dateTextView = (TextView) convertView.findViewById(R.id.date);
        TextView sectionTextView = (TextView) convertView.findViewById(R.id.section);
        Button confirmButton = (Button) convertView.findViewById(R.id.confirm);

        HomeclassList homeclassList = listViewItemList.get(position);

        dateTextView.setText(homeclassList.getDate());
        sectionTextView.setText(homeclassList.getSection());
        confirmButton.setText(homeclassList.getConfirmsubmit());
        return convertView;
    }
}
