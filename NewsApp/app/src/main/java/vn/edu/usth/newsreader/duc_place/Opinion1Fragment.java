package vn.edu.usth.newsreader.duc_place;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.edu.usth.newsreader.R;


public class Opinion1Fragment extends Fragment {


    public Opinion1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_opinion1, container, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Opinion1_detailActivity.class);
                startActivity(intent);
            }
        });
        return view;

        //return inflater.inflate(R.layout.fragment_opinion1, container, false);
    }
}