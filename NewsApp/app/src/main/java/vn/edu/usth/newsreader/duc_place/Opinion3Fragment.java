package vn.edu.usth.newsreader.duc_place;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.edu.usth.newsreader.R;


public class Opinion3Fragment extends Fragment {


    public Opinion3Fragment() {
        // Required empty public constructor
    }




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_opinion3, container, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Opinion3_detailActivity.class);
                startActivity(intent);
            }
        });
        return view;

        //return inflater.inflate(R.layout.fragment_opinion3, container, false);
    }
}