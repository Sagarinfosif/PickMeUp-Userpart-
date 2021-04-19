package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pickmeuptransport.R;

public class TripDetailFragment extends Fragment {

    private View view;
    private TextView heading;

    public TripDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_trip_detail, container, false);
        ids();
        setups();
        return view;
    }

    private void setups() {
        heading.setText("Trip Details");
    }

    private void ids() {
        heading=view.findViewById(R.id.heading);
    }
}