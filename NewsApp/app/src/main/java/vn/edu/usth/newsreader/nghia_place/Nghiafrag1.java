package vn.edu.usth.newsreader.nghia_place;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import vn.edu.usth.newsreader.R;


public class Nghiafrag1 extends Fragment {


    public Nghiafrag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_nghiafrag1, container, false);
        View view = inflater.inflate(R.layout.fragment_nghiafrag1, container, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Nghia1Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}