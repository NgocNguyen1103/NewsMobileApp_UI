package vn.edu.usth.newsreader.duy_place;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.edu.usth.newsreader.R;

public class HotNewsFragment extends Fragment {


    public HotNewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotnews, container, false);
        FootBallFragment footballNewsFragment = new FootBallFragment();
        ChessFragment chessNewsFragment = new ChessFragment();
        LolFragment lolNewsFragment = new LolFragment();

        // Thêm fragment bóng đá vào FragmentContainerView
        getChildFragmentManager().beginTransaction()
                .replace(R.id.fragment_football, footballNewsFragment)
                .commit();

        // Thêm fragment cờ vua vào FragmentContainerView
        getChildFragmentManager().beginTransaction()
                .replace(R.id.fragment_chess, chessNewsFragment)
                .commit();

        // Thêm fragment liên minh vào FragmentContainerView
        getChildFragmentManager().beginTransaction()
                .replace(R.id.fragment_lol, lolNewsFragment)
                .commit();
        //return inflater.inflate(R.layout.fragment_hotnews, container, false);
        return view;

    }
}