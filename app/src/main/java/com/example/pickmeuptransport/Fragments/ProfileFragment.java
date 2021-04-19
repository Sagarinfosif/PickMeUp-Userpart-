package com.example.pickmeuptransport.Fragments;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pickmeuptransport.R;
import com.hbb20.CountryCodePicker;

public class ProfileFragment extends Fragment{

    private CountryCodePicker ccp;
    private View view;
    private EditText edmobilenumber;
    private TextView heading;
    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_profile, container, false);
        ids();
        setup();
//        setFont();

        return view;
    }

    private void setup() {
        heading.setText("Profile");
    }

    private void ids() {
        heading=view.findViewById(R.id.heading);
        edmobilenumber = view.findViewById(R.id.edmobilenumber);
        edmobilenumber.setEnabled(false);
        ccp = view.findViewById(R.id.ccp);
        ccp.setEnabled(false);
        ccp.registerCarrierNumberEditText(edmobilenumber);
    }

    private void setFont() {
        Typeface custom_font = Typeface.createFromAsset(getActivity().getAssets(), "font/gruppo_regular.ttf");
        ccp.setTypeFace(custom_font);
    }
}