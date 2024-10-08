package vn.edu.usth.newsreader.qngoc_place;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.edu.usth.newsreader.R;


public class VideoFragment extends Fragment {



    public VideoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_video, container, false);
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        // Load Video1Fragment
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.video1_fragment, new Video1Fragment()); // Use container for fragment 1
        transaction.replace(R.id.video2_fragment, new Video2Fragment()); // Use container for fragment 2
        transaction.commit();

        return view;
    }
}