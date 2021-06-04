package com.example.tassyakurpasya2;
//22/05/2021,membuat navigator musik dan video, 10118009, Tassyakur Pasya, IF01
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MusikVIdeoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MusikVIdeoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MusikVIdeoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MusikVIdeoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusikVIdeoFragment newInstance(String param1, String param2) {
        MusikVIdeoFragment fragment = new MusikVIdeoFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_musikvideo, container, false);

        final FragmentActivity fragment = getActivity();
        //final RecyclerView recyclerViewVideo = view.findViewById(R.id.recyleviewfvideo);
        final RecyclerView recyclerViewMusik = view.findViewById(R.id.recyleviewfmusik);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(fragment, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(fragment, LinearLayoutManager.VERTICAL, false);
        //recyclerViewVideo.setLayoutManager(layoutManager);
        recyclerViewMusik.setLayoutManager(layoutManager2);

        //String[] vidoe = {
        //        R.ra
        //};
        //int[] foto_profile = {

          //      R.drawable.ihsan, R.drawable.seno, R.drawable.dian
        //};
        String[] judul_lagu_fav = {
                "Different Heaven - Safe And Sound", "Weeekly(위클리) _ After School",
                "Andai Aku Bisa - Erwin Gutawa Orchestra, Tulus", "Armada - Aku Di Matamu", "Lisa - Gurenge",
                "Vickeblanka / 『Black Catcher』", "IU(아이유)_Coin",
                "IU(아이유) _ Blueming(블루밍)", "Sammy Simorangkir - Dia",
                "Letto - Hapuskan keluhanmu"
        };
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    final adaptermusikfav adapter2 = new adaptermusikfav(fragment,judul_lagu_fav);
//                    fragment.runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            recyclerViewMusik.setAdapter(adapter2);
//                        }
//
//                    });
//                }
//            }).start();
        return view;
    }
    
}