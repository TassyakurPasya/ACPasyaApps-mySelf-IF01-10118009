package com.example.tassyakurpasya2;
//31/05/2021,membuat navigator daily, 10118009, Tassyakur Pasya, IF01
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_daily, container, false);
        final FragmentActivity fragment = getActivity();
        final FragmentActivity fragment2 = getActivity();
        final RecyclerView recyclerView = view.findViewById(R.id.recyleviewfl);
        final RecyclerView recyclerView2 = view.findViewById(R.id.recyleviewf2);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(fragment2, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(fragment, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView2.setLayoutManager(layoutManager2);

        // Inflate the layout for this fragment

        //friendlist
        String[] nama = {
                "Muhammad Ihsan", "Fatahilla Satria Bima Seno", "Dian Rosa Pratama"
        };
        int[] foto_profile = {

                R.drawable.ihsan, R.drawable.seno, R.drawable.dian
        };

        //activity
        String[] aktivitas = {
                "Bermain Game", "Jalan-jalan", "Kuliah", "Pantai"
        };
        int[] gambaract = {
                R.drawable.ic_videogame, R.drawable.ic_train, R.drawable.ic_tugas, R.drawable.ic_laut
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                    final dailyadapterfl adapter = new dailyadapterfl(fragment,foto_profile,nama);
                    fragment.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView.setAdapter(adapter);
                    }
                });
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                    final dailyadapteract adapter = new dailyadapteract(fragment2,gambaract,aktivitas);
                    fragment2.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView2.setAdapter(adapter);
                    }
                });
            }
        });
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Daily Activity");
    }
}