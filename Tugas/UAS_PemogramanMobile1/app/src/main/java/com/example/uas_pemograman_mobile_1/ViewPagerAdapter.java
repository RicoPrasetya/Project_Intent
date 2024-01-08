package com.example.uas_pemograman_mobile_1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Action();
            case 1:
                return new Romance();
            case 2:
                return new Comedy();

            default: return new Action();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
