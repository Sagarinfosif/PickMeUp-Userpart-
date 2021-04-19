package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.example.pickmeuptransport.R;

public class TripCheckFragment extends Fragment {

    private View view;
    private TextView heading;
    private Switch trip_check_switch;

    public TripCheckFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_trip_check, container, false);
        ids();
        setup();
        return view;
    }

    private void setup() {
        heading.setText("Trip Check");
        trip_check_switch.setVisibility(View.VISIBLE);
    }

    private void ids() {
        heading=view.findViewById(R.id.heading);
        trip_check_switch=view.findViewById(R.id.trip_check_switch);
    }
}