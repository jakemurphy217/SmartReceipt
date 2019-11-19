package com.example.smartreceipt;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PageAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> mFragmentList;
    ArrayList<String> mFragmentTitleList;

    PageAdapter(FragmentManager fmng)
    {
        super(fmng);
        mFragmentList = new ArrayList<>();
        mFragmentTitleList = new ArrayList<>();

    }


    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment,String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    // precaution for androidx
    //tabs not displaying text android 9+
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}
