package vn.edu.usth.newsreader;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Video2Fragment extends Fragment {

    public Video2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_video2, container, false);
        View view = inflater.inflate(R.layout.fragment_video2, container, false);
        view.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), vid2_detailActivity.class);
            startActivity(intent);
        });
        return view;
    }
}