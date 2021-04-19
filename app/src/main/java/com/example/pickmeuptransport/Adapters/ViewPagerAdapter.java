package com.example.pickmeuptransport.Adapters;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {
    private ArrayList<Integer> IMAGES;
    private LayoutInflater inflater;
    private Context context;
    @Override
    public int getCount() {
        return IMAGES.size();
    }

    public Object instantiateItem(ViewGroup view, int position) {
        View cabLayout = inflater.inflate(IMAGES.get(position), view, false);

        view.addView(cabLayout, 0);

        return cabLayout;
    }

    public ViewPagerAdapter(ArrayList<Integer> IMAGES, LayoutInflater inflater, Context context) {
        this.IMAGES = IMAGES;
        this.inflater = inflater;
        this.context = context;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}