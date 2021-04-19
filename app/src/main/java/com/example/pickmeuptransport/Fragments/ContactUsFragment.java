package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pickmeuptransport.R;

public class ContactUsFragment extends Fragment {

    private View view;
    private TextView heading;

    public ContactUsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_contact_us, container, false);
        ids();
        setup();
        return view;
    }

    private void setup() {
    heading.setText("Contact Us");
    }

    private void ids() {
    heading=view.findViewById(R.id.heading);
    }
}