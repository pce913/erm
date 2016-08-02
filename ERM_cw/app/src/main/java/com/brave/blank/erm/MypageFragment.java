package com.brave.blank.erm;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

/**
 * Created by chanung on 2016-07-28.
 */
public class MypageFragment extends BaseFragment {

    private static final int PICK_FROM_GALLERY = 1;
    Button gallery;
    ImageView userImg;
    Spinner selectschool;

    View view;
    @Override



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mypage, container, false);
        selectschool = (Spinner)view.findViewById(R.id.sch);
        userImg = (ImageView)view.findViewById(R.id.userimg);

        // 갤러리에서 이미지 불러오기
        gallery = (Button)view.findViewById(R.id.gallerybtn);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                // Gallery 호출
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                // 잘라내기 셋팅
                intent.putExtra("crop", "true");
                intent.putExtra("aspectX", 0);
                intent.putExtra("aspectY", 0);
                intent.putExtra("outputX", 200);
                intent.putExtra("outputY", 150);
                try {
                    intent.putExtra("return-data", true);
                    startActivityForResult(Intent.createChooser(intent,
                            "Complete action using"), PICK_FROM_GALLERY);
                } catch (ActivityNotFoundException e) {
                    // Do nothing for now
                }
            }
        });

        // 학교 선택하는 스피너
        ToolbarActivity activity=(ToolbarActivity)getActivity();
        ArrayAdapter pAdapter = ArrayAdapter.createFromResource(activity, R.array.sch, android.R.layout.simple_spinner_item);             //getActivity로 가져오기
        pAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        selectschool.setAdapter(pAdapter);

        return view;
    }

    public void onActivityResult(int requestCode,                                          //문제가 있을 수 있는 코드
                                 int resultCode,
                                 Intent data) {

        if (requestCode == PICK_FROM_GALLERY) {
            Bundle extras2 = data.getExtras();
            if (extras2 != null) {
                Bitmap photo = extras2.getParcelable("data");
                userImg.setImageBitmap(photo);
            }
        }
    }
}
