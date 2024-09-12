package vn.edu.usth.newsreader.qngoc_place;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.newsreader.R;
import vn.edu.usth.newsreader.duc_place.OpinionFragment;
import vn.edu.usth.newsreader.duy_place.HotNewsFragment;


public class HomeFragment extends Fragment {



    private ViewPager viewPager;
    private TabLayout tabLayout;
    public HomeFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize ViewPager and TabLayout
        viewPager = view.findViewById(R.id.view_pager);
        tabLayout = view.findViewById(R.id.tab_layout);

        // Set up the adapter and bind it with ViewPager
        HomePagerAdapter pagerAdapter = new HomePagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        // Bind ViewPager with TabLayout
        tabLayout.setupWithViewPager(viewPager);

        return view;
        // Inflate the layout for this fragment
//
//        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    public class HomePagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 2;
        private final String[] titles = new String[]{"First", "Second"};

        public HomePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @NonNull
        @Override
        public Fragment getItem(int page) {
            switch (page) {
                case 0:
                    return new HotNewsFragment();  // Replace with appropriate fragment for each tab
                case 1:
                    return new OpinionFragment();
                default:
                    return new HotNewsFragment();

            }
        }
        public CharSequence getPageTitle(int page) {
            // returns a tab title corresponding to the specified page
            return titles[page];
        }
    }

}