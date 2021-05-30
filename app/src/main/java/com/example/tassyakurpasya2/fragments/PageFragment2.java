package com.example.tassyakurpasya2.fragments;
//20/05/2021,membuat view pager , 10118009, Tassyakur Pasya, IF01
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tassyakurpasya2.R;

public class PageFragment2 extends Fragment  {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater
                .inflate(R.layout.page2,container
                        ,false);



        return rootView;

    }
}
