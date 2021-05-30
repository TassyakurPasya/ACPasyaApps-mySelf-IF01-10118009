package com.example.tassyakurpasya2.fragments;
//20/05/2021,membuat view pager , 10118009, Tassyakur Pasya, IF01
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tassyakurpasya2.R;
import com.example.tassyakurpasya2.Navigator;
import com.example.tassyakurpasya2.Navigator;

public class PageFragment3 extends Fragment  {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater
                .inflate(R.layout.page3,container
                        ,false);
        ImageView tangan = rootView.findViewById(R.id.tangan);
        tangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tangan(v);
            }
        });


        return rootView;

    }
    public void tangan(View view) {
        Intent intent = new Intent(getActivity(), Navigator.class);
        startActivity(intent);
    }
}
